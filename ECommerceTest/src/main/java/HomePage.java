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
        driver.findElement(By.xpath("//span[@class='icon-search']")).click(); // /html/body/header/nav/div[3]/div[1]/div/div/div[2]/div[2]/div/div/button
    }

    public void selectItemMenu() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[8]/div/a")).click();
        //Thread.sleep(500);
        driver.findElement(By.xpath("//*//a[text()='iPhone']")).click(); // /html/body/main/div/div/div/div[3]/div[1]/div[1]/a
}



}
