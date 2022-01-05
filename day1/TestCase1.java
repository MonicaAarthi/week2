package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

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
	
	driver.findElement(By.linkText("Create Contact")).click();
	
	WebElement firstName = driver.findElement(By.id("firstNameField"));
	
	firstName.sendKeys("Monica");
	
	String firstNameValue = firstName.getAttribute("value");
	
	System.out.println(firstNameValue);
	
	driver.findElement(By.id("lastNameField")).sendKeys("Aarthi");
	
	driver.findElement(By.name("submitButton")).click();
	
	
		
 driver.close();
 
	}

}
