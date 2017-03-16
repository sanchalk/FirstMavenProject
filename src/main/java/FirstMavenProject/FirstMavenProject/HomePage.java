package FirstMavenProject.FirstMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	public WebDriver driver;
	ReUsableMethods rs;
	PageFactoryLocator pfl= PageFactory.initElements(driver, PageFactoryLocator.class);
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		rs = new ReUsableMethods(driver);
	}
	
	public void timeTrackMenu()
	{
		if(!rs.getpageTitle().contains("Enter"))
		{
			rs.click(pfl.timetracktab);
		}
	}
	
	public void taskMenu()
	{
		if(!rs.getpageTitle().contains("Open"))
		{
			rs.click(pfl.taskstab);
		}
	}
	
	public void reportsMenu()
	{
		if(!rs.getpageTitle().contains("Reports"))
		{
			rs.click(pfl.reportstab);
		}
	}

	public void profilemenu()
	{
		if(!rs.checkisDisplayed(pfl.profileusername))
		{
			rs.click(pfl.profilelink);
		}
	}
	
	public void userMenu()
	{
		if(!rs.getpageTitle().contains("User"))
		{
			rs.click(pfl.usertab);
		}
	}
	
	public void logoutMenu()
	{
		if(!rs.getpageTitle().contains("Login"))
		{
			rs.click(pfl.logoutlink);
		}
	}

}
