package FirstMavenProject.FirstMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public WebDriver driver;
	ReUsableMethods rs;
	PageFactoryLocator pfl= PageFactory.initElements(driver, PageFactoryLocator.class);
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		rs = new ReUsableMethods(driver);
	}
	
	private void setUsername(String username)
	{
		rs.TypeData(pfl.usernamefield, username);
	}
	
	private void setPassword(String pwd)
	{
		rs.TypeData(pfl.passwordfield, pwd);
	}
	
	private void checkBoxClick()
	{
		if(!rs.checkisSelected(pfl.checkbox))
		{
			rs.click(pfl.checkbox);
		}		
	}
	
	private void loginbuttnClick()
	{
		rs.click(pfl.loginbtn);
	}
	
	private String getErrorText()
	{
		return rs.getTextFromField(pfl.errormsg);		  
	}
	
	private String LoginPageTitle()
	{
		return rs.getpageTitle();
	}
	
	private void ewait()
	{
		rs.explicitywait(pfl.logoutlink);
	}
	public String validLogin(String username, String pwd)
	{
		setUsername(username);
		setPassword(pwd);
		checkBoxClick();
		loginbuttnClick();
		ewait();
		return LoginPageTitle();
	}
	
	public String inValidLogin(String username, String pwd)
	{
		setUsername(username);
		setPassword(pwd);
		checkBoxClick();
		loginbuttnClick();
		return getErrorText();
	}
	
	
}
