package day1;

//dropdown
//Using Select class 


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FifthSeleniumScript {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/resources/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");

		driver.manage().window().maximize();

		// Using Select class for selecting value from dropdown

		Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
		
		Thread.sleep(3000);
		
		//Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='testingDropsown']/p")));
		
		dropdown.selectByVisibleText("Database Testing");
		
		Thread.sleep(3000);
		
		dropdown.selectByVisibleText("Manual Testing");

		

		//driver.close();

	}

}
