package pages;

import base.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.WaitUtil;

public class LoginPage {

    private WebDriver driver;

    @FindBy(xpath = "//input[@name='loginNumber']")
    private WebElement inputPhoneNumber;


    public LoginPage(){
        PageFactory.initElements(DriverFactory.getDriver(), this);
        this.driver=DriverFactory.getDriver();
    }

    public void enterPhoneNumber(String phoneNumber){
        WaitUtil.getWait().until(ExpectedConditions.elementToBeClickable(inputPhoneNumber));
        inputPhoneNumber.sendKeys(phoneNumber);


    }

    public void otpScreenWait(){
        try{
            Thread.sleep(20000);
        }
        catch (Exception e){
            System.out.println("Exception in otpScreen");
        }
    }


}
