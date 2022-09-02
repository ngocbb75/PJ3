package test;

import com.aventstack.extentreports.Status;
import model.User;
import pages.LoginPage;

import java.io.IOException;

public class TestCase01 extends BaseTest {

    public TestCase01() {
    }

    public void orangeHRMTestCase() throws IOException, InterruptedException {

        testReport.log(Status.INFO, "Open web and navigate to homepage");

        // User standardUser = UserHelper.getUserByEmail("standard_user");
        User standardUser = new User("standard_user", "secret_sauce");
        LoginPage loginPage = new LoginPage(driver);

        //login to application
        if (!loginPage.login(standardUser)) {
            testReport.fail("Login unsuccessfully with standard user");
        } else {
            testReport.pass("Login successfully with standard user");
        }

    }
}
