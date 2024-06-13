package contractmanagement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cm12 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\Downloads\\chromedriver-win32 (3)\\chromedriver-win32\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));

        driver.get("https://vamriinternaldev-dev-ed.develop.my.salesforce.com");
       
        
        
        wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).sendKeys("durgaprasad.midathani@vamriinternaldev.com");
        driver.findElement(By.id("password")).sendKeys("Prasad@1481");
        
        driver.findElement(By.id("Login")).click();

        driver.manage().window().maximize();
        
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-target-selection-name=\"181c7013df09423d8f755b49c067f6f3\"]"))).click();

        
       //wait.until(ExpectedConditions.elementToBeClickable(By.className("slds-r2"))).click();
        Thread.sleep(6000);
        WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]")));
        searchInput.sendKeys("Contract Management");
        Thread.sleep(6000);

        WebElement searchResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@data-label,'Contract Management')]//*[@class='slds-truncate']")));
        searchResult.click();
        Thread.sleep(6000); 
        
        WebElement searchResult1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-id='0KDHr00000169dyOAA']")));
        searchResult1.click();
        Thread.sleep(6000); 
        
        WebElement New = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='slds-button slds-button_brand' and text()='Create New']")));
        New.click();
        Thread.sleep(6000);
        
        WebElement sv = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='slds-button slds-button_brand b1' and text()='I need a sourcing event']")));
        sv.click();
        Thread.sleep(6000);
        
       // WebElement cmp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='slds-form-element__label slds-no-flex']")));
        
        WebElement cmp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='slds-required' and text()='Please provide a title of this lead']")));
                cmp.click();
        cmp.sendKeys("test2");
        Thread.sleep(3000);
        
	}

}
