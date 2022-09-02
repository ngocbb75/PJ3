package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverHelper {
    private static WebDriver driver = new ChromeDriver();

    //    @BeforeTest
    public static void setupInChrome(String url) {

        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "D:\\Training\\chromedriver_win32\\chromedriver.exe");

        // Instantiate a ChromeDriver class.
        //driver =

        // Launch Website
        driver.navigate().to(url);

        //Maximize the browser
        driver.manage().window().maximize();
    }
    public static WebDriver getDriver() {
        return driver;
    }
}
