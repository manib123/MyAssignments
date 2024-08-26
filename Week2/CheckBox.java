package week2day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://leafground.com/checkbox.xhtml");
		
		driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox-box ui-widget')]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[2]")).click();	
             //Verify that the expected message is displayed.
		System.out.println(driver.findElement(By.className("ui-growl-title")).isDisplayed());
		String messageString = driver.findElement(By.className("ui-growl-title")).getText();
		System.out.println(messageString);
            
           driver.findElement(By.xpath("//table[@id='j_idt87:basic']/tbody[1]/tr[1]/td[3]/div[1]/div[2]")).click();
           
           driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']//div)[2]")).click();
        
           //Verify which tri-state option is chosen.
           System.out.println(driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']//div)[2]")).isSelected());
           
           driver.findElement(By.className("ui-toggleswitch-slider")).click();
         //Verify that expected message is displayed.
           System.out.println(driver.findElement(By.className("ui-toggleswitch-slider")).isDisplayed());
           
           //Verify if the Checkbox is disabled.
           System.out.println(driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')])[3]")).isEnabled());
           
           driver.findElement(By.xpath("//div[contains(@class,'ui-selectcheckboxmenu-trigger ui-state-default')]")).click();
           driver.findElement(By.xpath("(//label[text()='Berlin'])[2]")).click();
           driver.findElement(By.xpath("(//label[text()='Rome'])[2]")).click();
       driver.quit();
	}

}

	

