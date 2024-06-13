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

public class formfilling {

	public static void main(String[] args) throws Exception {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
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
       wait.until(ExpectedConditions.elementToBeClickable(By.className("slds-r6"))).click();
        Thread.sleep(3000);

        WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]")));
        searchInput.sendKeys("PATS Service Center");
        Thread.sleep(6000);

        WebElement searchResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@data-label,'PATS Service Center')]//*[@class='slds-truncate']")));
        searchResult.click();
        Thread.sleep(6000); 
   
        WebElement searchResult1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@aria-label='Show Navigation Menu']")));
        searchResult1.click();
        Thread.sleep(6000);
        
       
        WebElement csf = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-label='Case Submit Form']")));
        csf.click();
        
        
        WebElement fn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='First Name']")));
        fn.click();
        fn.sendKeys("james");
        Thread.sleep(3000);
        

        WebElement ln = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Last Name']")));
        ln.click();
        ln.sendKeys("Bond");
        Thread.sleep(3000);
        
        WebElement Email = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Email Address']")));
        Email.click();
        Email.sendKeys("durgaprasadahm@gmail.com");

        Thread.sleep(3000);
        
        WebElement eid = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=\"Employee Id (Ex gbz123)\"]")));
        JavascriptExecutor jsExecutor2 = (JavascriptExecutor) driver;
        jsExecutor2.executeScript("arguments[0].scrollIntoView(true);", eid);
        eid.click();
        eid.sendKeys("VTooo22");
        Thread.sleep(3000);
	
        

        WebElement isyqr = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@aria-label=\"Select an Option\"]")));
        isyqr.click();
        Thread.sleep(3000);
         WebElement acr = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-value=\"Account Receivable\"]")));

       // WebElement acr = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-value=\"Policy Question\"]")));
        acr.click();
        Thread.sleep(3000); 
       // WebElement acr = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-value=\"Account Receivable\"]")));

      //*[@data-value="Account Receivable"]
        //*[@data-value="Policy Question"]

        //title="Policy Question"
        
        
        WebElement acro = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@aria-label=\"Select an Option\"]")));
        acro.click();
        Thread.sleep(3000); 
      //*[@aria-label="Select an Option"]
      //*[@data-value="How-to"]
        

        WebElement acroh = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-value=\"How-to\"]")));
        acroh.click();
        Thread.sleep(3000); 
        
        
        

        WebElement ta = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class=\"slds-textarea\"]")));
        ta.click();
        ta.sendKeys("case is created");
        Thread.sleep(3000); 
        
        
        WebElement cb = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class=\"slds-checkbox__label\"]")));
        cb.click();
        Thread.sleep(3000); 
	
        
        //class="slds-textarea"
        //WebElement conb = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Outline need for urgency')]//*[@class=\"slds-form-element__control slds-grow textarea-container\"]")));
      
       // WebElement conb = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Outline need for urgency')]//*[@class=\"slds-textarea\"]")));
        WebElement conb = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=\"Please outline need for urgency\"]")));

      //*[@placeholder="Please outline need for urgency"]

        JavascriptExecutor jsExecutor3 = (JavascriptExecutor) driver;
        jsExecutor3.executeScript("arguments[0].scrollIntoView(true);", conb);    
        conb.click();
        conb.sendKeys("message");
        Thread.sleep(3000); 

       // WebElement upload = driver.findElement(By.id("newFile-56"));
        
        //Upload the file
        //upload.sendKeys("C:\\Users\\durga\\OneDrive\\Desktop\\GetCloudyConsultingLogo.png");
       // "C:\Users\durga\OneDrive\Desktop\eclipse.png"
        //upload.sendKeys("C:\\Users\\durga\\OneDrive\\Desktop\\eclipse.png");

      //  "C:\Users\durga\OneDrive\Desktop\GetCloudyConsultingLogo.png"
        
        
       // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='newFile-56']"))).click();
        
        //WebElement UPLOAD = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='newFile-56']")));
        //UPLOAD.sendKeys("C:\\Users\\durga\\Downloads\\20230823_182740.jpg\\");
       // 

      //*[@type="file"]
        // clicking on + button
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@variant=\"neutral\"]"))).click();

        WebElement Submit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
        
        Submit.click();
	}

}
