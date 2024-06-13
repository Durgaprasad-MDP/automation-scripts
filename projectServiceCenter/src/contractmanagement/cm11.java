package contractmanagement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cm11 {

	public static void main(String[] args) throws Exception {

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
       /** 
        WebElement sv = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='slds-button slds-button_brand b1' and text()='I need a sourcing event']")));
        sv.click();
        Thread.sleep(6000);
        **/
        WebElement contract = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='slds-button slds-button_brand b1' and text()='I need a contract']")));
        contract.click();
        Thread.sleep(6000);
        
        WebElement contract1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='slds-button slds-button_brand b1' and text()='New Services With New Supplier']")));
        contract1.click();
        Thread.sleep(6000);
        
        WebElement title = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Please Provide a Title']")));
        title.click();
        title.sendKeys("anil");
        Thread.sleep(6000);
        
        WebElement title2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Add Lead Amount']")));
        title2.click();
        title2.sendKeys("anil");
        Thread.sleep(6000);
        
        WebElement title3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Add Service Date']")));
        title3.click();
        title3.sendKeys("Dec 28, 2023");
        Thread.sleep(6000);
		

        WebElement title4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Add Company Name']")));
        title4.click();
        title4.sendKeys("v tech");
        Thread.sleep(6000);
        

        WebElement Save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save&Next']")));
         Save.click();
         
         WebElement y = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
         y.click();
	}

}
