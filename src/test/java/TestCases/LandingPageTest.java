package TestCases;

import BaseClasses.BaseDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LandingPageTest {

    @BeforeTest
    public void setDriver() throws Exception {
        BaseDriver.setDriver();
    }

    @Test
    public void findData(){
    }

    @AfterTest
    public void closeDriver(){
        BaseDriver.closeDriver();
    }
}
