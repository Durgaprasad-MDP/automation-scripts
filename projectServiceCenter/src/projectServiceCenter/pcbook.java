package projectServiceCenter;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pcbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
        searchInput.sendKeys("Products");
        Thread.sleep(4000);

        WebElement searchResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@id,'Product2')]//*[@class='slds-truncate']")));
        searchResult.click();
        Thread.sleep(4000); 
        
        
        WebElement c1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-recordid='01tDn000006oFCxIAM']")));
        c1.click();

		
        WebElement fn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='First Name']")));
        fn.click();
        fn.sendKeys("james");
        Thread.sleep(3000);
        

        WebElement ln = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Last Name']")));
        ln.click();
        ln.sendKeys("Bond");
        Thread.sleep(3000);
        
        WebElement eid = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Employee Id (Ex gbz123)']")));
        eid.click();
        eid.sendKeys("vt00023");
        
        Thread.sleep(3000);
      
	
   
        
 
	}

}
