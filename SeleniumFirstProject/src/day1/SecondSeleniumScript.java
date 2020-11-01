package day1;
//open guru99 website
//Maximize Browser Window
//Drag and Drop
//X path->Relative x path
//Actions class->Drag and Drop
//static wait
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SecondSeleniumScript {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/resources/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();

		WebElement From = driver.findElement(By.xpath("//*[@id='credit2']/a"));

		WebElement To = driver.findElement(By.xpath("//*[@id='bank']/li"));

		Actions act = new Actions(driver);

		act.dragAndDrop(From, To).build().perform();
	
		Thread.sleep(5000);
		
		driver.close();

	}

}
