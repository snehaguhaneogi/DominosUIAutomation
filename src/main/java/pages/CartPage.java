package pages;

import base.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.WaitUtil;

public class CartPage {

    private WebDriver driver;

    @FindBy(xpath = ".//span[contains(text(),'View Cart')]")
    private WebElement viewCartBtn;

    @FindBy(xpath = ".//button[contains(text(),'Select Address')]")
    private WebElement addressBtn;


    public CartPage(){
        PageFactory.initElements(DriverFactory.getDriver(), this);
        this.driver=DriverFactory.getDriver();
    }


    public void viewCart(){
        WaitUtil.getWait().until(ExpectedConditions.elementToBeClickable(viewCartBtn));
        viewCartBtn.click();

    }

    public boolean checkAddress(){
        WaitUtil.getWait().until(ExpectedConditions.visibilityOf(addressBtn));
        if(addressBtn.isDisplayed()){
            return  true;
        }
        else{
            return  false;
        }
    }

}
