package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
			
	     ChromeDriver driver = new ChromeDriver();
			
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 
		 driver.findElement(By.id("password")).sendKeys("crmsfa"); 
		 
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 
		 driver.findElement(By.linkText("Contacts")).click();
		 
		 driver.findElement(By.linkText("Create Contact")).click();
		 
		 driver.findElement(By.id("firstNameField")).sendKeys("Monica");
		 
		 driver.findElement(By.id("lastNameField")).sendKeys("Aarthi");
		 
		 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Moni");
		 
		 driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("M");
		 
		 driver.findElement(By.name("departmentName")).sendKeys("ECE");
		 
		 driver.findElement(By.xpath("//td[@class='label']/following-sibling::td/textarea")).sendKeys("Achieve");
		 
		 driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abcde@gmail.com");
		 
		 WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		 
		 Select dd1 = new Select(state);
		 
		 dd1.selectByVisibleText("New York");
		 
		 driver.findElement(By.name("submitButton")).click();
		 
		 driver.findElement(By.linkText("Edit")).click();
		 
		 driver.findElement(By.id("updateContactForm_description")).clear();
		 
		 driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Cheer Up");
		 
		 driver.findElement(By.xpath("//td/input[@name='submitButton']")).click();
		 
		 String title = driver.getTitle();
		 
		 System.out.println("The title is:"+(title));
		 
		 
	

	}

}
