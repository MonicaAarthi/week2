package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
	
		// Setup the driver
		
		WebDriverManager.chromedriver().setup();
		
		
		// launch the browser
		ChromeDriver driver = new ChromeDriver();
			
		//load the url
		driver.get("http://leaftaps.com/opentaps/");
		
		//maximize the screen
		driver.manage().window().maximize();
		
		//get the title
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		WebElement userName = driver.findElement(By.id("username"));
		
		userName.sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Monica");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Aarthi");
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.close();
		
	}

}
