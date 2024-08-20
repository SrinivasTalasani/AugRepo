package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.Set;

public class amazonObjects {
    WebDriver driver;

    public amazonObjects(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='a-button a-spacing-top-base a-button-base glow-toaster-button glow-toaster-button-dismiss']")
    WebElement Dismiss;

    @FindBy(linkText = "Today's Deals")
    WebElement TodaysDeals;

    @FindBy(xpath = "(//button[@class='Bubble-module__bubble_HMAsFLoooPgV9bEqZsLu'])[5]")
    WebElement HomeButton;

    @FindBy(xpath = "(//a[@class='a-color-base a-link-normal a-text-normal'])[1]")
    WebElement SheetSet;

    @FindBy(id = "add-to-cart-button")
    WebElement addToCartButton;

    @FindBy(xpath = "//input[@value='Proceed to checkout']")
    WebElement checkoutbutton;

    public void clickDismiss() throws InterruptedException {

        Dismiss.click();

//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//        alert.getText();
    }

    public void clickonTodaysDeals() {
        TodaysDeals.click();
    }

    public void clickonHomeButton() {
        HomeButton.click();
    }

    public void clickonBedImage() {
        SheetSet.click();
    }

    public void clickOnAddToCart() {
        addToCartButton.click();
    }

    public void clickoncheckout() {
        checkoutbutton.click();
    }


}
