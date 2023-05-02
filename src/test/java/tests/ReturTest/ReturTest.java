package tests.ReturTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class ReturTest extends BaseTest {

    private String newUrl = getBaseUrl();
    private static final Logger LOG = LoggerFactory.getLogger(ReturTest.class);

    @Test
    public void returpage() {
        driver.get(newUrl);

        String nume = "Enache Madalin";
        String email = "mada_1703@yahoo.com";
        String phone = "0728078278";
        String numarfactura = "1234567890";
        String cantitate = "4";
        String day = "1";
        String newmotiv = "4";
        String observatii = "Doresc sa fiu contactat telefonic";

        LOG.info("Click retur button");
        returPage.clickretur();

        LOG.info("Scroll down to formular retur");
        returPage.scrolldown();

        LOG.info("Input nume in the nume field");
        returPage.inputnume(nume);

        LOG.info("Input email in the email field");
        returPage.inputemail(email);

        LOG.info("Input phone number in the telefon field");
        returPage.inputphone(phone);

        LOG.info("Click factura field");
        returPage.clickfactura();

        LOG.info("Input numar factura in the numar factura field");
        returPage.inputnrfactura(numarfactura);

        LOG.info("Click renunta button");
        returPage.clickrenuntabutton();

        LOG.info("Click cantitate field");
        returPage.clickcantitate(cantitate);

        LOG.info("Click data livrarii produsului field");
        returPage.clickdatalivrarii(day);

        LOG.info("Select new motiv retur");
        returPage.selectmotivretur(newmotiv);

        LOG.info("Input observatii in the observatii field");
        returPage.inputobservatii(observatii);

        LOG.info("Click termeni si conditii checkbox");
        returPage.clickconditiicheckbox();

        LOG.info("Choose a picture");
        returPage.selectImage();

        LOG.info("Navigate no1 back");
        returPage.clickBack();

    }
}
