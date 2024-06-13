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

public class multipleleadrecords {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		
		// Setting up the Chrome WebDriver
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
        
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-aura-rendered-by=\"462:83;a\"]"))).click();

        
        //wait.until(ExpectedConditions.elementToBeClickable(By.className("slds-r2"))).click();
         Thread.sleep(6000);
         WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]")));
         searchInput.sendKeys("Leads");
         Thread.sleep(6000);
         
         WebElement searchResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@data-label,'Leads')]//*[@class='slds-truncate']")));
         searchResult.click();
         Thread.sleep(6000); 
         
         
         WebElement searchResult1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@title=\"New\"]")));
         searchResult1.click();

         Thread.sleep(6000); 
       //div[@title="New"]
         
         
        		 

                 WebElement searchResult2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"firstName\"]")));
                 searchResult2.click(); 
                 
                 searchResult2.sendKeys("Leads");
      /**   
         WebElement searchResult3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"lastName\"]")));
         searchResult3.click(); 
         
         searchResult3.sendKeys("Leads");
        **/ 
         WebElement pt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"lastName\"]")));
         JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
         jsExecutor.executeScript("arguments[0].scrollIntoView(true);", pt);
         pt.click();
         pt.sendKeys("records");
        
         
         WebElement searchResult4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"Company\"]")));
         searchResult4.click(); 
         
         searchResult4.sendKeys("vtech");
         //name="Company"
       
         
         WebElement searchResult5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"SaveEdit\"]")));
         searchResult5.click(); 
         
         WebElement contract = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='slds-truncate' and text()='Leads']")));
         contract.click();
         Thread.sleep(6000);
         
         WebElement newButton1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@title='New']")));
         newButton1.click();
         Thread.sleep(6000);
         
         //name="SaveEdit"
         
/**
        // Wait for navigation to the Salesforce homepage
        wait.until(ExpectedConditions.urlContains("home"));

        // Retry mechanism to wait for the App Launcher button
        WebElement appLauncherButton = retryForSelector(driver, wait, By.className("slds-icon-waffle"));
        appLauncherButton.click();

        // Wait for the app launcher menu to open
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("appLauncherMenu")));

        // Retry mechanism to wait for the search input field
        WebElement searchInput = retryForSelector(driver, wait, By.cssSelector("input.slds-input[type='search']"));
        searchInput.sendKeys("leads");

		
		**/
	}

	private static WebElement retryForSelector(WebDriver driver, WebDriverWait wait, By className) {
		// TODO Auto-generated method stub
		return null;
	}

}
