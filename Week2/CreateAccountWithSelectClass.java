package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountWithSelectClass {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();

        driver.findElement(By.partialLinkText("SFA")).click();
        driver.findElement(By.partialLinkText("Accounts")).click();
        driver.findElement(By.partialLinkText("Create Account")).click();
       
        driver.findElement(By.id("accountName")).sendKeys("Mani1");
        
        WebElement dd = driver.findElement(By.name("industryEnumId"));
    	Select opt = new Select(dd);
    	opt.selectByIndex(3);
    	
    	WebElement dd1 = driver.findElement(By.name("ownershipEnumId"));
    	Select opt1 = new Select(dd1);
    	opt1.selectByVisibleText("S-Corporation");
    	
    	WebElement dd2 = driver.findElement(By.name("dataSourceId"));
    	Select opt2 = new Select(dd2);
    	opt2.selectByValue("LEAD_EMPLOYEE");
    	
    	WebElement dd3 = driver.findElement(By.name("marketingCampaignId"));
    	Select opt3 = new Select(dd3);
    	opt3.selectByIndex(6);
    	
    	WebElement dd4 = driver.findElement(By.name("generalStateProvinceGeoId"));
    	Select opt4 = new Select(dd4);
    	opt4.selectByValue("TX");
    
        //Verify that the account name is displayed correctly
       
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
        
        Thread.sleep(6000);
     
        driver.findElement(By.className("smallSubmit")).click();
        Thread.sleep(3000);
        
        driver.close();
	}

}
