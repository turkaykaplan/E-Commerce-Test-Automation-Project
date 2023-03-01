import org.openqa.selenium.*;


public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }


    public void addCart() throws InterruptedException {
        Thread.sleep(500);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
        Thread.sleep(500);
        driver.findElement(By.id("add-to-cart-button")).click();
    }

    public void goCartButton() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@class='btn btn-dark-blue goToBasket']")).click(); 
    }

}
