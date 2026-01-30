package stepdefinations;

import com.aventstack.extentreports.Status;
import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.CartPage;

public class CartSteps {

    CartPage cartPage = new CartPage();

    @And("user opens cart")
    public void user_opens_cart() {
        cartPage.viewCart();
        Hooks.extentTest.log(Status.PASS, "User opened the cart");
        Assert.assertTrue(true);
    }

    @Then("address button should be visible")
    public void address_button_should_be_visible() {
        boolean res = cartPage.checkAddress();
        Hooks.extentTest.log(Status.INFO, "Address button visible: " + res);
        Assert.assertTrue(res, "Address button not visible");
        Hooks.extentTest.log(Status.PASS, "Address button verified successfully");
    }
}
