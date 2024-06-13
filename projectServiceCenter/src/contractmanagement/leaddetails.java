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

public class leaddetails {

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
		
        WebElement c1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-id='0KDHr00000169dyOAA']")));
        c1.click();
        
 
        WebElement gl = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Search for Leads']")));
        gl.click();
        gl.sendKeys("Mile");

        WebElement gl1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='Milen Lambha']")));
        gl1.click();
       

/**
        WebElement g2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Search for Active Leads']")));
        g2.click();
        g2.sendKeys("Milen Lambha");

   
        Thread.sleep(3000);
        
        WebElement gl1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='L-0005']")));
        gl1.click();
**/
/**
        WebElement gl1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='L-0005']")));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", gl1);
        gl1.click();
     **/
        
/**
        WebElement g3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Search for Completed Leads']")));
        g3.click();
        g3.sendKeys("Nikki");

   
        Thread.sleep(3000);
        
        WebElement gl2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='L-0013']")));
        gl2.click();
**/
	}

}
