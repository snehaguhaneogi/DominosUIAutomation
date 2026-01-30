package pages;

import base.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.WaitUtil;

public class HomePage {
    private WebDriver driver;

    @FindBy(xpath = "//button[@id='moe-dontallow_button']")
    private WebElement popUpCloseBtn;

    @FindBy(xpath = "//div[@class='nav-item-content']")
    private WebElement menuBtn;

    public HomePage(){
        PageFactory.initElements(DriverFactory.getDriver(), this);
        this.driver=DriverFactory.getDriver();
    }

    public void closePopUp(){
        //WaitUtil.getWait().until(ExpectedConditions.visibilityOf(popUpCloseBtn));
        WaitUtil.getWait().until(ExpectedConditions.elementToBeClickable(popUpCloseBtn)).click();;
    }

    public void clcikOnMenuBtn(){
        WaitUtil.getWait().until(ExpectedConditions.elementToBeClickable(menuBtn));
        menuBtn.click();
    }
}
