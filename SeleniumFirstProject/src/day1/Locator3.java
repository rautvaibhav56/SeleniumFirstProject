package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//linkText,partialLinkText

public class Locator3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();// Maximize Browser Window

		// 6.LinkText
		// driver.findElement(By.linkText("Forgot your password?")).click();

		// 7.PartialLinkText ->For Multiple key words
		driver.findElement(By.partialLinkText("Forgot your")).click();

		 driver.close();
	}

}
