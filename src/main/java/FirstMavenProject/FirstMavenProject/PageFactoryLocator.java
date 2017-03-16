package FirstMavenProject.FirstMavenProject;

import org.openqa.selenium.By;

public class PageFactoryLocator 
{
	// locators for login page
	public    By headerfield = By.id("headerContainer");
	public 	By loginbtn = By.id("loginButton");
	public 	By checkbox = By.id("keepLoggedInCheckBox");
	public 	By usernamefield = By.id("username");
	public 	By passwordfield = By.name("pwd");
	public 	By errormsg = By.xpath(".//*[@id='ErrorsTable']/tbody/tr/td[2]/table/tbody/tr/td/span");
	public 	By logoutlink = By.id("logoutLink");

	// locators for home page
	public  By timetracktab= By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[2]/a");
	public  By taskstab= By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[3]/a");
	public  By reportstab= By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[4]/a");
	public  By usertab= By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[5]/a");
	public  By profilelink= By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[6]/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td[1]/a");
	public  By profileusername = By.id("userProfilePopup_firstNameField");

	// locators for time trackpage
	public   By calenderbtn = By.xpath(".//*[@id='ext-gen23']");
	public   By monthlabel = By.xpath("//table[@id='ext-comp-1005']/tbody/tr[1]/td[2]");
	public    By nextbutn= By.xpath("//a[@title='Next Month (Control+Right)']");
	public  	By tablecalender= By.xpath("//table[starts-with(@id,'ext-gen')]");
	public  By dropdown=By.xpath(".//*[@id='tasksListForm']/table/tbody/tr[1]/td/table/tbody/tr/td[2]/table/tbody/tr/td[2]/select");
	public  By dropdownlink = By.xpath(".//*[@id='enterTTMainContent']/table[1]/tbody/tr[1]/td[1]/div/table/tbody/tr/td[3]/table/tbody/tr/td[2]/div/span");
	public 	By dropdownitem = By.cssSelector(".userName");
	public  By recenttasklist = By.cssSelector(".taskName>span>span");
	public  By recenttask = By.xpath(".//*[@id='recentTasksControl']/tbody/tr/td/div[1]");
	public  By alreadycreatedTask = By.cssSelector(".taskNameBlock");
	//public  By timefield = By.xpath("//input[starts-with(@id,'spent_')]");
	public  By save = By.id("SubmitTTButton");
	public  By sucessmsg = By.xpath(".//*[@id='SuccessMessages']/tbody/tr/td/span");
}
