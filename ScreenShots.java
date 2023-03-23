package seleniumPgms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class ScreenShots {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "E:\\Downloads\\drivers\\geckodriver.exe");		
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();


		WebElement MenMain = driver.findElement(By.xpath("/html/body/div/div/div/header/div[2]/nav/div/div/div/a"));
		Actions act = new Actions(driver);
		act.moveToElement(MenMain).build().perform();
		WebElement MenSub = driver.findElement(By.xpath("html/body/div/div/div/header/div[2]/nav/div/div/div/div/div/div/li/ul/li[2]/a"));
		MenSub.click();
		
		TakesScreenshot sshot =(TakesScreenshot)driver;
		File source = sshot.getScreenshotAs(OutputType.FILE);
		File Desti = new File("E:\\WorkPlace\\screenshot\ril.jpeg");
		Files.copy(source, Desti);
		driver.quit();
	}

}
