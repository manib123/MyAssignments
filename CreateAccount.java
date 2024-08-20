package week2day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import week1.day3.FindMissingElement;

public class CreateAccount {

		public static void main(String[] args) throws InterruptedException {
			
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	        driver.findElement(By.id("password")).sendKeys("crmsfa");
	        driver.findElement(By.className("decorativeSubmit")).click();
	        Thread.sleep(3000);
	        
	        //get title page
	        String title = driver.getTitle();
	        if(title.contains("Leaftaps")) {
	        	System.out.println("Login is successfull");
	        }else {
	        	System.out.println("Login is not successfull");
	        }
	        
	  //      driver.findElement(By.linkText("CRM/SFA")).click();
	        
	        driver.findElement(By.partialLinkText("SFA")).click();
	        driver.findElement(By.partialLinkText("Accounts")).click();
	        driver.findElement(By.partialLinkText("Create Account")).click();
	       
	        driver.findElement(By.id("accountName")).sendKeys("Mani123");
	       
	        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	        driver.findElement(By.id("numberEmployees")).sendKeys("10");
	        driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
	        driver.findElement(By.className("smallSubmit")).click();
	
	        
	        driver.close();
}
}
//Click on the "Accounts" tab.
//Click on the "Create Account" button.
//Enter an account name.
 //Enter a description as "Selenium Automation Tester." 
//- Enter a Number Of Employees.
//Enter a Site Name as “LeafTaps”
//Click the "Create Account" button