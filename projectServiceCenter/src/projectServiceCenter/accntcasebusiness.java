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

public class accntcasebusiness {

	public static void main(String[] args) throws Exception {

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
        WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]")));
        searchInput.sendKeys("PATS Service Center");
        Thread.sleep(6000);

        WebElement searchResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@data-label,'PATS Service Center')]//*[@class='slds-truncate']")));
        searchResult.click();
        Thread.sleep(6000); 
        
        WebElement searchResult1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@aria-label='Show Navigation Menu']")));
        searchResult1.click();
        Thread.sleep(6000);
        
       
       // data-value="Anil G"
        
        WebElement c1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='Accounts']")));
        c1.click();

        WebElement c2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-recordid='001Dn00000lLDtQIAW']")));
        c2.click();
        
        WebElement c3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='Cases']//*[@data-tab-value='customTab33']")));
        c3.click();
      //*[@title="Cases"]//*[@data-tab-value="customTab33"]
      //*[@data-recordid="001Dn00000lLDtQIAW"]
	
      //*[@data-target-reveals="sfdc:StandardButton.Case.NewCase"]
        
        WebElement c4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-target-reveals='sfdc:StandardButton.Case.NewCase']")));
        c4.click();
     
        
        WebElement c5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='slds-truncate' and text()='New']")));
        c5.click();
     
     
        
        WebElement pt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Payment and Travel Support']")));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", pt);
        pt.click();
        
        WebElement nxt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']")));
        nxt.click();
        Thread.sleep(6000);
        
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Status']/following-sibling::*//button"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Status']/following-sibling::*//*[@class='slds-truncate' and text()='Closed']"))).click();
        Thread.sleep(6000);

       
        
        WebElement Co =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Case Origin']/following-sibling::*//button")));
        JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;
        jsExecutor1.executeScript("arguments[0].scrollIntoView(true);", Co);
        Co.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Case Origin']/following-sibling::*//*[@class='slds-truncate' and text()='Phone']"))).click();
          Thread.sleep(6000);

          
        WebElement ln =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='remsdev4__Last_Name__c']")));
        ln.click();
        ln.sendKeys("rakesh");



       WebElement Co1 =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='JobTitle']/following-sibling::*//button")));
       JavascriptExecutor jsExecutor9 = (JavascriptExecutor) driver;
       jsExecutor9.executeScript("arguments[0].scrollIntoView(true);", Co1);
       Co1.click();
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='JobTitle']/following-sibling::*//*[@class='slds-truncate' and text()='Manager']"))).click();
       Thread.sleep(6000);


          
      WebElement Co3 =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@inputmode='email']")));
      JavascriptExecutor jsExecutor7 = (JavascriptExecutor) driver;
      jsExecutor7.executeScript("arguments[0].scrollIntoView(true);", Co3);
      Co3.click();
      Co3.sendKeys("durgapras88@gmail.com");
  
      WebElement Save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
      Save.click();
        
	}

}
