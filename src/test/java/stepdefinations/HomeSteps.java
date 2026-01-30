package stepdefinations;

import com.aventstack.extentreports.Status;
import hooks.Hooks;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;

public class HomeSteps {

    HomePage homePage = new HomePage();

    @When("user closes popup")
    public void user_closes_popup() {
        homePage.closePopUp();
        Hooks.extentTest.log(Status.PASS, "Popup closed on home page");
        Assert.assertTrue(true);
    }

    @When("user clicks on menu")
    public void user_clicks_on_menu() {
        homePage.clcikOnMenuBtn();
        Hooks.extentTest.log(Status.PASS, "User clicked on menu button");
        Assert.assertTrue(true);
    }
}
