package day1;

//open guru99 website
//Maximize Browser Window
//Implicit wait
//get Title
//get Url
//close

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstSeleniumScript {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();// Maximize Browser Window

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Implicit wait

		System.out.println(driver.getTitle());// Title

		System.out.println(driver.getCurrentUrl());// print Url

		driver.quit();// close

	}

}
