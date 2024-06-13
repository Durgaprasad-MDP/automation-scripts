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

public class leadmultiplerecords1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\Downloads\\chromedriver-win32 (5)\\chromedriver-win32\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));

        // Navigate to Salesforce login page
        driver.get("https://login.salesforce.com/");

        // Log in to Salesforce
        wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).sendKeys("salesforcedp@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Prasad@1111");
        driver.findElement(By.id("Login")).click();
        driver.manage().window().maximize();

        // Navigate to Leads
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-aura-rendered-by='462:83;a']"))).click();
        Thread.sleep(6000);
        WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]")));
        searchInput.sendKeys("Leads");
        Thread.sleep(6000);
        WebElement searchResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@data-label,'Leads')]//*[@class='slds-truncate']")));
        searchResult.click();
        Thread.sleep(6000);

        WebElement newButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='New']")));
        newButton.click();
        Thread.sleep(6000);

        // Enter first name
        WebElement firstNameField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='firstName']")));
        firstNameField.click();
        firstNameField.sendKeys("sotware");

        // Enter last name
        WebElement lastNameField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='lastName']")));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", lastNameField);
        lastNameField.click();
        lastNameField.sendKeys("Vvtech");

        // Enter company name
        WebElement companyField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Company']")));
        companyField.click();
        companyField.sendKeys("Company");

        // Save the lead
        WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='SaveAndNew']")));
        saveButton.click();
        Thread.sleep(6000);
        
        // Enter first name
        WebElement firstNameField2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='firstName']")));
        firstNameField2.click();
        firstNameField2.sendKeys("sotware2");

        // Enter last name
        WebElement lastNameField2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='lastName']")));
        JavascriptExecutor jsExecutor2 = (JavascriptExecutor) driver;
        jsExecutor2.executeScript("arguments[0].scrollIntoView(true);", lastNameField2);
        lastNameField2.click();
        lastNameField2.sendKeys("Vvtech2");

        // Enter company name
        WebElement companyField2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Company']")));
        companyField2.click();
        companyField2.sendKeys("Company2");

        // Save the lead
        WebElement saveButton2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='SaveAndNew']")));
        saveButton2.click();
        Thread.sleep(6000);
        
        
        WebElement firstNameField3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='firstName']")));
        firstNameField3.click();
        firstNameField3.sendKeys("sotware3");

        // Enter last name
        WebElement lastNameField3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='lastName']")));
        JavascriptExecutor jsExecutor3 = (JavascriptExecutor) driver;
        jsExecutor3.executeScript("arguments[0].scrollIntoView(true);", lastNameField3);
        lastNameField3.click();
        lastNameField3.sendKeys("Vvtech3");

        // Enter company name
        WebElement companyField3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Company']")));
        companyField3.click();
        companyField3.sendKeys("Company3");

        // Save the lead
        WebElement saveButton3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='SaveAndNew']")));
        saveButton3.click();
        Thread.sleep(6000);
        
        
        
	}

}
