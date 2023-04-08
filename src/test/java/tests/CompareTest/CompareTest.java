package tests.CompareTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class CompareTest extends BaseTest {
    private String newUrl = getBaseUrl();
    private static final Logger LOG = LoggerFactory.getLogger(CompareTest.class);


    @Test
    public void compare() {
        driver.get(newUrl);

        LOG.info("Hover on componente menu button");
        comparePage.hoverOnComponenteMenu();

        LOG.info("Click the video cards menu");
        comparePage.clickvideocard();

        LOG.info("Click stoc furnizor checkmark");
        comparePage.clickfurnizorcheckmark();

        LOG.info("Scroll down to furnizor AMD");
        comparePage.scrolldown();

        LOG.info("Click producator AMD");
        comparePage.clickamd();

        LOG.info("Click sortare menu");
        comparePage.clicksortare();

        LOG.info("Click decreasing button");
        comparePage.clickdecreasing();

        LOG.info("Click favorite on the first product");
        comparePage.clickfavorit1();

        LOG.info("Deselect producator AMD");
        comparePage.clickamd();

        LOG.info("Scroll down to furnizor Nvidia");
        comparePage.scrolldown();

        LOG.info("Click producator Nvidia");
        comparePage.clicknvidia();

        LOG.info("Click decreasing button");
        comparePage.clickdecreasing();

        LOG.info("Click favorite on the second product");
        comparePage.clickfavorit2();

        LOG.info("Click produse favorite");
        comparePage.clickprodusefavorite();

        LOG.info("Click all products checkmark");
        comparePage.clickallproductscheckmark();

        LOG.info("Click compara button");
        comparePage.clickcomparabutton();

        LOG.info("Click on the sterge button form the second product");
        comparePage.clickstergeproduct2();

        LOG.info("Click adaugare button");
        comparePage.clickadaugare();

        LOG.info("Click magazin checkmark");
        comparePage.clickmagazin();

        LOG.info("Scroll down to furnizor AMD");
        comparePage.scrolldown();

        LOG.info("Click prdoucator AMD");
        comparePage.clickamd();

        LOG.info("Click decreasing button");
        comparePage.clickdecreasing();

        LOG.info("Click to add to favorite the third product");
        comparePage.clickthirdproduct();

        LOG.info("Click produse favorite");
        comparePage.clickprodusefavorite2();

        LOG.info("Click the first and third product checkmarks");
        comparePage.clickcheckmark1();
        comparePage.clickcheckmark3();

        LOG.info("Click compara button");
        comparePage.clickcomparabutton();

        LOG.info("Click the 4090 video card");
        comparePage.click4090();

        LOG.info("Slide right thorugh all pictures");
        comparePage.sliderright();
        comparePage.sliderright();
        comparePage.sliderright();
        comparePage.sliderright();
        comparePage.sliderright();
        comparePage.sliderright();

        LOG.info("Click adauga in cos button");
        comparePage.clickadaugabutton();

        LOG.info("Hover over categorii dropdown menu");
        comparePage.hoverOnCategoriiMenu();

    }
}
