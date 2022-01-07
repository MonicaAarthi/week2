package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase2 {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Get the title
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 //Enter username
	 WebElement userName = driver.findElement(By.id("username")); 
	 userName.sendKeys("DemoSalesManager");
	  
	 //Enter password 
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	//Click login button
	driver.findElement(By.className("decorativeSubmit")).click();
	
	//click CRMFSA
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	driver.findElement(By.linkText("Contacts")).click();
	
	driver.findElement(By.linkText("Find Contacts")).click();
		
	driver.findElement(By.linkText("Email")).click();	
	
	driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
	
	driver.findElement(By.linkText("Find Contacts")).click();
	
	driver.close();
	
		

	}

}
