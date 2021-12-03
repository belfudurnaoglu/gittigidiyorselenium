package base;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Login extends BasePage{
    private static final Logger logger = LogManager.getLogger(BasePage.class);
    public Login(WebDriver driver) {
        super(driver);
    }

    public void appLogin() throws InterruptedException {

        clickTo(By.cssSelector("a[class='tyj39b-5 lfsBU']"));
        clickTo(By.cssSelector("div[name='profile']"));
        TimeUnit.SECONDS.sleep(1);
        clickTo(By.cssSelector("a[data-cy='header-login-button']"));



        sendText(By.id("L-UserNameField"), "belfu.durnaoglu@testinium.com");
        TimeUnit.SECONDS.sleep(1);
        sendText(By.id("L-PasswordField"), "123456b");
        TimeUnit.SECONDS.sleep(1);

        clickTo(By.id("gg-login-enter"));
        TimeUnit.SECONDS.sleep(2);
        logger.info("Giriş yapıldı");
    }
}
