package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import util.PropertyReader;

public class BaseDriver {
    public static WebDriver driver;

    public static void setDriver(){
        if(driver == null){
            String browser = PropertyReader.getEnvironmentData("browser");
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
    }

    public static void closeDriver(){
        driver.close();
    }
}
