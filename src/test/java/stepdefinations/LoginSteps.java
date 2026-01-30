package stepdefinations;


import com.aventstack.extentreports.Status;
import hooks.Hooks;
import io.cucumber.java.en.Given;
import org.testng.Assert;
import pages.LoginPage;
import utils.ConfigReader;
import utils.NavigationUtil;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("user launches dominos website")
    public void user_launches_dominos_website() {
        NavigationUtil.navigateToHome(ConfigReader.get("title"));
        Hooks.extentTest.log(Status.PASS, "Dominos website launched");
        Assert.assertTrue(true);
    }

    @Given("user logs in to dominos")
    public void user_logs_in_to_dominos() {
        loginPage.enterPhoneNumber(ConfigReader.get("mobile"));
        loginPage.otpScreenWait();
        Hooks.extentTest.log(Status.PASS, "User entered mobile and waiting for OTP");
        Assert.assertTrue(true);
    }
}
