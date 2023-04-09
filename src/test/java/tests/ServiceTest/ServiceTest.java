package tests.ServiceTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class ServiceTest extends BaseTest {

    private String newUrl = getBaseUrl();
    private static final Logger LOG = LoggerFactory.getLogger(ServiceTest.class);

    @Test
    public void servicepage() {
        driver.get(newUrl);

        String nume = "Enache Madalin";
        String email = "mada_1703@yahoo.com";
        String phone = "0728078278";
        String numarfactura = "1234567890";
        String sn = "0987654321";
        String defect = "Produsul la pornire scoate fum";
        String adresa = "str. Mihai Viteazul, nr.173";
        String Judet = "Dolj";
        String Oras = "Filiasi";

        LOG.info("Click service button");
        servicePage.clickservicebutton();

        LOG.info("Scroll down to formular service");
        servicePage.scrolldown();

        LOG.info("Input nume in the nume field");
        servicePage.inputnume(nume);

        LOG.info("Input email in the email field");
        servicePage.inputemail(email);

        LOG.info("Input phone number in the telefon field");
        servicePage.inputphone(phone);

        LOG.info("Click factura field");
        servicePage.clickfactura();

        LOG.info("Input numar factura in the numar factura field");
        servicePage.inputnrfactura(numarfactura);

        LOG.info("Click renunta button");
        servicePage.clickrenuntabutton();

        LOG.info("Input serial number in the serial number field");
        servicePage.inputserialnumber(sn);

        LOG.info("Input defect in the descriere defect field");
        servicePage.inputdescrieredefect(defect);

        LOG.info("Input adresa in the adresa ridicare field");
        servicePage.inputadresaridicare(adresa);

        LOG.info("Select judet");
        servicePage.selectJudet(Judet);

        LOG.info("Click termeni si conditii checkbox");
        servicePage.clickconditiicheckbox();

        LOG.info("Choose a picture");
        servicePage.selectImage();

        LOG.info("Navigate back");
        servicePage.clickBack();

    }
}