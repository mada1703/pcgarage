package tests.RCATest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class RCATest extends BaseTest {

    private String newUrl = getBaseUrl();
    private static final Logger LOG = LoggerFactory.getLogger(RCATest.class);

    @Test
    public void rcapage() {
        driver.get(newUrl);

        String email = "mada_1703@yahoo.com";
        String phone = "0728078278";
        String cnp = "1921213141516";
        String serie = "DZ";
        String numar = "161718";
        String anpermis = "1992";
        String etaj = "4";

        LOG.info("Click rca ieftin button");
        rcaPage.clickrcabutton();

        LOG.info("Choose picture of talon to upload");
        rcaPage.selectImage();

        LOG.info("Scroll down to date proprietar");
        rcaPage.scrolldown();

        LOG.info("Input email in the email field");
        rcaPage.inputemail(email);

        LOG.info("Input telephone number in the phone field");
        rcaPage.inputphone(phone);

        LOG.info("Input cnp in the cnp field");
        rcaPage.inputcnp(cnp);

        LOG.info("Input serie ci in the serie CI field");
        rcaPage.inputserieci(serie);

        LOG.info("Input numar ci in the numar CI field");
        rcaPage.inputnumarci(numar);

        LOG.info("Select an permis");
        rcaPage.selectanpermis(anpermis);

        LOG.info("Input etaj in the etaj field");
        rcaPage.inputetaj(etaj);
    }
}