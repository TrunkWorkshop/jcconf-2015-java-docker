/*
	This is the Geb configuration file.
	See: http://www.gebish.org/manual/current/#configuration
*/

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver

waiting {
	timeout = 2
}

def host = System.env.JCCONF_CLIENT_PORT_4444_TCP_ADDR ?: 'localhost'
def port = System.env.JCCONF_CLIENT_PORT_4444_TCP_PORT ?: '4444'
URL url = new URL("http://$host:$port/wd/hub")

environments {

	chrome {
		driver = { new ChromeDriver() }
	}

	firefox {
		driver = { new FirefoxDriver() }
	}

	remoteFirefox {
		driver = {
			new RemoteWebDriver(url, DesiredCapabilities.firefox())
		}
	}

	remoteChrome {
		driver = {
			new RemoteWebDriver(url, DesiredCapabilities.chrome())
		}
	}
}

baseUrl = "http://gebish.org"
