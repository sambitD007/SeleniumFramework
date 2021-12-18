package BaseClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BasePage {
    private final static Logger LOGGER =
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement findElement(ElementType type,String locator){
        WebElement webElement = null;
        LOGGER.log(Level.INFO, "Web element type: {0} and name: {1}",new Object[] {type,locator});
        switch (type){
            case ID -> webElement = driver.findElement(By.id(locator));
            case NAME -> webElement = driver.findElement(By.name(locator));
            case CLASS_NAME -> webElement = driver.findElement(By.className(locator));
            case CSS_SELECTOR -> webElement = driver.findElement(By.cssSelector(locator));
            case XPATH -> webElement = driver.findElement(By.xpath(locator));
            case LINK_TEXT -> webElement = driver.findElement(By.linkText(locator));
            case PARTIAL_LINK_TEXT -> webElement = driver.findElement(By.partialLinkText(locator));
            case TAG_NAME -> webElement = driver.findElement(By.tagName(locator));
            default -> LOGGER.log(Level.SEVERE, "Invalid locator type: {0}",type);
        }
        return webElement;
    }
}
