package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {

	public static void main(String[] args) {
		//Set Up the web driver
				WebDriverManager.chromedriver().setup();
				
				//Launch the browser
				ChromeDriver driver = new ChromeDriver();
				
				//loading the url
				driver.get("http://leaftaps.com/opentaps/");
				
				//maximize the browser
				driver.manage().window().maximize();
				
				//Get the title
				 String title = driver.getTitle();
				 System.out.println(title);
				 
				 //Enter username
			 WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			  
			 userName.sendKeys("DemoSalesManager");
			  	 
			 //Enter password 
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
			
			//Click login button
			driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
			
			//click CRMFSA
			driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
			
			//click on leads
			driver.findElement(By.xpath("//a[text()='Leads']")).click();
			
			//click on create lead
			driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
				
			//enter company name
			driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("IBM");
		
			//enter firstname
			driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Monica");
			
			//enter lastname
			driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Aarthi");
			
			driver.findElement(By.xpath("//input[@name='submitButton']")).click();
			

	}

}
