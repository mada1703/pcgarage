package tests.ContactTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class ContactTest extends BaseTest {

    private String newUrl = getBaseUrl();
    private static final Logger LOG = LoggerFactory.getLogger(ContactTest.class);

    @Test
    public void contactpage() {
        driver.get(newUrl);

        String intrebare = "generala";
        String nume = "Enache Madalin";
        String email = "mada_1703@yahoo.com";
        String phone = "0728078278";
        String mesaj = "Care sunt conditiile de retur?";

        LOG.info("Click contact button");
        contactPage.clickcontactbutton();

        LOG.info("Click map");
        contactPage.clickmap();

        LOG.info("Scroll down to date contact");
        contactPage.scrolldown();

        LOG.info("Click suport clienti");
        contactPage.clicksuportclienti();

        LOG.info("Click contact service");
        contactPage.clickcontactservice();

        LOG.info("Click contact corporate");
        contactPage.clickcontactcorporate();

        LOG.info("Click sesizari si reclamatii");
        contactPage.clicksesizari();

        LOG.info("Click relatii cu presa");
        contactPage.clickrelatiipresa();

        LOG.info("Select intrebare from formular contact dropdown menu");
        contactPage.selectintrebare(intrebare);

        LOG.info("Input name in the name field");
        contactPage.inputname(nume);

        LOG.info("Input email in the email field");
        contactPage.inputemail(email);

        LOG.info("Input phone number in the phone field");
        contactPage.inputphone(phone);

        LOG.info("Click continua button");
        contactPage.clickcontinuabutton();

        LOG.info("Input mesaj");
        contactPage.inputmesaj(mesaj);

        LOG.info("Navigate back");
        rcaPage.clickBack();
    }
}