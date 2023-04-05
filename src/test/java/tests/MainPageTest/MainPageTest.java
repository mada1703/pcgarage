package tests.MainPageTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class MainPageTest extends BaseTest {

    private String newUrl = getBaseUrl();
    private static final Logger LOG = LoggerFactory.getLogger(MainPageTest.class);


    @Test
    public void mainpage() {
        driver.get(newUrl);

        String Product = "Iphone 14";

        LOG.info("Check logo");
        Assert.assertTrue(mainPage.isLogoDisplayed(), "Logo is not displayed");

        LOG.info("Check search field");
        Assert.assertTrue(mainPage.isSearchFieldDisplayed(), "Search field is not displayed");

        LOG.info("Check account logo");
        Assert.assertTrue(mainPage.isAccountLogoDisplayed(), "Account logo is not displayed");

        LOG.info("Check favorite logo");
        Assert.assertTrue(mainPage.isFavoriteLogoDisplayed(), "Favorite logo is not displayed");

        LOG.info("Check cos logo");
        Assert.assertTrue(mainPage.isCosLogoDisplayed(), "Cos logo is not displayed");

        LOG.info("Check sliding images menu");
        Assert.assertTrue(mainPage.isSlidingImagesMenuDisplayed(), "Sliding images menu is not displayed");

        LOG.info("Type in searched product");
        mainPage.typeInSearchField(Product);

        LOG.info("Navigate back to main page from searched product");
        mainPage.clickSearchBack();

        LOG.info("Slide through the images from the main page");
        mainPage.clickSlidingImages();

        LOG.info("Hover on laptopuri menu button");
        mainPage.hoverOnLaptopuriMenu();

        LOG.info("Click tablete button");
        mainPage.clickTablete();

        LOG.info("Navigate back to main page from tablete");
        mainPage.clickTableteBack();

        LOG.info("Hover on telefoane menu button");
        mainPage.hoverOnTelefoaneMenu();

        LOG.info("Click smartwatch button");
        mainPage.clickSmartwatch();

        LOG.info("Navigate back to main page from smartwatch");
        mainPage.clickSmartwatchBack();

        LOG.info("Hover on televizoare menu button");
        mainPage.hoverOnTelevizoareMenu();

        LOG.info("Click aparate foto mirrorless button");
        mainPage.clickMirrorless();

        LOG.info("Navigate back to main page from aparate foto mirrorless");
        mainPage.clickMirrorlessBack();

        LOG.info("Hover on componente menu button");
        mainPage.hoverOnComponenteMenu();

        LOG.info("Click mouse button");
        mainPage.clickMouse();

        LOG.info("Navigate back to main page from mouse");
        mainPage.clickMouseBack();

        LOG.info("Hover on calculatoare menu button");
        mainPage.hoverOnCalculatoareMenu();

        LOG.info("Click monitoare button");
        mainPage.clickMonitoare();

        LOG.info("Navigate back to main page from monitoare");
        mainPage.clickMonitoareBack();

        LOG.info("Hover on retelistica menu button");
        mainPage.hoverOnRetelisticaMenu();

        LOG.info("Click routere button");
        mainPage.clickRoutere();

        LOG.info("Navigate back to main page from routere");
        mainPage.clickRoutereBack();

        LOG.info("Hover on electrocasnice mari menu button");
        mainPage.hoverOnElectrocasnciceMariMenu();

        LOG.info("Click aragazuri button");
        mainPage.clickAragazuri();

        LOG.info("Navigate back to main page from aragazuri");
        mainPage.clickAragazuriBack();

        LOG.info("Hover on electrocasnice mici menu button");
        mainPage.hoverOnElectrocasnciceMiciMenu();

        LOG.info("Click mixere button");
        mainPage.clickMixere();

        LOG.info("Navigate back to main page from mixere");
        mainPage.clickMixereBack();

        LOG.info("Hover on hobby menu button");
        mainPage.hoverOnHobbyMenu();

        LOG.info("Click carti button");
        mainPage.clickCarti();

        LOG.info("Navigate back to main page from carti");
        mainPage.clickCartiBack();

        LOG.info("Hover on sanatate menu button");
        mainPage.hoverOnSanatateMenu();

        LOG.info("Click uscatoare button");
        mainPage.clickUscatoare();

        LOG.info("Navigate back to main page from uscatoare");
        mainPage.clickUscatoareBack();

        LOG.info("Hover on parfumuri menu button");
        mainPage.hoverOnParfumuriMenu();

        LOG.info("Click sampoane button");
        mainPage.clickSampoane();

        LOG.info("Navigate back to main page from sampoane");
        mainPage.clickSampoaneBack();

        LOG.info("Hover on ceasuri menu button");
        mainPage.hoverOnCeasuriMenu();

        LOG.info("Click ceasuri barbatesti button");
        mainPage.clickCeasuriBarbatesti();

        LOG.info("Navigate back to main page from ceasuri barbatesti");
        mainPage.clickCeasuriBarbatestiBack();

        LOG.info("Hover on bacanie menu button");
        mainPage.hoverOnBacanieMenu();

        LOG.info("Click sucuri button");
        mainPage.clickSucuri();

        LOG.info("Navigate back to main page from sucuri");
        mainPage.clickSucuriBack();

        LOG.info("Hover on auto menu button");
        mainPage.hoverOnAutoMenu();

        LOG.info("Click anvelope button");
        mainPage.clickAnvelope();

        LOG.info("Navigate back to main page from anvelope");
        mainPage.clickAnvelopeBack();

        LOG.info("Hover on copii menu button");
        mainPage.hoverOnCopiiMenu();

        LOG.info("Click triciclete button");
        mainPage.clickTriciclete();

        LOG.info("Navigate back to main page from triciclete");
        mainPage.clickTricicleteBack();

        LOG.info("Hover on bricolaj menu button");
        mainPage.hoverOnBricolajMenu();

        LOG.info("Click polizoare button");
        mainPage.clickPolizoare();

        LOG.info("Navigate back to main page from polizoare");
        mainPage.clickPolzioareBack();

        LOG.info("Hover on gradina menu button");
        mainPage.hoverOnGradinaMenu();

        LOG.info("Click piscine button");
        mainPage.clickPiscine();

        LOG.info("Navigate back to main page from piscine");
        mainPage.clickPiscineBack();

        LOG.info("Hover on casa menu button");
        mainPage.hoverOnCasaMenu();

        LOG.info("Click canapele button");
        mainPage.clickCanapele();

        LOG.info("Navigate back to main page from canapele");
        mainPage.clickCanapeleBack();

        LOG.info("Scroll down to produsele zilei icon");
        mainPage.scrolldown();

        LOG.info("Click produsele zilei button");
        mainPage.clickproduselezilei();

        LOG.info("Navigate back to main page from produsele zilei");
        mainPage.clickProduseleZileiBack();

        LOG.info("Click ultimele bucati button");
        mainPage.clickultimelebucati();

        LOG.info("Navigate back to main page from ultimele bucati");
        mainPage.clickultimelebucatiBack();

        LOG.info("Click resigilate button");
        mainPage.clickresigilate();

        LOG.info("Navigate back to main page from resigilate");
        mainPage.clickresigilateBack();

        LOG.info("Click refurbished button");
        mainPage.clickrefurbished();

        LOG.info("Navigate back to main page from refurbished");
        mainPage.clickrefurbishedBack();

        LOG.info("Switch to new window");
        mainPage.clickpartener();
        mainPage.switchToNewTabWindow();

//        LOG.info("Play the first video");
//        mainPage.clickfirstvideo();

        LOG.info("Click the youtube link and return to main page");
        mainPage.clickyoutubelink();

        LOG.info("Click the facebook link and return to main page");
        mainPage.clickfacebooklink();

        LOG.info("Click the instagram link and return to main page");
        mainPage.clickinstagramlink();

        LOG.info("Scroll up to the main view of the main page");
        mainPage.scrollup();


    }
}
