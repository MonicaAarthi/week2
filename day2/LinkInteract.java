package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkInteract {

	public static void main(String[] args) {
	
		 WebDriverManager.chromedriver().setup();
			
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("http://leafground.com/pages/Link.html");
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.linkText("Go to Home Page")).click();
		 
		 driver.navigate().back();
		 
		 
   WebElement des = driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']"));
		 
   String str = des.getAttribute("href");
    
   System.out.println("The destined page is:" +(str));
		 
	
		 driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).click();
		 
		 String hs1 = driver.getTitle();
			
		 if(hs1.contains("Not Found")) {
				
			System.out.println("It has error");
			
		 }else {
				
				System.out.println("No error");
			}
			
    driver.navigate().back();
    
    driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
    
    driver.navigate().back();
    
    driver.close();
    
	}

}
