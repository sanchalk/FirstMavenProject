package FirstMavenProject.FirstMavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utility.Constant;

public class CreateTask 
{
	WebDriver driver;	
	
	@BeforeMethod
	public void setup()
	{
		LaunchBrowser launchbrowser = new LaunchBrowser();
		driver=launchbrowser.selectBrowser(Constant.browsername);
		driver.get(Constant.baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}	

	@Test(description="create Task")
	public void Test1()
	{
		LoginPage loginpage = new LoginPage(driver);
		String val= loginpage.validLogin("admin", "manager");
		Assert.assertTrue(val.contains("Enter"),"fail to login");
		HomePage homepage = new HomePage(driver);
		homepage.timeTrackMenu();
		TimeTrackPage timetrackpage = new TimeTrackPage(driver);
		timetrackpage.selectMonth(Constant.month, Constant.date);
		timetrackpage.selectUser(Constant.username);
		timetrackpage.createTask("Accounting", "2.0");
		String res=timetrackpage.submit();
		Assert.assertTrue(res.contains("saved"),"fail to create task");
	}
	
	@Test(description="create Task")
	public void Test2()
	{
		LoginPage loginpage = new LoginPage(driver);
		String val= loginpage.validLogin("admin", "manager");
		Assert.assertTrue(val.contains("Enter"),"fail to login");
		HomePage homepage = new HomePage(driver);
		homepage.timeTrackMenu();
		TimeTrackPage timetrackpage = new TimeTrackPage(driver);
		timetrackpage.selectMonth(Constant.month, Constant.date);
		timetrackpage.selectUser(Constant.username);
		timetrackpage.createTask("Budget updates", "2.0");
		String res=timetrackpage.submit();
		Assert.assertTrue(res.contains("saved"),"fail to create task");
	}
	
	@Test(description="create Task")
	public void Test4()
	{
		LoginPage loginpage = new LoginPage(driver);
		String val= loginpage.validLogin("admin", "manager");
		Assert.assertTrue(val.contains("Enter"),"fail to login");
		HomePage homepage = new HomePage(driver);
		homepage.timeTrackMenu();
		TimeTrackPage timetrackpage = new TimeTrackPage(driver);
		timetrackpage.selectMonth(Constant.month, Constant.date);
		timetrackpage.selectUser(Constant.username);
		timetrackpage.createTask("Tax report", "2.0");
		String res=timetrackpage.submit();
		Assert.assertTrue(res.contains("saved"),"fail to create task");
	}	
	
	@Test(description="create Task")
	public void Test3()
	{
		LoginPage loginpage = new LoginPage(driver);
		String val= loginpage.validLogin("admin", "manager");
		Assert.assertTrue(val.contains("Enter"),"fail to login");
		HomePage homepage = new HomePage(driver);
		homepage.timeTrackMenu();
		TimeTrackPage timetrackpage = new TimeTrackPage(driver);
		timetrackpage.selectMonth(Constant.month, Constant.date);
		timetrackpage.selectUser(Constant.username1);
		timetrackpage.createTask("Design coordination", "2.0");
		String res=timetrackpage.submit();
		Assert.assertTrue(res.contains("saved"),"fail to create task");
	}

	@Test(description="create Task")
	public void Test5()
	{
		LoginPage loginpage = new LoginPage(driver);
		String val= loginpage.validLogin("admin", "manager");
		Assert.assertTrue(val.contains("Enter"),"fail to login");
		HomePage homepage = new HomePage(driver);
		homepage.timeTrackMenu();
		TimeTrackPage timetrackpage = new TimeTrackPage(driver);
		timetrackpage.selectMonth(Constant.month, Constant.date);
		timetrackpage.selectUser(Constant.username1);
		timetrackpage.createTask("Site design", "2.0");
		String res=timetrackpage.submit();
		Assert.assertTrue(res.contains("saved"),"fail to create task");
	}
	

	@Test(description="create Task")
	public void Test6()
	{
		LoginPage loginpage = new LoginPage(driver);
		String val= loginpage.validLogin("admin", "manager");
		Assert.assertTrue(val.contains("Enter"),"fail to login");
		HomePage homepage = new HomePage(driver);
		homepage.timeTrackMenu();
		TimeTrackPage timetrackpage = new TimeTrackPage(driver);
		timetrackpage.selectMonth(Constant.month, Constant.date);
		timetrackpage.selectUser(Constant.username1);
		timetrackpage.createTask("Windows structural systems design", "2.0");
		String res=timetrackpage.submit();
		Assert.assertTrue(res.contains("saved"),"fail to create task");
	}

	@AfterMethod
	public void teardown()
	{
		driver.manage().deleteAllCookies();
		driver.quit();	
	}
}
