package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropdown {

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
	 WebElement userName = driver.findElement(By.id("username")); 
	 userName.sendKeys("DemoSalesManager");
	  
	 //Enter password 
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	//Click login button
	driver.findElement(By.className("decorativeSubmit")).click();
	
	//click CRMFSA
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	//click on leads
	driver.findElement(By.linkText("Leads")).click();
	
	//click on create lead
	driver.findElement(By.linkText("Create Lead")).click();
	
	//enter company name
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	
	//enter firstname
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Monica");
	
	//enter lastname
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Aarthi");	

	//select source from dropdown
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select dp = new Select(source);
		
		//dp.selectByVisibleText("Public Relations");
		//dp.selectByValue("LEAD_EMPLOYEE");
		//dp.selectByIndex(3);
		
		int size = dp.getOptions().size(); //length of available options
		dp.selectByIndex(size-3); //choose the third option from last
		
     driver.findElement(By.name("submitButton")).click();
		
    driver.close(); // close the browser
		
		
	}

}
