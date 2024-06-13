package projectServiceCenter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class caseremove {

	public static void main(String[] args) throws Exception {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\Downloads\\chromedriver-win32 (3)\\chromedriver-win32\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));

        driver.get("https://login.salesforce.com/");
       
        
        
        wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).sendKeys("durgaprasad.midathani@vamritech.com.remsdev4");
        driver.findElement(By.id("password")).sendKeys("Prasad@1234");
        
        driver.findElement(By.id("Login")).click();

        driver.manage().window().maximize();
        
        Thread.sleep(8000);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("slds-r1"))).click();
        Thread.sleep(4000);
        WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]")));
        searchInput.sendKeys("PATS Service Center");
        Thread.sleep(6000);

        WebElement searchResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@data-label,'PATS Service Center')]//*[@class='slds-truncate']")));
        searchResult.click();
        Thread.sleep(6000); 
        
        WebElement searchResult1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@aria-label='Show Navigation Menu']")));
        searchResult1.click();
        Thread.sleep(6000); 
      //*[@aria-label="Show Navigation Menu"]
        
        WebElement c1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='Cases']")));
        c1.click();
        Thread.sleep(6000); 

        WebElement oc = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='00001097']")));
        oc.click();
        Thread.sleep(6000); 
  
        WebElement relatedTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-tab-value='relatedListsTab' and @data-label='Related']")));
        relatedTab.click();
        Thread.sleep(6000); 

        
        
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='slds-button slds-button_icon-border-filled']"))).click();
        Thread.sleep(6000); 

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='slds-button slds-button_icon-border-filled']/following-sibling::*//*[@title='Update Case Product']"))).click();
        Thread.sleep(6000); 

       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='01uDn000004gM4tIAE']//*[@class='slds-checkbox_faux']"))).click();

       	
        WebElement pt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"check-button-label-58-1396\"]")));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", pt);
        pt.click();
        		
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Add Product')]"))).click();

       
        
}
}