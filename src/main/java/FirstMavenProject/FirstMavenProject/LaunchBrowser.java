package FirstMavenProject.FirstMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser 
{
	public WebDriver driver;
	
	public WebDriver selectBrowser(String browser)
	{
		browser=browser.toLowerCase();
		switch(browser)
		{
		case "firefox" :
			System.setProperty("webdriver.gecko.driver", "driver//geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "chrome" : 
			System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "ie" : 
			System.setProperty("webdriver.ie.driver", "driver//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		default :System.out.println("invalid type");
		System.exit(0); break;
		}
		return driver;
	}
}
