package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//tagName

public class Locator4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();// Maximize Browser Window


		//8.tagName
		System.out.println(driver.findElements(By.tagName("img")).size());//gives 
	
		driver.close();
	}

}
