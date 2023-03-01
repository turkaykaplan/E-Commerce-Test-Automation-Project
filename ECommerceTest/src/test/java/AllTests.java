import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import java.io.IOException;


public class AllTests extends BaseTest {

    HomePage homePage;
    ListPage listPage;
    ProductPage productPage;
    CartPage cartPage;
    LoginPage loginPage;


    @Test
    @Order(1)
    public void checkURL() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.checkHomePageURL();
    }

    @Test
    @Order(2)
    public void searchProduct() throws InterruptedException {
        Thread.sleep(500);
        homePage = new HomePage(driver);
        homePage.search();
    }

    @Test
    @Order(3)
    public void selectCatalog() throws InterruptedException {
        Thread.sleep(500);
        homePage.selectItemMenu();
    }

    @Test
    @Order(4)
    public void scrollPage() throws InterruptedException {
        listPage = new ListPage(driver);
        Thread.sleep(500);
        listPage.scroll();
    }

    @Test
    @Order(5)
    public void checkSecondPageURL() throws InterruptedException {
        Thread.sleep(500);
        listPage.checkSecondPage();
    }

    @Test
    @Order(6)
    public void selectThirdProduct() throws InterruptedException {
        Thread.sleep(500);
        listPage.selectProduct();
    }

    @Test
    @Order(7)
    public void addCartProduct() throws InterruptedException {
        productPage = new ProductPage(driver);
        //Thread.sleep(500);
        productPage.addCart();
    }

    @Test
    @Order(8)
    public void goToCart() throws InterruptedException {
        productPage.goCartButton();
    }

    @Test
    @Order(9)
    public void closePop() throws InterruptedException {
        cartPage = new CartPage(driver);
        Thread.sleep(750);
        cartPage.closeAlert();
    }

    @Test
    @Order(10)
    public void checkCartPage() throws InterruptedException {
        cartPage.checkCart();
    }

    @Test
    @Order(11)
    public void remove() throws InterruptedException {
        cartPage = new CartPage(driver);
        cartPage.removeProduct();
    }

    @Test
    @Order(12)
    public void backHomePage() throws InterruptedException {
        cartPage = new CartPage(driver);
        cartPage.clickHomePageButton();
    }

    @Test
    @Order(13)
    public void clickLoginButton() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.loginButton();
    }

    @Test
    @Order(14)
    public void enterLoginPage() throws IOException, InterruptedException {
        //Thread.sleep(1000);
        loginPage.loginInfo();
    }

    @Test
    @Order(15)
    public void quitChrome(){
        loginPage.closeChrome();
    }
}
