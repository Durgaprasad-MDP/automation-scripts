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

public class Productandpricebook {

	public static void main(String[] args) throws Exception {

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
        
        Thread.sleep(3000);
       wait.until(ExpectedConditions.elementToBeClickable(By.className("slds-r1"))).click();
        Thread.sleep(6000);

        WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]")));
        searchInput.sendKeys("PATS Service Center");
        Thread.sleep(6000);

        WebElement searchResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@data-label,'PATS Service Center')]//*[@class='slds-truncate']")));
        searchResult.click();
        Thread.sleep(6000); 
        
        WebElement c1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='Cases']")));
        c1.click();

       WebElement New = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='New']")));
        New.click();
        Thread.sleep(6000);
                
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

       WebElement ct = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Category']/following-sibling::*//button")));
       JavascriptExecutor jsExecutor2 = (JavascriptExecutor) driver;
       jsExecutor2.executeScript("arguments[0].scrollIntoView(true);", ct);
       ct.click(); 
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Category']/following-sibling::*//*[@class='slds-truncate' and text()='Catalog']"))).click();
        Thread.sleep(6000);

        WebElement Art =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Is the request for you']/following-sibling::*//button")));
        JavascriptExecutor jsExecutor3 = (JavascriptExecutor) driver;
        jsExecutor3.executeScript("arguments[0].scrollIntoView(true);", Art);
        Art.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Is the request for you']/following-sibling::*//*[@class='slds-truncate' and text()='Yes']"))).click();

        Thread.sleep(6000);

        
      WebElement sc =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Sub Category']/following-sibling::*//button")));
      JavascriptExecutor jsExecutor4 = (JavascriptExecutor) driver;
      jsExecutor4.executeScript("arguments[0].scrollIntoView(true);", sc);
      sc.click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Sub Category']/following-sibling::*//*[@class='slds-truncate' and text()='Tracking Request']"))).click();
      Thread.sleep(6000);

      WebElement Save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
      Save.click();
   
        
	}

}
