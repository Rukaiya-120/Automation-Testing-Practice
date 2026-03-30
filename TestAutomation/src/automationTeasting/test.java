package automationTeasting;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.peopledesk.io/");
		driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Input field
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("input[type='text']")
        )).sendKeys("31026");
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("#root > div > div:nth-child(1) > div > form > div.auth-wrapper-page > div > div > div.auth-login-body > div > div:nth-child(2) > div > div > div > input")
        )).sendKeys("betopia2202");
        driver.findElement(By.cssSelector(".btn")).submit();
//        wait.until(ExpectedConditions.elementToBeClickable(
//                By.xpath("//button")
//        )).click();
        wait.until(ExpectedConditions.elementToBeClickable(
                By.className("item-name")
        )).click();
        By searchBox = By.cssSelector("input.ant-select-selection-search-input");
       wait.until(ExpectedConditions.elementToBeClickable(searchBox)).click();
       driver.findElement(searchBox).sendKeys("Sup");


   wait.until(ExpectedConditions.elementToBeClickable(
       By.xpath("//*[@id=\"30568\"]")
   )).click();
        String title = driver.getTitle();
        System.out.println("The tiltle of the test website is: "+title);
    	System.out.println("Test Completed Successfully");
        
	}

}
