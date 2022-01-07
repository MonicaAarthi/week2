package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonBond {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Button.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div/button[text()='Go to Home Page']")).click();
	
		//return back to previous page
		
		driver.navigate().back();
		
	System.out.println("Location:" +(driver.findElement(By.xpath("//div/button[text()='Get Position']")).getLocation()));
		
		System.out.println("Color is:" +(driver.findElement(By.id("color")).getCssValue("background-color")));
		
		System.out.println("Height & width is:" +(driver.findElement(By.id("size")).getSize()));
		
		
		
		driver.close();
		

	}

}
