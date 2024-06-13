package projectServiceCenter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class emailtocase {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));

        driver.get("https://login.salesforce.com/");
       
        
        
        wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).sendKeys("durgaprasad.midathani@vamritech.com.remsdev4");
        driver.findElement(By.id("password")).sendKeys("Prasad@1234");
        
        driver.findElement(By.id("Login")).click();

        driver.manage().window().maximize();
        
        WebElement New = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-key='setup']")));
        New.click();
        Thread.sleep(4000);
        
        
        
        WebElement ulElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("ul.scrollable[data-aura-rendered-by='170:220;a']")));

        ulElement.click();
        //class="popupTargetContainer menu--nubbin-top uiPopupTarget uiMenuList uiMenuList--right uiMenuList--default " and 
         
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class=\"headerTrigger  tooltip-trigger uiTooltip\"] //*[@id=\"148:220;a\"]")));
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-aura-rendered-by=\"170:220;a\"]")));

        //data-aura-rendered-by="170:220;a"
      //*[@class="headerTrigger  tooltip-trigger uiTooltip"] //*[@id="148:220;a"]
        
	}

}
