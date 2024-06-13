package contractmanagement;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class xyz6 {

    public static void main(String[] args) throws InterruptedException, IOException {
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

        // Read data from Excel
        FileInputStream file = new FileInputStream(new File("C:\\Users\\durga\\OneDrive\\Documents\\excelrecords.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0);

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        int i = 0;
        for (Row row : sheet) {
            if (row.getRowNum() == 0) {
                continue; // Skip header row
            }

            String firstName = row.getCell(0).getStringCellValue();
            String lastName = row.getCell(1).getStringCellValue();
            String company = row.getCell(2).getStringCellValue();
            String email = row.getCell(3).getStringCellValue();

            if (i == 0) {
                WebElement newButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='New']")));
                jsExecutor.executeScript("arguments[0].scrollIntoView(true);", newButton);
                jsExecutor.executeScript("arguments[0].click();", newButton);
                Thread.sleep(6000);
            } else {
                WebElement saveAndNewButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='SaveAndNew']")));
                jsExecutor.executeScript("arguments[0].scrollIntoView(true);", saveAndNewButton);
                jsExecutor.executeScript("arguments[0].click();", saveAndNewButton);
                Thread.sleep(6000);
            }

            // Enter lead details
            WebElement firstN = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='firstName']")));
            firstN.click();
            firstN.sendKeys(firstName);

            WebElement lastNameField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='lastName']")));
            jsExecutor.executeScript("arguments[0].scrollIntoView(true);", lastNameField);
            lastNameField.click();
            lastNameField.sendKeys(lastName);

            WebElement companyField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='Company']")));
            companyField.click();
            companyField.sendKeys(company);

            WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='Email']")));
            emailField.click();
            emailField.sendKeys(email);

            i++;
        }

        // Close the workbook and driver
        workbook.close();
        driver.quit();
    }
}
