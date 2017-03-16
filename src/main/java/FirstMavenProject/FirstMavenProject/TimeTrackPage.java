package FirstMavenProject.FirstMavenProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TimeTrackPage extends HomePage
{
	public TimeTrackPage(WebDriver driver) 
	{
		super(driver);		
	}

	public  void selectMonth(String month,String date)
	{
		int count=0;
		while(count<1)
		{
			try {
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				Thread.sleep(2000);			
				rs.click(pfl.calenderbtn);		
				System.out.println("label " +driver.findElement(pfl.monthlabel).getText());
				for(int i=0; i<25;i++)
				{
					if(!rs.getTextFromField(pfl.monthlabel).equals(month))
					{
						rs.click(pfl.nextbutn);						
					}
					else {break;}			
				}
				WebElement tbl= driver.findElement(pfl.tablecalender);
				List<WebElement> rows= tbl.findElements(By.tagName("tr"));
				System.out.println("row count " + rows.size());
				for(int i=0; i<rows.size(); i++)
				{
					List<WebElement> column=rows.get(i).findElements(By.tagName("td"));
					System.out.println("column count " + column.size());
					for(int j=0;j<column.size();j++)
					{
						System.out.println(column.get(j).getText());
						if (column.get(j).getText().equals(date))
						{
							column.get(j).click(); 							
							break;
						}				
					}
				}
			}
			catch (Exception e) {
				System.out.println(e);
				count=count+1; continue;
			}
		}
		rs.explicitywait(pfl.dropdownlink);
	}

	public void selectUser(String user)
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		rs.click(pfl.dropdownlink);
		List<WebElement> list1 =driver.findElements(pfl.dropdownitem);
		for(int i=0; i<list1.size();i++)
		{
			String x= list1.get(i).getText();
			if(x.contains(user))
			{
				list1.get(i).click();break;
			}
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(rs.getTextFromField(pfl.dropdownlink).contains(user),"fail to select item");
	}

	public void createTask(String taskname, String time)
	{
		boolean flag=false;
		int c=0;
		rs.click(pfl.recenttask);
		List<WebElement> list1 =driver.findElements(pfl.recenttasklist);
		for(int i=0; i<list1.size();i++)
		{
			String x= list1.get(i).getText();
			System.out.println(x);
			if(x.contains(taskname))
			{
				flag=true;
				list1.get(i).click();
				rs.explicitywait(pfl.recenttask);
				//enterTime(time, taksname);
				//System.out.println("wait " + i);
				int count=0;
				while(count<4)
				{
					try {
						By timefield=By.xpath("//span[contains(text(),'"+taskname+"')]//following::input[starts-with(@id,'spent_')]");
						rs.explicitywait(timefield);
						List<WebElement> list3 =driver.findElements(timefield);
						System.out.println("count " + list3.size());
						for(int j=0; j<list3.size();j++)
						{		
							System.out.println(j);
							list3.get(j).clear();
							list3.get(j).sendKeys(time);
							//rs.keysinputTAB(timefield);			
							if(j==4)
							{ break;}			
						}
						break;
					}catch (Exception e) 
					{
						count=count+1; continue;
					}
				}
				break;
			}
		}
		if(flag==false)
		{
			createTask1(taskname, time);
		}
	}

	public void createTask1(String taskname, String time)
	{
		rs.keysinputESC(pfl.recenttask);
		List<WebElement> list2 =driver.findElements(pfl.alreadycreatedTask);
		System.out.println("count " +list2.size());
		for(int j=0; j<list2.size();j++)
		{
			String y= list2.get(j).getText();
			if(y.contains(taskname))
			{
				int count=0;
				while(count<4)
				{
					try {
						By timefield=By.xpath("//span[contains(text(),'"+taskname+"')]//following::input[starts-with(@id,'spent_')]");
						rs.explicitywait(timefield);
						List<WebElement> list3 =driver.findElements(timefield);
						System.out.println("count " + list3.size());
						for(int k=0; k<list3.size();k++)
						{		
							System.out.println(j);
							list3.get(k).clear();
							list3.get(k).sendKeys(time);
							//rs.keysinputTAB(timefield);			
							if(k==4)
							{ break;}			
						}
						break;
					}catch (Exception e) 
					{
						count=count+1; continue;
					}
				}				
			}			
		}
	}

	public void enterTime(String time, String taskname)
	{ 
		int count=0;
		while(count<4)
		{
			try {
				By timefield=By.xpath("//span[contains(text(),'"+taskname+"')]//following::input[starts-with(@id,'spent_')]");
				rs.explicitywait(timefield);
				List<WebElement> list3 =driver.findElements(timefield);
				System.out.println("count " + list3.size());
				for(int j=0; j<list3.size();j++)
				{		
					System.out.println(j);
					list3.get(j).clear();
					list3.get(j).sendKeys(time);
					//rs.keysinputTAB(timefield);			
					if(j==4)
					{ break;}			
				}
			}catch (Exception e) 
			{
				count=count+1; continue;
			}
		}

	}

	public String submit()
	{
		rs.click(pfl.save);
		rs.explicitywait(pfl.sucessmsg);
		return rs.getTextFromField(pfl.sucessmsg);
	}
}
