package contractmanagement;


	

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class leadmultiplee2 {

    public static void main(String[] args) throws Exception {
        // Setting up the Chrome WebDriver
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

        for (int i = 0; i < 10; i++) {
            // Click the New button to create a new lead
            WebElement newButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@title='New']")));
            newButton.click();
            Thread.sleep(6000);

            // Generate random data for the lead
            String firstName = getRandomString();
            String lastName = getRandomString();
            String company = getRandomString();

            // Fill in the lead details
            WebElement firstNameField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='firstName']")));
            firstNameField.click();
            firstNameField.sendKeys(firstName);

            WebElement lastNameField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='lastName']")));
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            jsExecutor.executeScript("arguments[0].scrollIntoView(true);", lastNameField);
            lastNameField.click();
            lastNameField.sendKeys(lastName);

            WebElement companyField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='Company']")));
            companyField.click();
            companyField.sendKeys(company);

            // Save the lead
            WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='Save & New']")));
            saveButton.click();
            Thread.sleep(6000);
            
            // Click the New button again to create a new lead
            newButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@title='New']")));
            newButton.click();
            Thread.sleep(6000);
        }

        // Close the browser
        driver.quit();
    }

    private static String getRandomString() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        int length = 10; // length of the random string
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }
}
