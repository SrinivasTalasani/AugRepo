package stepDefinition;

import Pages.amazonObjects;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.After;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class amazonSteps {
    WebDriver driver;

    amazonObjects Objects;

    public amazonSteps() {

    }
//    @Before
//    public void launchBrowser() {
//        System.setProperty("webdriver.edge.driver", "c:\\users\\srini\\Drivers\\msedgedriver.exe");
//        driver = new EdgeDriver();
//        driver.manage().window().maximize();
//    }
//
//    @After
//    public void teardown() {
//        driver.close();
//    }
    @Given("User launch website")
    public void user_launch_website() throws InterruptedException {
        Thread.sleep(3000);
        driver.get("https://www.amazon.com/");
    }

    @When("user is on homepage")
    public void user_is_on_homepage() throws InterruptedException {
        Thread.sleep(3000);
        Objects = new amazonObjects(driver);
        Objects.clickDismiss();
        System.out.println("clicked on Dismiss button");
        Objects.clickonTodaysDeals();

    }

    @And("user searches for product")
    public void user_searches_for_product() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)", "");
        Objects.clickonHomeButton();
        System.out.println("clicked on home button");
        Thread.sleep(5000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,400)", "");
        Objects.clickonBedImage();

    }

    @And("user adds product to cart")
    public void user_adds_product_to_cart() throws InterruptedException {
        Thread.sleep(2000);
        Objects.clickOnAddToCart();
        System.out.println("clickd on addtocart button");
    }

    @And("user proceeds to checkout")
    public void user_proceeds_to_checkout() throws InterruptedException {
        Thread.sleep(2000);
        Objects.clickoncheckout();
        System.out.println("clicked on chekout button");

    }




}
