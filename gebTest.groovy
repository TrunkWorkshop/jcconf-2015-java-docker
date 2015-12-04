@Grab('org.gebish:geb-core:0.12.2')
@Grab('org.seleniumhq.selenium:selenium-remote-driver:2.48.2')
import geb.Browser
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver

URL url = new URL("http://192.168.99.100:4444/wd/hub")

b = new Browser(driver: new RemoteWebDriver(url, DesiredCapabilities.firefox()))

b.go('http://google.com/')

form = b.$('form#tsf')

form.q = 'jcconf 2015'

form.btnK().click()

