package day1;
//open guru99 website
//Maximize Browser Window

//Double click the button to launch an alertbox

//Alert

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ThirdSeleniumScript {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/resources/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
	
		Actions action = new Actions(driver);
		
		WebElement link = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		action.doubleClick(link).perform();

		Alert alert = driver.switchTo().alert();
		
		System.out.println("Alert Text\n" +alert.getText());
		
		alert.accept();
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
