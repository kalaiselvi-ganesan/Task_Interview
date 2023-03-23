package seleniumPgms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class MultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\Downloads\\drivers\\geckodriver.exe");		
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();

		String home = driver.getWindowHandle();
		WebElement MenMain = driver.findElement(By.xpath("/html/body/div/div/div/header/div[2]/nav/div/div/div/a"));
		Actions act = new Actions(driver);
		act.moveToElement(MenMain).build().perform();
		Thread.sleep(3000);

		WebElement tshirt = driver.findElement(By.xpath("//*[text()='T-Shirts']"));
		tshirt.click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/main/div[3]/div[2]/div/div[2]/section/ul/li[2]/a/div[2]/div/span[1]/span[1]")).click();

		Set<String> newPage = driver.getWindowHandles();
		for(String order: newPage) {
			if(!order.equals(home)) {
				driver.switchTo().window(order);
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button/p[text()='L']")).click();//size
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("pincode-code")).sendKeys("630003");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Bag']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='itemComponents-base-invisibleBackDrop']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='PLACE ORDER']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type = 'tel']")).sendKeys("9876543210");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='CONTINUE']")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}