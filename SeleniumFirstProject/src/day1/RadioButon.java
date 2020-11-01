package day1;
//RadioButon
//CheckBox

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\krishna\\Desktop\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//RadioButon
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));							
        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));							
        radio1.click();			
        System.out.println("Radio Button Option 1 Selected");						
        radio2.click();			
        System.out.println("Radio Button Option 2 Selected");					
        		
        // CheckBox		
        WebElement option1 = driver.findElement(By.id("vfb-6-0"));							
        option1.click();			

        // Check-> Check box is toggled on 		
        if (option1.isSelected()) {					
            System.out.println("Checkbox is Toggled On");					

        } else {			
            System.out.println("Checkbox is Toggled Off");					
        }		
         
        		
        	
		driver.close();		
        		
    }		

	}


