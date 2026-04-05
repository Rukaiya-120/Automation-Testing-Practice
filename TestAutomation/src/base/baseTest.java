package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseTest {

	public static WebDriver driver;

    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://app.peopledesk.io/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void tearDown() {
        driver.quit();
    }
}
