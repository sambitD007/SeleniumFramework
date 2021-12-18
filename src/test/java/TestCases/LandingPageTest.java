package TestCases;

import BaseClasses.BaseDriver;
import org.testng.annotations.Test;

public class LandingPageTest {

    @Test
    public void findData() throws Exception {
        BaseDriver.setDriver();
        BaseDriver.closeDriver();
    }
}
