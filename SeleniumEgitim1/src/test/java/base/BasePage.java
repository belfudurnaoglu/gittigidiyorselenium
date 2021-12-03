package base;

import Tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class BasePage{
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement find(By by){
    return driver.findElement(by);
    }
    public void sendText(By by, String text){
        find(by).sendKeys(text);
    }
    public void clickTo(By by){
        find(by).click();
    }
    public void down(){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,2500)");

    }
    public void downTwo(){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,600)");
    }
    public List<WebElement> findToElements(By by){
        return driver.findElements(by);
    }
    public void randomElements(By by){
        Random rand = new Random();
        findToElements(by).get(rand.nextInt(findToElements(by).size())).click();}

    }

