package week2day1;

import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowser {

	public static void main(String[] args) {
		
      ChromeDriver driver = new ChromeDriver();

     
        driver.manage().window().maximize();
        
        driver.get("https://www.facebook.com");

     driver.close();
     
	}

}
 