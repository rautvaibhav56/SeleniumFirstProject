package day1;

//Right Click

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FourthSeleniumScript {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/resources/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();

		Actions action = new Actions(driver);
		
		WebElement link = driver.findElement(By.xpath("//span[text()='right click me'] "));
		
		action.contextClick(link).perform();

		Thread.sleep(5000);
		
		driver.quit();

		
		

	}

}
