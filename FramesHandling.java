package seleniumPgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Downloads\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Frames']")).click();
		driver.findElement(By.xpath("//a[text() ='iFrame']")).click(); 
		int size= driver.findElements(By.tagName("iframe")).size(); 
		System.out.println(size);
		driver.switchTo().frame("mce_0_ifr"); 
		WebElement framecon = driver.findElement(By.xpath("//body[@id='tinymce']")); framecon.clear();
		framecon.sendKeys("hi i am iframe");
		driver.navigate().to("https://the-internet.herokuapp.com/");

		driver.findElement(By.xpath("//a[text()='Frames']")).click();
		driver.findElement(By.xpath("//a[text() ='Nested Frames']")).click();
		int sizeN = driver.findElements(By.tagName("frame")).size();
		System.out.println(sizeN);

		driver.quit();
		

	}

}
