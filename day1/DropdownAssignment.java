package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownAssignment {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		
		//dropdown using index:

		WebElement dpd = driver.findElement(By.id("dropdown1"));
		Select dd = new Select(dpd);
		int size = dd.getOptions().size();
		dd.selectByIndex(size-2);

		 //dropdown using text:

		WebElement dpd2 = driver.findElement(By.name("dropdown2"));
		Select dd1 = new Select(dpd2);
		dd1.selectByVisibleText("UFT/QTP");

		 //dropdown using value:

		WebElement dpd3 = driver.findElement(By.id("dropdown3"));
		Select dd2 = new Select(dpd3);
		dd2.selectByValue("3");


		 //get the number of dropdown options:

		WebElement dpd4 = driver.findElement(By.className("dropdown"));
		Select dd3 = new Select(dpd4);
		int size2 = dd3.getOptions().size();
		System.out.println("no.of options:"+((size2)-1));
		dd3.selectByIndex((size2)-2);
		
	
		 //sendKeys to select option:

		
	driver.findElement(By.xpath("//select/option[text()='You can also use sendKeys to select']/following-sibling::option[text()='UFT/QTP']")).click();
	
			
		//select programs:
	 
	driver.findElement(By.xpath("//select/option[text()='Select your programs']/following-sibling::option[text()='UFT/QTP']")).click();
	
	driver.close();
	
	}

}
