package FirstMavenProject.FirstMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReUsableMethods 
{
	public WebDriver driver;
	public WebDriverWait wait;
	
	public ReUsableMethods(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void TypeData(By Locator, String text)
	{
		driver.findElement(Locator).sendKeys(text);		
	}
	
	public void click(By Locator)
	{
		driver.findElement(Locator).click();		
	}
	
	public String getTextFromField(By Locator)
	{
		return driver.findElement(Locator).getText();	
	}
	
	public String getpageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean checkisSelected(By locator)
	{
		return driver.findElement(locator).isSelected();
	}
	
	public boolean checkisEnabled(By locator)
	{
		return driver.findElement(locator).isEnabled();
	}
	
	public boolean checkisDisplayed(By locator)
	{
		return driver.findElement(locator).isDisplayed();
	}
	
	public void explicitywait(By locator)
	{
		wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void keysinputESC(By locator)
	{
		driver.findElement(locator).sendKeys(Keys.ESCAPE);
	}
	
	
	public void keysinputTAB(By locator)
	{
		driver.findElement(locator).sendKeys(Keys.TAB);
	}
	
	
}
