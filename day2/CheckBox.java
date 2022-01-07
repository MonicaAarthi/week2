package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/checkbox.html");
		
		driver.manage().window().maximize();
		
	    driver.findElement(By.xpath("(//div[@class='example']//input)[1]")).click();
	    
	    boolean sel = driver.findElement(By.xpath("//div[@class='example'][2]//input[1]")).isSelected();
		
		if(sel==true) {
			System.out.println("selenium is selected");
		}else {
			
			System.out.println("selenium not selected");
		}
		
		//deselect the option
		
		boolean option = driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following::input[2]")).isSelected();
		
		if(option==true)
		{
			
			driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following::input[2]")).click();
		}
		
		//select all the options
		
	driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[1]")).click();
		
	driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[2]")).click();

	driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[3]")).click();	
		
	driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[4]")).click();	
		
	driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[5]")).click();
	
	
	driver.close();
	
	}

}
