package pages;

import model.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
    WebElement btnProduct;
    WebDriverWait wait;
    @FindBy(id = "user-name")
    WebElement txtUsername;
    @FindBy(id = "password")
    WebElement txtPassword;
    @FindBy(id = "login-button")
    WebElement btnLogin;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void setUserName(String strUserName){

        txtUsername.sendKeys(strUserName);
    }

    //Set password in password textbox

    public void setPassword(String strPassword){

        txtPassword.sendKeys(strPassword);

    }

    //Click on login button

    public void clickLogin(){

        btnLogin.click();

    }

    public boolean login(User user) {
        Boolean ret = false;

        //Fill user name

        this.setUserName(user.getEmail());

        //Fill password

        this.setPassword(user.getPassword());

        //Click Login button

        this.clickLogin();

        if (driver.getCurrentUrl() == "https://www.saucedemo.com/inventory.html"){
            ret = true;
        }

        return ret;

    }
}
