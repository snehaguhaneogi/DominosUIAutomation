import base.DriverFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MenuPage;
import utils.ConfigReader;
import utils.NavigationUtil;

public class test1 {

    @Test
    public void test1(){
        DriverFactory.initDriver();

        NavigationUtil.navigateToHome(ConfigReader.get("title"));

        LoginPage loginPage=new LoginPage();
        loginPage.enterPhoneNumber(ConfigReader.get("mobile"));
        loginPage.otpScreenWait();
        System.out.println("done page1");

        HomePage homePage=new HomePage();
        homePage.closePopUp();
        homePage.clcikOnMenuBtn();

        MenuPage menuPage=new MenuPage();
        menuPage.selectItem("Peppy Paneer");

        CartPage cartPage=new CartPage();
        cartPage.viewCart();
        boolean res=cartPage.checkAddress();
        Assert.assertTrue(res,"Test Case not executed successfully");


    }



}
