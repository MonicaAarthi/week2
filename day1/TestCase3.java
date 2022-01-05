package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

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
	
	driver.findElement(By.linkText("Leads")).click();
	
	driver.findElement(By.linkText("Create Lead")).click();
	
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
	
	WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
	
	firstName.sendKeys("Monica");
	
	String firstNameValue = firstName.getAttribute("value");
	
	System.out.println(firstNameValue);
	
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Aarthi");
	
	WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
	
	Select dd1 = new Select(source);
	
	dd1.selectByVisibleText("Employee");
	
	WebElement markCam = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	
	Select dd2 = new Select(markCam);
	
	dd2.selectByValue("9000");
	
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Moni");
	
	driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Ammu");
	
	driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Hello");
	
	driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("06/20/96");
	
	driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Testing");
	
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ECE");
	
	driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("400");
	
	WebElement currency = driver.findElement(By.id("createLeadForm_currencyUomId"));
	
	Select dd3 = new Select(currency);
	
	dd3.selectByVisibleText("USD - American Dollar");
	
	WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
	
	Select dd4 = new Select(industry);
	
	dd4.selectByValue("IND_SOFTWARE");
	
	driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10000");
	
	WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	
	Select dd5 = new Select(ownership);
	
	dd5.selectByIndex(5);
	
	driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("302");
	
	driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("$");
	
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Dream Big");
	
	driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Never Give Up");
	
	// contact info
	
	//clearing the given data in field and entering new data
	
	WebElement oldNo = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));

	oldNo.clear();
	
	oldNo.sendKeys("4");
	
	driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("+142");
	
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("232323");
	
	driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("255");
	
	driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Receptionist");
	
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
	
	driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.abc.com");
	
	//primary address
	
	driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Monica Aarthi");
	
	driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Monica");
	
	driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No.23, abc street");
	
	driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("xyz town");
	
	driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("cde");
	
	WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	
	Select dd6 = new Select(state);
	
	dd6.selectByVisibleText("Arizona");
	
	driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("732");
	
	WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	
	Select dd7 = new Select(country);
	
	dd7.selectByVisibleText("Australia");
	
	driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("89");
	
	driver.findElement(By.name("submitButton")).click();
		
    driver.close();

	}

}
