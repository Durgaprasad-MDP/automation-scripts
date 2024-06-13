package projectServiceCenter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\Downloads\\chromedriver-win32 (3)\\chromedriver-win32\\chromedriver.exe");
			
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));
	    //WebDriver driver = new ChromeDriver();
		driver.get("https://remsdev4-dev-ed.my.salesforce.com/");
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("haritha.gajjala@vamritech.com.remsdev4");
		driver.findElement(By.name("pw")).sendKeys("HarithaViswam15");
		driver.findElement(By.name("Login")).click();
	}

}
