package pages.MainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class MainPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(MainPage.class);
    public static MainPage instance;


    private MainPage() {
    }

    public static MainPage getInstance() {
        if (instance == null) {
            instance = new MainPage();
        }
        return instance;
    }

    private final By logo = By.xpath("//img[@alt='CEL.ro marketplace online']");
    private final By search = By.id("keyword");
    private final By accountlogo = By.xpath("//i[@class='icon-icon_user']");
    private final By favoritelogo = By.xpath("//span[@class='icon-wrapper']//i[@class='icon-heart']");
    private final By coslogo = By.xpath("//span[@class='icon-wrapper']//i[@class='icon-shopping-basket']");
    private final By slidingimages = By.xpath("//li[@class='lslide active']//a[@rel='nofollow']//img[@loading='lazy']");
    private By insertsearch = By.id("keyword");
    private By clicksearch = By.xpath("//button[@aria-label='Cauta']//i[@class='icon-search']");
    private By clickimage = By.xpath("//div[@id='slides-box']//ul[@class='lSPager lSGallery']/li[1]");
    private By clickimage2 = By.xpath("//div[@id='slides-box']//ul[@class='lSPager lSGallery']/li[2]");
    private By clickimage3 = By.xpath("//div[@id='slides-box']//ul[@class='lSPager lSGallery']/li[3]");
    private By clickimage4 = By.xpath("//div[@id='slides-box']//ul[@class='lSPager lSGallery']/li[4]");
    private By clickimage5 = By.xpath("//div[@id='slides-box']//ul[@class='lSPager lSGallery']/li[5]");
    private By laptopurimenu = By.xpath("//a[normalize-space()='Laptopuri, Tablete & Software']");
    private By tablete = By.xpath("//a[@class='subcategTitle'][normalize-space()='Tablete']");
    private By telefoanemenu = By.xpath("//a[normalize-space()='Telefoane Mobile & Gadget']");
    private By smartwatch = By.xpath("//a[normalize-space()='Smartwatch']");
    private By televizoaremenu = By.xpath("//a[normalize-space()='Televizoare & Audio Video']");
    private By mirrorless = By.xpath("//a[@class='subcategTitle'][normalize-space()='Aparate Foto Mirrorless']");
    private By componentemenu = By.xpath("//a[normalize-space()='Componente & Periferice']");
    private By mouse = By.xpath("//a[normalize-space()='Mouse']");
    private By calculatoaremenu = By.xpath("//a[normalize-space()='Calculatoare, Monitoare & UPS']");
    private By monitoare = By.xpath("//a[@class='subcategTitle'][normalize-space()='Monitoare LCD LED']");
    private By retelisticamenu = By.xpath("//a[normalize-space()='Retelistica & Securitate']");
    private By routere = By.xpath("//a[@class='subcategTitle'][normalize-space()='Routere']");
    private By electrocasniceMari = By.xpath("//a[normalize-space()='Electrocasnice Mari']");
    private By aragazuri = By.xpath("//a[@class='subcategTitle'][normalize-space()='Aragazuri']");
    private By electrocasniceMici = By.xpath("//a[normalize-space()='Electrocasnice Mici']");
    private By mixere = By.xpath("//a[normalize-space()='Mixere']");
    private By hobby = By.xpath("//a[normalize-space()='Hobby & Sport']");
    private By carti = By.xpath("//a[@class='subcategTitle'][normalize-space()='Carti']");
    private By sanatate = By.xpath("//a[normalize-space()='Ingrijire personala & Sanatate']");
    private By uscatoare = By.xpath("//a[normalize-space()='Uscatoare de par']");
    private By parfumuri = By.xpath("//a[normalize-space()='Parfumuri & Cosmetice']");
    private By sampon = By.xpath("//a[normalize-space()='Sampon']");
    private By ceasuri = By.xpath("//a[normalize-space()='Ceasuri & Fashion']");
    private By ceasuribarbatesti = By.xpath("//a[normalize-space()='Ceasuri barbatesti']");
    private By bacanie = By.xpath("//a[@href='https://www.cel.ro/bacanie/']");
    private By sucuri = By.xpath("//a[@class='subcategTitle'][normalize-space()='Sucuri']");
    private By auto = By.xpath("//a[normalize-space()='Auto & RCA']");
    private By anvelope = By.xpath("//a[normalize-space()='Anvelope']");
    private By copii = By.xpath("//a[normalize-space()='Copii & Bebelusi']");
    private By triciclete = By.xpath("//a[normalize-space()='Triciclete']");
    private By bricolaj = By.xpath("//a[@href='https://www.cel.ro/bricolaj-~-electrice/']");
    private By polizoare = By.xpath("//a[normalize-space()='Polizoare']");
    private By gradina = By.xpath("//a[@href='https://www.cel.ro/gradina/']");
    private By piscine = By.xpath("//a[normalize-space()='Piscine']");
    private By casa = By.xpath("//a[@href='https://www.cel.ro/casa-~-mobilier/']");
    private By canapele = By.xpath("//a[normalize-space()='Canapele']");
    private By produseleZilei = By.xpath("//div[contains(text(),'Vezi produsele zilei')]");
    private By ultimeleBucati = By.xpath("//div[normalize-space()='Vezi ultimele bucati']");
    private By resigilate = By.xpath("//div[normalize-space()='Vezi mai multe resigilate']");
    private By refurbished = By.xpath("//div[normalize-space()='Vezi produse refurbished']");
    private By partener = By.xpath("//a[@rel='nofollow noopener']");
    private By firstvideo = By.xpath("//div[@class='video']/iframe");
    private By videoone = By.xpath("//button[@aria-label='Play']");
    private By youtube = By.xpath("//a[normalize-space()='YouTube']");
    private By facebook = By.xpath("//a[@class='facebook']");
    private By instagram = By.xpath("//a[normalize-space()='Instagram']");


    public boolean isLogoDisplayed() {
        LOG.info("Verify if logo is displayed");
        return driver.findElement(logo).isDisplayed();
    }

    public boolean isSearchFieldDisplayed() {
        LOG.info("Verify if search field is displayed");
        return driver.findElement(search).isDisplayed();
    }

    public boolean isAccountLogoDisplayed() {
        LOG.info("Verify if account logo is displayed");
        return driver.findElement(accountlogo).isDisplayed();
    }

    public boolean isFavoriteLogoDisplayed() {
        LOG.info("Verify if favorite logo is displayed");
        return driver.findElement(favoritelogo).isDisplayed();
    }

    public boolean isCosLogoDisplayed() {
        LOG.info("Verify if cos logo is displayed");
        return driver.findElement(coslogo).isDisplayed();
    }

    public boolean isSlidingImagesMenuDisplayed() {
        LOG.info("Verify if the sliding images menu is displayed");
        return driver.findElement(slidingimages).isDisplayed();
    }

    public void typeInSearchField(String product) {
        LOG.info("Type in searched product");
        driver.findElement(insertsearch).sendKeys(product);
        driver.findElement(clicksearch).click();
    }

    public void clickSearchBack() {
        LOG.info("Clicking back from searched item in main page");
        driver.navigate().back();
    }

    public void clickSlidingImages() {
        LOG.info("Click all the buttons with images");
        driver.findElement(clickimage2).click();
        driver.findElement(clickimage3).click();
        driver.findElement(clickimage4).click();
    }

    public void hoverOnLaptopuriMenu() {
        LOG.info("Hover on laptopuri menu button");
        WebElement laptopuriemenuElement = driver.findElement(laptopurimenu);
        Actions actions = new Actions(driver);
        actions.moveToElement(laptopuriemenuElement).perform();
    }

    public void clickTablete() {
        LOG.info("Click tablete button");
        driver.findElement(tablete).click();
    }

    public void clickTableteBack() {
        LOG.info("Clicking back from tablete in main page");
        driver.navigate().back();
    }

    public void hoverOnTelefoaneMenu() {
        LOG.info("Hover on telefoane menu button");
        WebElement telefoanemenuElement = driver.findElement(telefoanemenu);
        Actions actions = new Actions(driver);
        actions.moveToElement(telefoanemenuElement).perform();
    }

    public void clickSmartwatch() {
        LOG.info("Click smartwatch button");
        driver.findElement(smartwatch).click();
    }

    public void clickSmartwatchBack() {
        LOG.info("Clicking back from smartwatch in main page");
        driver.navigate().back();
    }

    public void hoverOnTelevizoareMenu() {
        LOG.info("Hover on televizoare menu button");
        WebElement televizoaremenuElement = driver.findElement(televizoaremenu);
        Actions actions = new Actions(driver);
        actions.moveToElement(televizoaremenuElement).perform();
    }

    public void clickMirrorless() {
        LOG.info("Click aparate foto mirrorless button");
        driver.findElement(mirrorless).click();
    }

    public void clickMirrorlessBack() {
        LOG.info("Clicking back from aparate foto mirrorless in main page");
        driver.navigate().back();
    }

    public void hoverOnComponenteMenu() {
        LOG.info("Hover on componente menu button");
        WebElement componentemenuElement = driver.findElement(componentemenu);
        Actions actions = new Actions(driver);
        actions.moveToElement(componentemenuElement).perform();
    }

    public void clickMouse() {
        LOG.info("Click mouse button");
        driver.findElement(mouse).click();
    }

    public void clickMouseBack() {
        LOG.info("Clicking back from mouse in main page");
        driver.navigate().back();
    }

    public void hoverOnCalculatoareMenu() {
        LOG.info("Hover on calculatoare menu button");
        WebElement calculatoaremenuElement = driver.findElement(calculatoaremenu);
        Actions actions = new Actions(driver);
        actions.moveToElement(calculatoaremenuElement).perform();
    }

    public void clickMonitoare() {
        LOG.info("Click monitoare button");
        driver.findElement(monitoare).click();
    }

    public void clickMonitoareBack() {
        LOG.info("Clicking back from monitoare in main page");
        driver.navigate().back();
    }

    public void hoverOnRetelisticaMenu() {
        LOG.info("Hover on retelistica menu button");
        WebElement retelisticamenuElement = driver.findElement(retelisticamenu);
        Actions actions = new Actions(driver);
        actions.moveToElement(retelisticamenuElement).perform();
    }

    public void clickRoutere() {
        LOG.info("Click routere button");
        driver.findElement(routere).click();
    }

    public void clickRoutereBack() {
        LOG.info("Clicking back from routere in main page");
        driver.navigate().back();
    }

    public void hoverOnElectrocasnciceMariMenu() {
        LOG.info("Hover on electrocasnice mari menu button");
        WebElement electrocasnicemarimenuElement = driver.findElement(electrocasniceMari);
        Actions actions = new Actions(driver);
        actions.moveToElement(electrocasnicemarimenuElement).perform();
    }

    public void clickAragazuri() {
        LOG.info("Click aragazuri button");
        driver.findElement(aragazuri).click();
    }

    public void clickAragazuriBack() {
        LOG.info("Clicking back from routere in main page");
        driver.navigate().back();
    }

    public void hoverOnElectrocasnciceMiciMenu() {
        LOG.info("Hover on electrocasnice mici menu button");
        WebElement electrocasnicemicimenuElement = driver.findElement(electrocasniceMici);
        Actions actions = new Actions(driver);
        actions.moveToElement(electrocasnicemicimenuElement).perform();
    }

    public void clickMixere() {
        LOG.info("Click mixere button");
        driver.findElement(mixere).click();
    }

    public void clickMixereBack() {
        LOG.info("Clicking back from mixere in main page");
        driver.navigate().back();
    }

    public void hoverOnHobbyMenu() {
        LOG.info("Hover on hobby menu button");
        WebElement hobbymenuElement = driver.findElement(hobby);
        Actions actions = new Actions(driver);
        actions.moveToElement(hobbymenuElement).perform();
    }

    public void clickCarti() {
        LOG.info("Click carti button");
        driver.findElement(carti).click();
    }

    public void clickCartiBack() {
        LOG.info("Clicking back from carti in main page");
        driver.navigate().back();
    }

    public void hoverOnSanatateMenu() {
        LOG.info("Hover on sanatate menu button");
        WebElement sanatatemenuElement = driver.findElement(sanatate);
        Actions actions = new Actions(driver);
        actions.moveToElement(sanatatemenuElement).perform();
    }

    public void clickUscatoare() {
        LOG.info("Click uscatoare button");
        driver.findElement(uscatoare).click();
    }

    public void clickUscatoareBack() {
        LOG.info("Clicking back from uscatoare in main page");
        driver.navigate().back();
    }

    public void hoverOnParfumuriMenu() {
        LOG.info("Hover on parfumuri menu button");
        WebElement parfumurimenuElement = driver.findElement(parfumuri);
        Actions actions = new Actions(driver);
        actions.moveToElement(parfumurimenuElement).perform();
    }

    public void clickSampoane() {
        LOG.info("Click sampoane button");
        driver.findElement(sampon).click();
    }

    public void clickSampoaneBack() {
        LOG.info("Clicking back from sampoane in main page");
        driver.navigate().back();
    }

    public void hoverOnCeasuriMenu() {
        LOG.info("Hover on ceasuri menu button");
        WebElement ceasurimenuElement = driver.findElement(ceasuri);
        Actions actions = new Actions(driver);
        actions.moveToElement(ceasurimenuElement).perform();
    }

    public void clickCeasuriBarbatesti() {
        LOG.info("Click ceasuri barbatesti button");
        driver.findElement(ceasuribarbatesti).click();
    }

    public void clickCeasuriBarbatestiBack() {
        LOG.info("Clicking back from ceasuri barbatesti in main page");
        driver.navigate().back();
    }

    public void hoverOnBacanieMenu() {
        LOG.info("Hover on bacanie menu button");
        WebElement bacaniemenuElement = driver.findElement(bacanie);
        Actions actions = new Actions(driver);
        actions.moveToElement(bacaniemenuElement).perform();
    }

    public void clickSucuri() {
        LOG.info("Click sucuri button");
        driver.findElement(sucuri).click();
    }

    public void clickSucuriBack() {
        LOG.info("Clicking back from sucuri in main page");
        driver.navigate().back();
    }

    public void hoverOnAutoMenu() {
        LOG.info("Hover on auto menu button");
        WebElement automenuElement = driver.findElement(auto);
        Actions actions = new Actions(driver);
        actions.moveToElement(automenuElement).perform();
    }

    public void clickAnvelope() {
        LOG.info("Click anvelope button");
        driver.findElement(anvelope).click();
    }

    public void clickAnvelopeBack() {
        LOG.info("Clicking back from anvelope in main page");
        driver.navigate().back();
    }

    public void hoverOnCopiiMenu() {
        LOG.info("Hover on copii menu button");
        WebElement copiimenuElement = driver.findElement(copii);
        Actions actions = new Actions(driver);
        actions.moveToElement(copiimenuElement).perform();
    }

    public void clickTriciclete() {
        LOG.info("Click triciclete button");
        driver.findElement(triciclete).click();
    }

    public void clickTricicleteBack() {
        LOG.info("Clicking back from triciclete in main page");
        driver.navigate().back();
    }

    public void hoverOnBricolajMenu() {
        LOG.info("Hover on bricolaj menu button");
        WebElement bricolajmenuElement = driver.findElement(bricolaj);
        Actions actions = new Actions(driver);
        actions.moveToElement(bricolajmenuElement).perform();
    }

    public void clickPolizoare() {
        LOG.info("Click polizoare button");
        driver.findElement(polizoare).click();
    }

    public void clickPolzioareBack() {
        LOG.info("Clicking back from polizoare in main page");
        driver.navigate().back();
    }

    public void hoverOnGradinaMenu() {
        LOG.info("Hover on gradina menu button");
        WebElement gradinamenuElement = driver.findElement(gradina);
        Actions actions = new Actions(driver);
        actions.moveToElement(gradinamenuElement).perform();
    }

    public void clickPiscine() {
        LOG.info("Click piscine button");
        driver.findElement(piscine).click();
    }

    public void clickPiscineBack() {
        LOG.info("Clicking back from piscine in main page");
        driver.navigate().back();
    }

    public void hoverOnCasaMenu() {
        LOG.info("Hover on casa menu button");
        WebElement casamenuElement = driver.findElement(casa);
        Actions actions = new Actions(driver);
        actions.moveToElement(casamenuElement).perform();
    }

    public void clickCanapele() {
        LOG.info("Click canapele button");
        driver.findElement(canapele).click();
    }

    public void clickCanapeleBack() {
        LOG.info("Clicking back from canapele in main page");
        driver.navigate().back();
    }

    public void scrolldown() {
        LOG.info("Scroll down to prdousele zilei logo");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");
    }

    public void clickproduselezilei() {
        LOG.info("Click produsele zilei button");
        driver.findElement(produseleZilei).click();
    }

    public void clickProduseleZileiBack() {
        LOG.info("Clicking back from produsele zilei in main page");
        driver.navigate().back();
    }

    public void clickultimelebucati() {
        LOG.info("Click ultimele bucati button");
        driver.findElement(ultimeleBucati).click();
    }

    public void clickultimelebucatiBack() {
        LOG.info("Clicking back from ultimele bucati in main page");
        driver.navigate().back();
    }

    public void clickresigilate() {
        LOG.info("Click resigilate button");
        driver.findElement(resigilate).click();
    }

    public void clickresigilateBack() {
        LOG.info("Clicking back from resigilate in main page");
        driver.navigate().back();
    }

    public void clickrefurbished() {
        LOG.info("Click refurbished button");
        driver.findElement(refurbished).click();
    }

    public void clickrefurbishedBack() {
        LOG.info("Clicking back from refurbished in main page");
        driver.navigate().back();
    }

    public void clickpartener() {
        LOG.info("Click Vreau sa devin partener button");
        driver.findElement(partener).click();
        String originalWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                driver.close();
                break;
            }
        }
        driver.switchTo().window(originalWindow);
    }

    public void clickfirstvideo() {
        LOG.info("Play first video");
        WebElement video1 = driver.findElement(firstvideo);
        driver.switchTo().frame(video1);
        driver.findElement(videoone).click();
        driver.switchTo().defaultContent();
    }

    public void clickyoutubelink() {
        LOG.info("Click the youtube link button");
        driver.findElement(youtube).click();
        String originalWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                driver.close();
                break;
            }
        }
        driver.switchTo().window(originalWindow);
    }

    public void clickfacebooklink(){
        LOG.info("Click the facebook link button");
        driver.findElement(facebook).click();
        String originalWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                driver.close();
                break;
            }
        }
        driver.switchTo().window(originalWindow);
    }

    public void clickinstagramlink(){
        LOG.info("Click the instagram link button");
        driver.findElement(instagram).click();
        String originalWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                driver.close();
                break;
            }
        }
        driver.switchTo().window(originalWindow);
    }

    public void scrollup() {
        LOG.info("Scroll up to main view of the main page");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-2000)");
    }


}
