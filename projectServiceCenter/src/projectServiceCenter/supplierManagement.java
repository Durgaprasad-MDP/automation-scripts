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

public class supplierManagement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
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
        searchInput.sendKeys("Products");
        Thread.sleep(4000);

        WebElement searchResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@id,'Product2')]//*[@class='slds-truncate']")));
        searchResult.click();
        Thread.sleep(4000); 
        
        WebElement New = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='New']")));
        New.click();
        Thread.sleep(4000);
        
        
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='text']"))).sendKeys("harddisk");
        
        Thread.sleep(4000);
 
        
      //  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='label inputLabel uiPicklistLabel-left form-element__label uiPicklistLabel']/following-sibling:://span[text()='Product Family']"))).click();
        
       
       WebElement pc = driver.findElement(By.xpath("//*[@class='uiInput uiInputSelect forceInputPicklist uiInput--default uiInput--select']//*[text()='USD - U.S. Dollar']"));
       pc.click();
       
       // driver.findElement(By.xpath("//*[@class='uiInput uiInputSelect forceInputPicklist uiInput--default uiInput--select']//*[text()='GBP - British Pound']")).click();

        
     
        //driver.findElement(By.xpath("//*[@class='uiInput uiInputSelect forceInputPicklist uiInput--default uiInput--select']//*[text()='GBP - British Pound']")).click();

        //GBP - British Pound
        
        Thread.sleep(5000);

    	   
      // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//lightning-base-combobox-item[contains(@class, 'slds-media slds-listbox__option slds-media_center slds-media_small slds-listbox__option_plain') and @data-value='Web']"))).click();
        //Thread.sleep(5000);
        
        
        
        WebElement Save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Save']")));
        Save.click();
        
        Thread.sleep(5000);

        WebElement relatedTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-tab-value='relatedListsTab' and @data-label='Related']")));
        relatedTab.click();
        
      //  WebElement relatedTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='relatedListsTab__item']")));
      //  relatedTab.click();
        //Thread.sleep(6000); 
        
        
      //*[@data-target-selection-name="relatedListsTabTab"]//*[@title='Related']
        		
       // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-target-selection-name='sfdc:RecordField.Product2.CurrencyIsoCode']/following::*//*[@href=\"javascript:void(0);\"]"))).click();

        
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-target-selection-name="sfdc:RecordField.Product2.CurrencyIsoCode"]//*[@href="javascript:void(0);"]"))).click();
       // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Product Currency']/following-sibling::*//*[@class='select' and text()='GBP - British Pound']"))).click();
       // Thread.sleep(6000);

        
      //  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-target-selection-name='sfdc:RecordField.Product2.ProductCode']/following::*//*[@type='text']"))).sendKeys("kat");

        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Stage']/following-sibling::*//*[@data-value='Prospecting']"))).click();

        
    /**    
       WebElement pn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@type,text)]//*[@class=' input']")));
pn.click();
pn.sendKeys("sai");
       
       
        **/
        
    /**    
     // Assuming you already have a WebDriver instance created

     // Find the input element by its data-target-selection-name attribute
    // WebElement productNameInput = driver.findElement(By.xpath("//div[@data-target-selection-name='sfdc:RecordField.Product2.Name']//input[@class='input']"));

     // Enter text into the input field
     //productNameInput.sendKeys("Your text goes here");

    // WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
     //WebElement productNameInput = wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class=\" input\"]//input[@data-interactive-lib-uid=\"6\"]")));
     //productNameInput.sendKeys("hai");
        **/
       /** 
        WebElement pn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@data-target-selection-name,'sfdc:RecordField.Product2.Name')]//*[@class='input']")));
        pn.click();
       // WebElement pn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-target-selection-name='sfdc:RecordField.Product2.Name']")));
        pn.sendKeys("Mouse");
        
        
       // WebElement productNameInput = driver.findElement(By.xpath("//div[@data-target-selection-name='sfdc:RecordField.Product2.Name']//input[@class='input']"));
       // productNameInput.sendKeys("Mouse");                  //input[@class=" input"]//input[@data-interactive-lib-uid="6"]
        
      //  WebElement productcode = driver.findElement(By.xpath("//div[@data-target-selection-name='sfdc:RecordField.Product2.ProductCode']"));
        //productcode.click();
        //productcode.sendKeys("ML_78");
       // data-target-selection-name="sfdc:RecordField.Product2.ProductCode"
        WebElement Input1 = driver.findElement(By.xpath("//*[@data-target-selection-name='sfdc:RecordField.Product2.Name']"));
        Input1.sendKeys("Mouse");
        
        WebElement productcode = driver.findElement(By.xpath("//div[@data-target-selection-name='sfdc:RecordField.Product2.ProductCode']"));
        
        
        productcode.click();
        productcode.sendKeys("ML_78");
        
       // WebElement c1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='Cases']")));
        //c1.click();
        
        
        
        WebElement productNameInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Product Name']/following::input[1]")));

        // Enter text into the "Product Name" field
        productNameInput.sendKeys("mic");
        **/
	}

}

