package contractmanagement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class opps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\Downloads\\chromedriver-win32 (5)\\chromedriver-win32\\chromedriver.exe");

	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications");
	        WebDriver driver = new ChromeDriver(options);
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));

	        // Navigate to Salesforce login page
	        driver.get("https://login.salesforce.com/");

	        // Log in to Salesforce
	        wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).sendKeys("salesforcedp@gmail.com");
	        driver.findElement(By.id("password")).sendKeys("Prasad@1111");
	        driver.findElement(By.id("Login")).click();
	        driver.manage().window().maximize();
	        
	        /**
	        driver.findElement(By.className("slds-r6")).click();
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]"))).sendKeys("Opportunities");
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@id,'al-menu-dropdown-items')]//*[@class='slds-truncate']"))).click();
	       
	        **/
	        
	     // Navigate to Leads
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-aura-rendered-by=\"462:83;a\"]"))).click();
	        Thread.sleep(6000);
	        WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]")));
	        searchInput.sendKeys("Opportunities");
	        Thread.sleep(6000);
	        WebElement searchResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@data-label,'Opportunities')]//*[@class='slds-truncate']")));
	        searchResult.click();
	        Thread.sleep(6000);
	        
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-aura-class='forceActionLink' and @title='New']"))).click();

	        WebElement Co3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"CloseDate\"]")));
	        Co3.click();
	        Co3.sendKeys("Nov 18, 2024");
	        
	        WebElement Co4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"Name\"]")));
	        Co4.click();
	        Co4.sendKeys("test12");

	        WebElement Co1 =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Stage']/following-sibling::*//button")));
	        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", Co1);
	             Co1.click();
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Stage']/following-sibling::*//*[@class='slds-truncate' and text()='Qualification']"))).click();
	        Thread.sleep(6000);
	        
	        WebElement Save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
	        Save.click();
	        Thread.sleep(6000);

	        
	        WebElement p1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title=\"Show 4 more actions\"]")));
	        p1.click();
	        
	       // WebElement Save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
	        //Save.click();
	        
	      
	}

}
