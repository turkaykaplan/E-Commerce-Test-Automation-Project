import org.junit.Assert;
import org.openqa.selenium.*;


public class ListPage extends BasePage {


    public ListPage(WebDriver driver) {
        super(driver);
    }

    public void scroll() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement otherPageButton = driver.findElement(By.xpath("//*[text()='2']")); 
        js.executeScript("arguments[0].scrollIntoView();", otherPageButton);
        otherPageButton.sendKeys(Keys.ENTER);
        //Thread.sleep(500);
    }


    public void checkSecondPage() throws InterruptedException {
        //Thread.sleep(500);
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.vatanbilgisayar.com/apple/cep-telefonu-modelleri/?page=2");

    }


    public void selectProduct() throws InterruptedException {
        //Thread.sleep(500);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement selectThird = driver.findElement(By.xpath("//*[@class='product-list product-list--list-page'][3]//*[@class='product-list__link']")); 
        js.executeScript("arguments[0].scrollIntoView();", selectThird);
        //Thread.sleep(500);
        selectThird.sendKeys(Keys.ENTER);

    }


}
