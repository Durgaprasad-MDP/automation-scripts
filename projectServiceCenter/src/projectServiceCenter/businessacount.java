package projectServiceCenter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class businessacount {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\Downloads\\chromedriver-win32 (3)\\chromedriver-win32\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));

        driver.get("https://remsdev4-dev-ed.my.salesforce.com/");
       
        
        
        wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).sendKeys("durgaprasad.midathani@vamritech.com.remsdev4");
        driver.findElement(By.id("password")).sendKeys("Prasad@1234");
        
        driver.findElement(By.id("Login")).click();

        driver.manage().window().maximize();
        
        Thread.sleep(3000);
       wait.until(ExpectedConditions.elementToBeClickable(By.className("slds-r1"))).click();
        Thread.sleep(6000);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]"))).sendKeys("Accounts");
        Thread.sleep(3000);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@id,'al-menu-dropdown-items')]//*[@class='slds-truncate']"))).click();
                
          Thread.sleep(2000);
          
WebElement accountNew = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='New']")));
          
          accountNew.click();
          
          Thread.sleep(2000);
          
          
          WebElement pt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Business Account']")));
          JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
          jsExecutor.executeScript("arguments[0].scrollIntoView(true);", pt);
          pt.click();
          
          WebElement nxt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']")));
          nxt.click();
          Thread.sleep(6000);
          
          WebElement accountNameInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='Name']")));

          // Click on the Account Name field
          accountNameInput.click();
       
          accountNameInput.sendKeys("Anil G");
        /**  
          WebElement accountWebsite = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Account_Website']")));

          // Click on the Account Name field
          accountWebsite.click();
       
          accountWebsite.sendKeys("www.vamritech.com");
          
          
          Thread.sleep(2000);
          
          WebElement pc = driver.findElement(By.xpath("//*[@class='uiInput uiInputSelect forceInputPicklist uiInput--default uiInput--select']//*[text()='USD - U.S. Dollar']"));
          pc.click();
        
          
         // WebElement pt1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Business Account']")));
         // WebElement pt1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-value='USD - U.S. Dollar']")));
          WebElement pt1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));

          JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;
          jsExecutor1.executeScript("arguments[0].scrollIntoView(true);", pt1);
          pt.click();
          **/
          WebElement Save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
          Save.click();
          
	}

}
