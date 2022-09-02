package test;

import com.aventstack.extentreports.ExtentTest;
import helper.DriverHelper;
import helper.ReportHelper;
import model.User;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import pages.LoginPage;
//import pages.RegisterPage;

//

public class BaseTest {
    protected WebDriver driver;
    protected ExtentTest testReport;

    @BeforeSuite
    public void Setup() {
        DriverHelper.setupInChrome("https://www.saucedemo.com/");
        driver = DriverHelper.getDriver();

        ReportHelper.reportSetting();
        testReport = ReportHelper.getRp();
    }

    public void registerAndLogin(User user) {
  //      RegisterPage registerPage = new RegisterPage(driver);
    //    LoginPage loginPage = new LoginPage(driver);
    //    registerPage.register(user);
    //    loginPage.login(user);
    }

}
