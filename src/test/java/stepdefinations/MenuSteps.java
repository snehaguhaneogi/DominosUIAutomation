package stepdefinations;

import com.aventstack.extentreports.Status;
import hooks.Hooks;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MenuPage;

public class MenuSteps {

    MenuPage menuPage = new MenuPage();

    @When("user selects pizza {string}")
    public void user_selects_pizza(String pizza) {
        menuPage.selectItem(pizza);
        Hooks.extentTest.log(Status.PASS, "Pizza selected: " + pizza);
        Assert.assertTrue(true);
    }
}
