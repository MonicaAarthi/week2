package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
			
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
				
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
				
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
			
        driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
            
        driver.findElement(By.xpath("//a[text()='Leads']")).click();
            
        driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
           
        driver.findElement(By.xpath("//span[text()='Email']")).click();
           
        driver.findElement(By.name("emailAddress")).sendKeys("abcde@gmail.com");
           
        WebElement cc = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]"));
        
        String name1=cc.getText();
        
        System.out.println(name1);
            
        cc.click();
         
        driver.findElement(By.xpath("(//div[@class='frameSectionExtra']/a)[1]")).click();
            
        String title=driver.getTitle();
            
         if(title.contains("Duplicate")) {
            	System.out.println("Title is verified");
            	}
            else {
            	System.out.println("Title mismatched");
            	}
           
          driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
            
          WebElement ld = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
          
          String lead1=ld.getText();
           
          System.out.println(lead1);
            
          if(name1.equalsIgnoreCase(name1)) {
            	System.out.println("Duplicate lead name is same as captured name");
          }
            else {
            	System.out.println("Duplicate lead name is not same as captured name");
            }
	            
	
	}

}
