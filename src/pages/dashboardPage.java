package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dashboardPage {

    WebDriver driver;

    public dashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    By itemName = By.className("item-name");
    By searchBox = By.cssSelector("input.ant-select-selection-search-input");

    public void selectSupervisor(String name) {
        driver.findElement(itemName).click();
        driver.findElement(searchBox).sendKeys(name);
        driver.findElement(By.xpath("//*[@id='30568']")).click();
    }

}
