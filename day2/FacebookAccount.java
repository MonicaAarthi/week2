package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAccount {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		//load url
		driver.get("https://en-gb.facebook.com/");
		
		//maximize
		driver.manage().window().maximize();
		
		//wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//click on create new account
		driver.findElement(By.linkText("Create New Account")).click();
		
		//enter first name
		driver.findElement(By.xpath("//div/input[@name='firstname']")).sendKeys("abc");
		
		//enter last name	
		driver.findElement(By.xpath("//div/input[@name='lastname']")).sendKeys("def");
		
		//enter mobile
		driver.findElement(By.xpath("//div/input[@name='reg_email__']")).sendKeys("12345");
		
		//enter password
		driver.findElement(By.xpath("//div/input[@name='reg_passwd__']")).sendKeys("book");
		
		//enter birthday 
		
	    //day
		
		WebElement aa = driver.findElement(By.xpath("//span[@data-name='birthday_wrapper']//select[@id='day']"));
		Select ob1= new Select(aa);
		ob1.selectByVisibleText("20");
		
		//month
		WebElement bb = driver.findElement(By.xpath("//span[@data-name='birthday_wrapper']//select[@id='month']"));
		Select ob2= new Select(bb);
		ob2.selectByVisibleText("Jun");
		
		//year
		WebElement cc = driver.findElement(By.xpath("//span[@data-name='birthday_wrapper']//select[@id='year']"));
		Select ob3= new Select(cc);
		ob3.selectByVisibleText("1996");
		
		
		//gender
		driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/input[@type='radio']")).click();
		
	driver.close();
	

	}

}
