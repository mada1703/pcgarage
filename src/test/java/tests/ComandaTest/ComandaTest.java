package tests.ComandaTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ComandaPage.ComandaPage;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class ComandaTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(ComandaTest.class);
    private String newUrl = getBaseUrl();

    @Test
    public void comanda() {
        driver.get(newUrl);

        String minimvalue = "3000";
        String maximvalue = "10000";
        String bucati = "4";
        String fullname = "Enache Madalin";
        String telephonenumber = "0728078278";
        String email = "mada_1703@yahoo.com";
        String adresa = "str. Theodor Aman, nr. 7, bl.97, sc.C, ap.10";
        String judet = "Dolj";
        String localitate = "Filiasi";
        String comentarii = "Doresc sa fiu contactat telefonic pentru finalizarea comenzii";

        ComandaPage comandaPage = ComandaPage.getInstance();
        Assert.assertTrue(comandaPage.islogodisplayed(), "Logo is not displayed");

        LOG.info("Hover on telefoane menu button");
        comandaPage.hoverOnTelefoaneMenu();

        LOG.info("Click telefoane button");
        comandaPage.clicktelefoane();

        LOG.info("Click producator checkmark");
        comandaPage.clickproducator();

        LOG.info("Delete minim value data");
        comandaPage.deleteminvaluedata();

        LOG.info("Type in minim value");
        comandaPage.typeInMinValue(minimvalue);

        LOG.info("Delete maxim value data");
        comandaPage.deletemaxvaluedata();

        LOG.info("Type in maxim value");
        comandaPage.typeInMaxValue(maximvalue);

        LOG.info("Scroll down to tehnologie");
        comandaPage.scrolldown();

        LOG.info("Click tehnologie 5G checkmark");
        comandaPage.clicktehnologie();

        LOG.info("Scroll down 2 to tehnologie");
        comandaPage.scrolldown2();

        LOG.info("Click culoare deep purple checkmark");
        comandaPage.clickculoare();

        LOG.info("Click sortare menu");
        comandaPage.clicksortare();

        LOG.info("Click decreasing button");
        comandaPage.clickdecreasing();

        LOG.info("Click iphone product");
        comandaPage.clickiphone();

        LOG.info("Click adauga in cos button");
        comandaPage.clickcumpara();

        LOG.info("Click nr bucati dropdown menu");
        comandaPage.selectBucati(bucati);

        LOG.info("Scroll down 3 to date cont");
        comandaPage.scrolldown3();

        LOG.info("Input full name in the name field");
        comandaPage.typeInFullname(fullname);

        LOG.info("Input telephone number");
        comandaPage.typeInTelephonenumber(telephonenumber);

        LOG.info("Input email address");
        comandaPage.typeInEmail(email);

        LOG.info("Scroll down 4 to date livrare");
        comandaPage.scrolldown4();

        LOG.info("Input adresa");
        comandaPage.typeInAdresa(adresa);

        LOG.info("Select judet");
        comandaPage.selectJudet(judet);

        LOG.info("Select localitate");
        comandaPage.selectLocalitate(localitate);

        LOG.info("Scroll down 5 to metoda de plata");
        comandaPage.scrolldown5();

        LOG.info("Click ramburs");
        comandaPage.clickramburs();

        LOG.info("Type in alte informatii");
        comandaPage.typeInComentarii(comentarii);

        LOG.info("Scroll down 6 to conditii");
        comandaPage.scrolldown6();

        LOG.info("Click conditii de retur checkmark");
        comandaPage.clickconditi();

        LOG.info("Click declaratie 18 ani");
        comandaPage.click18ani();

    }
}
