package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class profilePage {

	 WebDriver driver;

	    public profilePage(WebDriver driver) {
	        this.driver = driver;
	    }

	    By profileIcon = By.xpath("//img[@alt='Profile']");
	    By changePassword = By.xpath("//h3[contains(text(),'Change Password')]");
	    By logoutBtn = By.xpath("//h3[contains(text(),'Log Out')]");

	    By oldPass = By.name("oldPassword");
	    By newPass = By.name("newPassword");
	    By confirmPass = By.name("confirmPassword");

	    By saveBtn = By.xpath("//button[contains(text(),'Save')]");

	    public void openProfile() {
	        driver.findElement(profileIcon).click();
	    }

	    public void changePassword(String oldP, String newP) {
	        openProfile();
	        driver.findElement(changePassword).click();

	        driver.findElement(oldPass).sendKeys(oldP);
	        driver.findElement(newPass).sendKeys(newP);
	        driver.findElement(confirmPass).sendKeys(newP);

	        driver.findElement(saveBtn).click();
	    }

	    public void logout() {
	        openProfile();
	        driver.findElement(logoutBtn).click();
	    }

}
