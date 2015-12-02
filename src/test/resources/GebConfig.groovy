/*
	This is the Geb configuration file.

	See: http://www.gebish.org/manual/current/#configuration
*/


import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.phantomjs.PhantomJSDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver

waiting {
	timeout = 2
}

environments {

	// run via “./gradlew chromeTest”
	// See: http://code.google.com/p/selenium/wiki/ChromeDriver
	chrome {
		driver = { new ChromeDriver() }
	}

	// run via “./gradlew firefoxTest”
	// See: http://code.google.com/p/selenium/wiki/FirefoxDriver
	firefox {
		driver = {
			DesiredCapabilities capabilities = DesiredCapabilities.firefox()
			def ip = System.env.JCCONF_CLIENT_PORT_4444_TCP_ADDR ?: 'localhost'
			def port = System.env.JCCONF_CLIENT_PORT_4444_TCP_PORT ?: '4444'

			if(ip == 'localhost') {
				new FirefoxDriver()
			} else {
				URL url = new URL("http://$ip:$port/wd/hub")
				new RemoteWebDriver(url, capabilities)
			}

		}

	}

    phantomJs {
        driver = { new PhantomJSDriver() }
    }

}

// To run the tests with all browsers just run “./gradlew test”

baseUrl = "http://gebish.org"
