package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
           
        driver.findElement(By.xpath("//span[text()='Phone']")).click();
            
        WebElement dd1 = driver.findElement(By.xpath("//input[@name='phoneCountryCode']"));
        dd1.sendKeys("5"); 
        
        WebElement dd2 = driver.findElement(By.xpath("//input[@name='phoneAreaCode']"));
        dd2.sendKeys("23");
           
        WebElement dd3= driver.findElement(By.xpath("//input[@name='phoneNumber']"));
        dd3.sendKeys("1234");
           
          
        //Capture lead ID of First Resulting lead
           
         WebElement cp = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
         String id1=cp.getText();    
         System.out.println(id1);
         
           //Click First Resulting lead
           cp.click();
           
           //Delete
           driver.findElement(By.xpath("(//div[@class='frameSectionExtra']/a)[4]")).click();
           
           //Click Find leads
           driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
           
           //Enter captured lead ID
           driver.findElement(By.xpath("//input[@name='id']")).sendKeys(id1);
           
           //Click find leads button
           driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
           
           //Verify no records
           WebElement rd = driver.findElement(By.xpath("//div[text()='No records to display']"));
           String result=rd.getText();
           System.out.println(result);	
		
		driver.close();
			
		
	}

}
