import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginButton() throws InterruptedException {
        driver.findElement(By.id("type")).click();
        //Thread.sleep(500);
        driver.findElement(By.xpath("//*[text()='Giriş Yap']")).click(); ///html/body/header/nav/div[3]/div[1]/div/div/div[2]/div[3]/div/div[1]/ul/li[1]/a
    }


    public void loginInfo() throws IOException {
        String path = "/Users/asus/IdeaProjects/ECommerceTest/loginCSV.csv";
        String line = "";
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
            }
        }
        driver.findElement(By.id("email")).sendKeys(records.get(0).get(0));
        driver.findElement(By.id("pass")).sendKeys(records.get(0).get(1));

        WebElement clickLogin = driver.findElement(By.id("login-button"));
        clickLogin.click();
    }

    public void closeChrome(){
        driver.quit();
    }

}




