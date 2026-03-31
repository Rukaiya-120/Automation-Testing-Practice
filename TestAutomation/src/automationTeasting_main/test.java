package automationTeasting_main;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        
        String title = driver.getTitle();
        System.out.println("The tiltle of the test website is: "+title);
        

        logIn(driver,wait);

        supervisor(driver,wait);
        
        //changePass( driver,  wait);
        
        logout(driver,wait);
       
        

    	System.out.println("Test Completed Successfully");
        
	}
	
	public static void logIn(WebDriver driver, WebDriverWait wait)
	{
        // Input field
		
	    wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.cssSelector("input[type='text']")
	        )).sendKeys("31026");
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.name("password")
        )).sendKeys("betopia2201");
        driver.findElement(By.cssSelector(".btn")).submit();
	}
	
	public static void supervisor(WebDriver driver, WebDriverWait wait) {
	    wait.until(ExpectedConditions.elementToBeClickable(
	            By.className("item-name")
	    )).click();
	    By searchBox = By.cssSelector("input.ant-select-selection-search-input");
	   wait.until(ExpectedConditions.elementToBeClickable(searchBox)).click();
	   driver.findElement(searchBox).sendKeys("Sup");
	   wait.until(ExpectedConditions.elementToBeClickable(
		       By.xpath("//*[@id=\"30568\"]")
		   )).click();
	}
	
	public static void changePass(WebDriver driver, WebDriverWait wait) {
        WebElement image = driver.findElement(By.xpath("//img[@alt='Profile']"));
		 
		image.click();
		WebElement changePass = driver.findElement(By.xpath("//h3[contains(text(),'Change Password')]"));
		changePass.click();

		WebElement oldPass = wait.until(
		    ExpectedConditions.visibilityOfElementLocated(By.name("oldPassword"))
		);
		WebElement newPass =  wait.until(
			    ExpectedConditions.visibilityOfElementLocated(By.name("newPassword")));
		WebElement confirmPass =  wait.until(
			    ExpectedConditions.visibilityOfElementLocated(By.name("confirmPassword")));
		oldPass.sendKeys("betopia2202");
		newPass.sendKeys("betopia2201");
		confirmPass.sendKeys("betopia2201");
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).submit();
		driver.findElement(By.xpath("//button[contains(text(),'Reset')]")).submit();
		
	}

	
	public static void logout(WebDriver driver, WebDriverWait wait) {
        WebElement image = driver.findElement(By.xpath("//img[@alt='Profile']"));
		image.click();
		WebElement logoutClick = driver.findElement(By.xpath("//h3[contains(text(),'Log Out')]"));
		logoutClick.click();
	}




}
