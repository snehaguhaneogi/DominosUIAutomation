package pages;

import base.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.ScrollUtil;
import utils.WaitUtil;

import java.util.List;

public class MenuPage {

    private WebDriver driver;

    @FindBy(xpath = ".//div[@class='card-item options-api']")
    private List<WebElement> cardItems;

    @FindBy(xpath = ".//button[contains(@class,'cta-add')]")
    private WebElement addBtn;

    public MenuPage(){
        PageFactory.initElements(DriverFactory.getDriver(), this);
        this.driver=DriverFactory.getDriver();
    }

    public void selectItem(String itemName){

        System.out.println("start select---");
        //WaitUtil.getWait()
               // .until(ExpectedConditions.visibilityOfAllElements(cardItems));
        System.out.println("Total available items = " + cardItems.size());

        if (cardItems.isEmpty()) {
            throw new RuntimeException("No available items found!");
        }

        for (WebElement product : cardItems) {

            WebElement nameElement =
                    product.findElement(By.xpath(
                            ".//span[contains(@class,'pizza-title')]"
                    ));
            System.out.println("getElement from grid-->"+nameElement.getText());
            String actualName = nameElement.getText().trim();

            if (actualName.toLowerCase().contains(itemName.toLowerCase())) {
                ScrollUtil.scrollToElement(product);
                WaitUtil.getWait()
                        .until(ExpectedConditions.elementToBeClickable(addBtn));
                addBtn.click();
                return;
            }
        }

    }

}
