

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class amazonTestNg {
    WebDriver driver;

    @Before
    public void launchBrowser() {
        System.setProperty("webdriver.edge.driver", "c:\\users\\srini\\Drivers\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void amazonLogin() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        Thread.sleep(3000);
        WebElement dismissButton = driver.findElement(By.xpath("//span[@class='a-button a-spacing-top-base a-button-base glow-toaster-button glow-toaster-button-dismiss']"));
        dismissButton.click();
        Thread.sleep(3000);
        WebElement Deals = driver.findElement(By.linkText("Today's Deals"));
        Deals.click();
        Thread.sleep(3000);
        JavascriptExecutor JS = (JavascriptExecutor) driver;
        JS.executeScript("window.scrollBy(0,400)","");
        WebElement Homebtn = driver.findElement(By.xpath("(//button[@class='Bubble-module__bubble_HMAsFLoooPgV9bEqZsLu'])[5]"));
        Homebtn.click();
        Thread.sleep(5000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,400)","");
//        Thread.sleep(2000);
        WebElement SheetLink = driver.findElement(By.xpath("(//a[@class='a-color-base a-link-normal a-text-normal'])[1]"));
        SheetLink.click();
        Thread.sleep(3000);
        WebElement addTocart = driver.findElement(By.id("add-to-cart-button"));
        addTocart.click();
        Thread.sleep(2000);
        WebElement chkout = driver.findElement(By.xpath("//input[@value='Proceed to checkout']"));
        chkout.click();
    }

    @After
    public void tearDown() {
        driver.close();
    }
}
