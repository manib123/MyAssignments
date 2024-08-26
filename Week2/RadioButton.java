package week2day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	

public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.findElement(By.xpath("//table[@id='j_idt87:console1']/tbody[1]/tr[1]/td[3]/div[1]/div[2]/span[1]")).click();

		driver.findElement(By.xpath("//div[@id='j_idt87:city2']/div[1]/div[2]/div[1]/div[2]/span[1]")).click();
		
		System.out.println(driver.findElement(By.name("j_idt87:city2")).isSelected());
		
		driver.findElement(By.xpath("//div[@id='j_idt87:city2']/div[1]/div[2]/div[1]/div[2]/span[1]")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@id='j_idt87:city2']/div[1]/div[2]/div[1]/div[2]")).isSelected());
		
		boolean defaultRadio=  driver.findElement(By.id("j_idt87:console2:2")).isSelected();
		

		System.out.println(defaultRadio);
		driver.quit();
}
}
