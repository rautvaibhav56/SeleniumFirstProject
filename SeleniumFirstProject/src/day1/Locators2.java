package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//xpath ,cssSelector

public class Locators2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();// Maximize Browser Window

		// 4.Xpath
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		
		// 5.CSS
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");

		WebElement Login = driver.findElement(By.id("btnLogin"));
		Login.click();
		
		driver.close();
		
	}

}
