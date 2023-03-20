package tests.AutentificareTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;


import static pages.BasePage.driver;


public class AutentificareTest extends BaseTest {
    private String newUrl = getBaseUrl(); + "autentificare";
    private static final Logger LOG = LoggerFactory.getLogger(AutentificareTest.class);


    @Test
    public void autentificare(){
        driver.get(newUrl);



    }
}
