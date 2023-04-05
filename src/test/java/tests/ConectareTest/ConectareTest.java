package tests.ConectareTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class ConectareTest extends BaseTest {
    private String newUrl = getBaseUrl();
    private static final Logger LOG = LoggerFactory.getLogger(ConectareTest.class);


    @Test
    public void conectare() {
        driver.get(newUrl);

        String email = "mada_1703@yahoo.com";
        String password = "iUbSSIPERggF";

        LOG.info("Hover on contul meu button");
        conectarePage.hoverOnContulMeu();

        LOG.info("Click on conecteaza-te button");
        conectarePage.clickconectarebutton();

        LOG.info("Insert email address");
        conectarePage.insertemailaddress(email);

        LOG.info("Insert password");
        conectarePage.insertpassword(password);

        LOG.info("Click 'conecteaza-te' button");
        conectarePage.clickenter();
    }
}
