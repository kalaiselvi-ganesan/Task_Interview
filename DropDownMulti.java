package seleniumPgms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMulti {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E:\\Downloads\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://ironspider.ca/forms/dropdowns.htm");
		driver.manage().window().maximize();

		WebElement drop = driver.findElement(By.xpath("//div/form/select[@name='coffee2']"));
		Select selc= new Select(drop);

		List<WebElement> list = selc.getOptions();
		for(int i=0;i<list.size();i++)
		{
			selc.selectByIndex(i);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));;
			selc.deselectByIndex(i);
		}
	}

}


