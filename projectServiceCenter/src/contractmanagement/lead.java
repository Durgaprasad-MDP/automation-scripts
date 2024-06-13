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

public class lead {

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
        
        WebElement searchResult1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[id='012Hr000000u0QhIAI']")));
        searchResult1.click();
        Thread.sleep(6000); 
        
        //id="012Hr000000u0QhIAI"
        WebElement c1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-id='Lead']")));
        c1.click();

       WebElement New = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='New']")));
        New.click();
        Thread.sleep(6000);
        

        WebElement fn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='First Name']")));
        fn.click();
        fn.sendKeys("M");
        Thread.sleep(3000);
        
        WebElement ln = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Last Name']")));
        ln.click();
        ln.sendKeys("durga");
        Thread.sleep(3000);
        
        WebElement cmp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='Company']")));
        cmp.click();
        cmp.sendKeys("vpl");
        Thread.sleep(3000);
        
        
        WebElement Co1 =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Lead Status']/following-sibling::*//button")));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", Co1);
             Co1.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Lead Status']/following-sibling::*//*[@class='slds-truncate' and text()='Working - Contacted']"))).click();
        Thread.sleep(6000);
        
        WebElement Save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
        Save.click();
        
        
	}

}
