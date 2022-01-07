package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageInteract {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
			
		 ChromeDriver driver = new ChromeDriver();
			
		 driver.get("http://leafground.com/pages/Image.html");	
		
		 driver.manage().window().maximize();
		 
 driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/img[@src='../images/home.png']")).click();
		 
		 driver.navigate().back();
		 
 WebElement broken = driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/img[@src='../images/abcd.jpg']"));
 
          String image = broken.getAttribute("src");
          
          if(image.contains("abcd")) {
        	  
        	  System.out.println("Image is broken");
          }else {
        	  
        	  System.out.println("Image is not broken");
          }
        	  
	driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/img[@src='../images/keyboard.png']")).click();
		
		
	driver.close();

	}

}
