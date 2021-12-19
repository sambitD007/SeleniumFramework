package BaseClasses;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import util.PropertyReader;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver extends PropertyReader {
    public static WebDriver driver;
    private final static Logger LOGGER =
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public BaseDriver() throws Exception {
    }

    public  WebDriver setDriver() throws Exception {
        if(driver == null){
            String browser = getEnvironmentData("browser");
            LOGGER.log(Level.INFO,"The browser select: {0}",browser);
            if(browser.equalsIgnoreCase("chrome")){
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }else if(browser.equalsIgnoreCase("firefox")){
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }else{
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
        }
        driver.manage().window().maximize();
        return driver;
    }

    public void closeDriver(){
        driver.close();
    }
}
