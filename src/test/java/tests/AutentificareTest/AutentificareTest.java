package tests.AutentificareTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class AutentificareTest extends BaseTest {
    private String newUrl = getBaseUrl() + "";
    private static final Logger LOG = LoggerFactory.getLogger(AutentificareTest.class);


    @Test
    public void autentificare(){
        driver.get(newUrl);

        String Nume = "Enache";
        String Prenume = "Madalin";
        String Email = "mada_1703@yahoo.com";
        String Telefon = "0728078278";
        String Adresa = "str. Calea Bucuresti, nr.173";
        String Judet = "Dolj";
        String Oras = "Filiasi";


        LOG.info("Verify if Logo is displayed");
        Assert.assertTrue(autentificarePage.isLogoDisplayed(), "Logo is not displayed");

        LOG.info("Hover on contul meu button");
        autentificarePage.hoverOnContulMeu();

        LOG.info("Click cont nou button");
        autentificarePage.clickcontnou();

        LOG.info("Type in nume");
        autentificarePage.typeInNume(Nume);

        LOG.info("Type in prenume");
        autentificarePage.typeInPrenume(Prenume);

        LOG.info("Type in email");
        autentificarePage.typeInEmail(Email);

        LOG.info("Type in telephone");
        autentificarePage.typeInTelephone(Telefon);

        LOG.info("Type in adresa");
        autentificarePage.typeInAddress(Adresa);

        LOG.info("Select judet");
        autentificarePage.selectJudet(Judet);

        LOG.info("Select oras");
        autentificarePage.selectOras(Oras);

        LOG.info("Click termeni checkmark");
        autentificarePage.clickTermenicheckmark();

        LOG.info("Click Creeaza cont button");
        autentificarePage.clickCreearebutton();

        LOG.info("Navigate no1 back");
        autentificarePage.clickBack();

        LOG.info("Navigate no2 back");
        autentificarePage.click2Back();






    }
}
