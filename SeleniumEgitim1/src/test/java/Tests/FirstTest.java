package Tests;

import base.Home;
import base.Login;
import base.RandomPage;
import org.junit.Test;

public class FirstTest extends BaseTest{
   Login login;
   RandomPage randomPage;
    Home home;


    @Test
    public void firsTestOne() throws InterruptedException {
        Login login = new Login(driver);
        login.appLogin();
        RandomPage randomPage = new RandomPage(driver);
        randomPage.appRandomPage();
        Home home = new Home(driver);
        home.appHome();
    }
}
