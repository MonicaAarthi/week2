package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class EditAssignment {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		driver.manage().window().maximize();
		
		//enter email
		driver.findElement(By.xpath("//div/label[text()='Enter your email address']/following-sibling::input[@id='email']")).sendKeys("monica@gmail.com");
		
		
		//appending text and using TAB action
		WebElement bb = driver.findElement(By.xpath("//div/label[text()='Append a text and press keyboard tab']/following-sibling::input[@value='Append ']"));
		
		bb.sendKeys("aarthi",Keys.TAB);
		
		
		//get the existing text from the field
		WebElement cc = driver.findElement(By.xpath("//div/label[text()='Get default text entered']/following-sibling::input[@value='TestLeaf']"));
		
	   cc.getAttribute("value");
	   
	   //clearing the existing text
	   WebElement dd = driver.findElement(By.xpath("//div/label[text()='Clear the text']/following-sibling::input[@value='Clear me!!']"));
	   
	   dd.clear();
	   
	   //confirming the disable field
	   boolean field = driver.findElement(By.xpath("//div/label[@for='disabled']/following-sibling::input[@disabled='true']")).isEnabled();
	   
	   if(field == true) {
		   
		   System.out.println("The field is enable");
	   
	   } else {
		   
		  System.out.println("The field is disabled"); 
		  
		   
	   }
	   
	   	   
	   
	}
	   
	  
	}


