import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {

        super(driver);
    }

    public void checkHomePageURL() throws InterruptedException {

        //Thread.sleep(500);
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.vatanbilgisayar.com/" );
    }


    public void search(){
        driver.findElement(By.id("navbar-search-input")).sendKeys("apple");
        driver.findElement(By.xpath("//span[@class='icon-search']")).click(); 
    }

    public void selectItemMenu() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[8]/div/a")).click();
        //Thread.sleep(500);
        driver.findElement(By.xpath("//*//a[text()='iPhone']")).click(); 
}



}
