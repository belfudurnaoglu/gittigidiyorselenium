package base;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Time;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Home extends BasePage {
    private static final Logger logger = LogManager.getLogger(BasePage.class);

    public Home(WebDriver driver) {
        super(driver);
    }

    public void appHome() throws InterruptedException {



        TimeUnit.SECONDS.sleep(2);
        clickTo(By.cssSelector("div[class='sc-1nx8ums-0 hdMghx']"));
        sendText(By.cssSelector("input[data-cy='header-search-input']"), "çanta");

        clickTo(By.cssSelector("button[data-cy='search-find-button']"));
        TimeUnit.SECONDS.sleep(2);
        logger.info("Çanta ürünü aratıldı");

        down();
        //7.ürünü ekle
        clickTo(By.xpath("(//div[@class='sc-533kbx-0 sc-1v2q8t1-0 iCRwxx ixSZpI sc-1n49x8z-12 bhlHZl'])[7]"));
        TimeUnit.SECONDS.sleep(2);

        downTwo();
        clickTo(By.id("add-to-basket"));
        logger.info("7.Ürün sepete eklendi");
        clickTo(By.cssSelector("div[class='basket-container robot-header-iconContainer-cart']"));
        TimeUnit.SECONDS.sleep(2);
        clickTo(By.cssSelector("select[class='amount']"));
        Select select = new Select(driver.findElement(By.cssSelector("select[class='amount']")));
        select.selectByVisibleText("2");
        logger.info("2. ürün sepete eklendi");
        TimeUnit.SECONDS.sleep(2);

        clickTo(By.cssSelector("input[class='gg-d-24 gg-ui-btn-primary gg-ui-btn-lg btn-pay']"));
        down();
        clickTo(By.cssSelector("a[title='Sepeti Düzenle']"));
        logger.info("sepete düzenleye tıklandı");
        clickTo(By.xpath("(//a[@class='gg-ui-btn-default btn-add-to-basket'])[5]"));
        TimeUnit.SECONDS.sleep(2);

        TimeUnit.SECONDS.sleep(2);
        //yeni sekme aç
        String openNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
        driver.findElement(By.xpath("//a[@class='logo_gg imglink logo-small']")).sendKeys(openNewTab);
        TimeUnit.SECONDS.sleep(2);

        String currentWindow = driver.getWindowHandle();
        Set<String> windowsHandles = driver.getWindowHandles();
        for (String pencere : windowsHandles) {
            if (!currentWindow.equals(pencere)) {
                driver.switchTo().window(pencere);
            }
        }
        logger.info("Yeni sekmeye geçildi");
        //çıkış yap
        clickTo(By.cssSelector("div[name='profile']"));
        logger.info("Çıkış yapıldı");

        clickTo(By.cssSelector("a[title='Çıkış']"));

    }


}
