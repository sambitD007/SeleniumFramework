package PageObject.POMClasses;

import BaseClasses.BasePage;
import BaseClasses.ElementType;
import PageObject.htmlObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage extends BasePage {

    public LandingPage(WebDriver driver){
        super(driver);
    }
    public WebElement getCustomerData(){
        WebElement data = findElement(ElementType.XPATH,
                htmlObject.Landing_Page_Customer.getWebElement());
        System.out.println(data.toString());
        return data;
    }

    public WebElement getAgentData(){
        WebElement data = findElement(ElementType.XPATH,
                htmlObject.Landing_Page_Agent.getWebElement());
        System.out.println(data.toString());
        return data;
    }

    public WebElement getAdminData(){
        WebElement data = findElement(ElementType.XPATH,
                htmlObject.Landing_Page_Admin.getWebElement());
        System.out.println(data.toString());
        return data;
    }

    public WebElement getSupplierData(){
        WebElement data = findElement(ElementType.XPATH,
                htmlObject.Landing_Page_Supplier.getWebElement());
        System.out.println(data.toString());
        return data;
    }
}
