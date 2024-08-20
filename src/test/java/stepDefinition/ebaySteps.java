package stepDefinition;

import Pages.amazonObjects;
import Pages.ebayObjects;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class ebaySteps {
    WebDriver driver;

    ebayObjects Objects;

    public ebaySteps(){

    }
    @Before
    public void launchBrowser() {
        System.setProperty("webdriver.edge.driver", "c:\\users\\srini\\Drivers\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Given("User launch ebaywebsite")
    public void user_launch_ebaywebsite() throws InterruptedException {
        Thread.sleep(3000);
        driver.get("https://www.ebay.com/");
    }

    @When("user verify title of page")
    public void user_verify_title_of_page() throws InterruptedException {
        Thread.sleep(2000);
        String actualTitle = driver.getTitle();
        //first way
        Assert.assertEquals(actualTitle, "Electronics, Cars, Fashion, Collectibles & More | eBay");
        //second way
        if (actualTitle.equalsIgnoreCase("Electronics, Cars, Fashion, Collectibles & More | eBay")) {
            System.out.println("title is correct");
        } else
            System.out.println("wrong title");
    }

    @When("user clicks on Fashion and selects womenshoes")
    public void user_clicks_on_fashion_and_selects_womenshoes() throws InterruptedException {
        Thread.sleep(3000);
        Objects = new ebayObjects(driver);
        Objects.clickfashion();
        System.out.println("clicked on Fashion link");
        Thread.sleep(3000);
        Objects.clickwomenfootwear();
        System.out.println("clicked on women's footwear");
        Thread.sleep(3000);
        Objects.searchbutton();
        System.out.println("clicked on search bar");
        Thread.sleep(5000);
    }


    @When("user selects footwear and verify text")
    public void user_selects_footwear() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("window.scrollBy(0,200)","");
        Thread.sleep(4000);
        Objects.clickfootwear();
        Thread.sleep(6000);
        System.out.println("clicked on footwear");

    }

//    @When("user add to cart and checkout")
//    public void user_add_to_cart_and_checkout() throws InterruptedException {
//        Thread.sleep(6000);
//        Objects.drpdown();
//        Thread.sleep(3000);
//        Objects.addcartbtn();
//        System.out.println("clicked on addtocart");
//        Thread.sleep(3000);
//        Objects.chkoutbtn();
//        System.out.println("clicked on checkout");
//        Thread.sleep(3000);
//        Objects.signinnwindow();
//        System.out.println("clicked on signinoption");
////        Objects.switchback();
////        System.out.println("Initial screen closed");
//    }
}
