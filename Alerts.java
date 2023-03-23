package seleniumPgms;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Downloads\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='JavaScript Alerts']")).click();
		driver.findElement(By.xpath("//button[text() ='Click for JS Alert']")).click(); 
		Alert alert =driver.switchTo().alert();   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		alert.accept();

		driver.findElement(By.xpath("//button[text() ='Click for JS Confirm']")).click(); 
		Alert alt1=driver.switchTo().alert();   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));;
		alt1.dismiss();


		driver.findElement(By.xpath("//button[text() ='Click for JS Prompt']")).click(); 
		Alert alt11=driver.switchTo().alert();   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		alt11.sendKeys("alert prompt");   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));; alt11.accept();
		driver.navigate().back();
	}

}
