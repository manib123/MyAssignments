package week2day1;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("bhatiamani@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Mobile");
	driver.findElement(By.name("login")).click();
	
	Thread.sleep(5000);
	
	String title = driver.getTitle();
	if(title.contains("Facebook")) {
		System.out.println("Login");
	}
		else 
		{
			System.out.println("not login");
		}
	
	driver.findElement(By.partialLinkText("SFA")).click();
	driver.close();
	
	}
	
	

	
	
	

	}


