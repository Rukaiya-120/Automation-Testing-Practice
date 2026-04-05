package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class employeeManagementPage {

    WebDriver driver;

    public employeeManagementPage(WebDriver driver) {
        this.driver = driver;
    }

    By itemName = By.xpath("//img[@alt='Employee Management']");
    By filter = By.xpath("//span[text()='Filter']");

    public void selectSupervisor(String name) {
        driver.findElement(itemName).click();
        driver.findElement(filter).click();
        driver.findElement(By.xpath("//*[@id='30568']")).click();
    }
}
