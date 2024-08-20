package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class ebayObjects {

    WebDriver driver;

    public ebayObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Fashion")
    WebElement fashionLink;

    @FindBy(linkText = "Footwear for women")
    WebElement Footwearforwomen;

    @FindBy(id = "gh-ac")
    WebElement searchbtn;

    @FindBy(xpath = "(//span[@aria-level='3'])[3]")
    WebElement footwear;

    @FindBy(xpath = "//span[text()='OOFOS Recovery Footwear Ooahh Luxe Slide Sandals Womens Size 8 39 Comfort Shoes']")
    WebElement verifytext;

//    @FindBy(xpath = "//select[@aria-label='Please select a Size']")
//    WebElement seldrpdown1;
//
//    @FindBy(xpath = "//select[@aria-label='Please select a Color']")
//    WebElement seldrpdown2;
//
//    @FindBy(id = "atcBtn_btn_1")
//    WebElement addtocart;
//
//    @FindBy(xpath = "(//button[@type='button'])[12]")
//    WebElement checkout;
//
//    @FindBy(xpath = "//div/button[@id='signin-btn']")
//    WebElement signinbtn;

    public void clickfashion() {
        Actions action = new Actions(driver);
        action.moveToElement(fashionLink).build().perform();
    }

    public void clickwomenfootwear() {
        Footwearforwomen.click();
    }

    public void searchbutton() {

        searchbtn.sendKeys("women footwear" + Keys.ENTER);
    }

    public void clickfootwear() throws InterruptedException {
        footwear.click();
        String firstwindow = driver.getWindowHandle();
        driver.switchTo().window(firstwindow);
        driver.close();
        Set<String> windows = driver.getWindowHandles();
        for (String window : windows) {
            driver.switchTo().window(window);
            verifytext.isDisplayed();
            String txt = verifytext.getText();
            System.out.println(txt);

        }

    }

//    public void addcartbtn() {
//        addtocart.click();
//    }
//
//    public void drpdown() {
//        Select sel = new Select(seldrpdown1);
//        sel.selectByVisibleText("8 UK");
//        Select sel1 = new Select(seldrpdown2);
//        sel1.selectByVisibleText("Black");
//    }
//
//    public void chkoutbtn() {
//        checkout.click();
//
//    }
//
//    public void signinnwindow() {
//        signinbtn.click();
//
//    }
//    public void switchback(){
//        String firstwindow = driver.getWindowHandle();
//           driver.switchTo().window(firstwindow);
//        driver.close();
//
//    }


}
