package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

	 WebDriver driver;

	    public loginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    By username = By.cssSelector("input[type='text']");
	    By password = By.cssSelector("input[type='password']");
	    By loginBtn = By.cssSelector(".btn");

	    public void login(String user, String pass) {
	        driver.findElement(username).sendKeys(user);
	        driver.findElement(password).sendKeys(pass);
	        driver.findElement(loginBtn).click();
	    }
}
