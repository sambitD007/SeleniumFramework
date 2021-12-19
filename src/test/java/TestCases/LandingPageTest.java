package TestCases;

import BaseClasses.BaseDriver;
import PageObject.POMClasses.LandingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import util.PropertyReader;

import java.io.IOException;


public class LandingPageTest extends BaseDriver {
    public LandingPage landingPage;


    public LandingPageTest() throws Exception {
    }

    @BeforeTest
    public void startDriver() throws Exception {
        setDriver();
        driver.get(getEnvironmentData("LandingPage"));
        landingPage = new LandingPage(driver);
    }

    @Test
    public void getCustomerData(){
        WebElement data = landingPage.getCustomerData();
        System.out.println(data.getText());

    }

    @Test
    public void getAgent(){
        WebElement data = landingPage.getAgentData();
        System.out.println(data.getText());
    }

    @Test
    public void getAdmin(){
        WebElement data = landingPage.getAdminData();
        System.out.println(data.getText());
    }

    @Test
    public void getSupplier(){
        WebElement data = landingPage.getSupplierData();
        System.out.println(data.getText());
    }

    @AfterTest
    public void endDriver(){
        closeDriver();
    }


}
