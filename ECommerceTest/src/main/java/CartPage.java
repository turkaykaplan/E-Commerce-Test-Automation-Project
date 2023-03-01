import org.asynchttpclient.util.Assertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }


    public void closeAlert() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.id("closePop")).click();
    }


    public void checkCart() throws InterruptedException {
        //Thread.sleep(500);
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.vatanbilgisayar.com/sepet/sepetim/" );
    }


    public void removeProduct() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@class='icon-times-circle']")).click(); 
    }

    public void clickHomePageButton() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@class='navbar-brand']")).click(); 
    }







}




