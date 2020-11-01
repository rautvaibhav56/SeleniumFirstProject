package day1;
//Locators Used In Selenium For Object Identification
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Locators:It is a technique to find any element on web page.
//Eight locators
//id ,Name 
public class Locators {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/resources/drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();// Maximize Browser Window

		// 1.id->faster
		WebElement Uname = driver.findElement(By.id("txtUsername"));
		Uname.sendKeys("Admin");

		// 2.Name
		By.name("txtPassword");// By is a class
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");

		//click Login
		WebElement Login = driver.findElement(By.id("btnLogin"));
		Login.click();
		
		driver.close();
		
		

	}

}
//Direct loactors: Id , Name , Class Name 
//In Direct locators:  X path, css.  =>(For dynamic web applications)
//For hyper Links: LinkText , PartialLinkText
//Web Element of similar Type :TagName

//3.Class Name -> Class name many time won't be unique


