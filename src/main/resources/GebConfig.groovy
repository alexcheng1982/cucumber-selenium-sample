import org.openqa.selenium.firefox.FirefoxDriver
 
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver
 
// default is to use firefox
driver = { new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.firefox()) }
