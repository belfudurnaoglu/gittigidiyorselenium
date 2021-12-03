package base;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RandomPage extends BasePage{
    private static final Logger logger = LogManager.getLogger(BasePage.class);

    public RandomPage(WebDriver driver) {
        super(driver);
    }
    public void appRandomPage(){
        sendText(By.cssSelector("input[data-cy='header-search-input']"), "ruj");
        clickTo(By.cssSelector("button[data-cy='search-find-button']"));
        down();
        randomElements(By.xpath("//div[@class='ndodpt-1 bgCibU sc-1n49x8z-13 ceCTui']"));
        down();
        randomElements(By.xpath("//div[@class='ndodpt-1 bgCibU sc-1n49x8z-13 ceCTui']"));
        down();
        randomElements(By.xpath("//div[@class='ndodpt-1 bgCibU sc-1n49x8z-13 ceCTui']"));
        down();
        randomElements(By.xpath("//div[@class='ndodpt-1 bgCibU sc-1n49x8z-13 ceCTui']"));
        logger.info("Random ürün seçildi");
    }
}
