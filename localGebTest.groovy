@Grab('org.gebish:geb-core:0.12.2')
@Grab('org.seleniumhq.selenium:selenium-firefox-driver:2.48.2')
import geb.Browser

b = new Browser()

b.go('http://google.com/')

form = b.$('form#tsf')

form.q = 'jcconf 2015'

form.btnK().click()

