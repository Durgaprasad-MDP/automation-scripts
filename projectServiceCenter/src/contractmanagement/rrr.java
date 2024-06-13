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

public class rrr {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\Downloads\\chromedriver-win32 (5)\\chromedriver-win32\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));
        
        driver.get("https://login.salesforce.com/");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).sendKeys("salesforcedp@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Praad@1111");
        driver.findElement(By.id("Login")).click();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        driver.findElement(By.className("slds-r5")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]"))).sendKeys("Opportunities");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@id,'al-menu-dropdown-items')]//*[@class='slds-truncate']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-aura-class='forceActionLink' and @title='New']"))).click();

        WebElement Co3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-interactive-lib-uid='6']")));
        Co3.click();
        Co3.sendKeys("Nov 18, 2024");
        
        WebElement Co4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-interactive-lib-uid='7']")));
        Co4.click();
        Co4.sendKeys("test1233");
        
        WebElement Co5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-interactive-lib-uid='10']")));
        Co5.click();

        
     
     //   WebElement closedate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='CloseDate']")));
       // closedate.click();
        
        /**
        WebElement Co5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-interactive-lib-uid='10']")));
        Co5.click();

        // Debug logging
        System.out.println("Prospecting dropdown clicked");

        // Locate and click the "Qualification" option using JavaScript Executor
        WebElement qualificationOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='select' and @data-interactive-lib-uid='10' and text()='Qualification']")));
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", qualificationOption);

        // Debug logging
        System.out.println("Qualification option clicked");

        // Capture page source for debugging
        System.out.println(driver.getPageSource());
        
        Thread.sleep(3000);
        driver.quit();
    **/
    }
}
