


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

public class xyz1 {

    public static void main(String[] args) throws InterruptedException {
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
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-aura-rendered-by=\"462:83;a\"]"))).click();
        Thread.sleep(6000);
        WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]")));
        searchInput.sendKeys("Leads");
        Thread.sleep(6000);
        WebElement searchResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@data-label,'Leads')]//*[@class='slds-truncate']")));
        searchResult.click();
        Thread.sleep(6000);

        for (int i = 1; i <= 10; i++) {
            // Click on the New button to create a new lead
            WebElement newButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@title='New']")));
            newButton.click();
            Thread.sleep(6000);

            // Enter first name
            WebElement firstNameField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='firstName']")));
            firstNameField.click();
            firstNameField.sendKeys("FirstName" + i);

            // Enter last name
            WebElement lastNameField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='lastName']")));
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            jsExecutor.executeScript("arguments[0].scrollIntoView(true);", lastNameField);
            lastNameField.click();
            lastNameField.sendKeys("LastName" + i);

            // Enter company name
            WebElement companyField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='Company']")));
            companyField.click();
            companyField.sendKeys("Company" + i);

            // Save the lead
            WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='SaveAndNew']")));
            saveButton.click();
            Thread.sleep(6000);
        }

        // Close the browser after creating leads
        driver.quit();
    }
}
