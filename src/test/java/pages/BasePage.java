package pages;

//import helper.ElementHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    WebDriver driver;
 //   ElementHelper elementHelper;

    public BasePage(WebDriver driver) {
//        this.driver = driver;
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        PageFactory.initElements(driver, this);
//        Actions action = new Actions(driver);
  //      elementHelper = new ElementHelper(driver);
    }
    public void load(){

    }
    public void logOut(){

    }
}
