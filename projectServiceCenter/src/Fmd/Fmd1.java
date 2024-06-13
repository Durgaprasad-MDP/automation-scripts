package Fmd;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fmd1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));

        driver.get("https://fieldmetadatareport-dev-ed.develop.my.salesforce.com/");
       
        
        
        wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).sendKeys("durgaprasad.midathani@fieldmetadatareport.com");
        driver.findElement(By.id("password")).sendKeys("Prasad@1481");
        
        driver.findElement(By.id("Login")).click();

        driver.manage().window().maximize();
        
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-target-selection-name=\"181c7013df09423d8f755b49c067f6f3\"]"))).click();

        
       //wait.until(ExpectedConditions.elementToBeClickable(By.className("slds-r2"))).click();
        Thread.sleep(6000);
        WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]")));
        searchInput.sendKeys("FieldMetaDataReport");
        Thread.sleep(6000);

        WebElement searchResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@data-label,'FieldMetaDataReport')]//*[@class='slds-truncate']")));
        searchResult.click();
        Thread.sleep(6000); 
        WebElement object = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'--None--')]")));
        object.sendKeys("order");
        Thread.sleep(6000);
        
        
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Select Object']/following-sibling::*//button"))).click();
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Select Object']/following-sibling::*//*[@class='slds-truncate' and text()='contract']"))).click();
        Thread.sleep(6000);
        WebElement Export = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Export']")));
        Export.click();
        
        
        
	}

}
