package pages.AutentificarePage;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

import java.util.concurrent.TimeUnit;


public class AutentificarePage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(AutentificarePage.class);
    public static AutentificarePage instance;


    private By logo = By.id("logo_head");
    private By contulmeu = By.xpath("//i[@class='icon-icon_user']");
    private By contnou = By.xpath("//a[normalize-space()='Cont nou']");
    private By firstname = By.id("firstname");
    private By lastname = By.id("lastname");
    private By email = By.xpath("//div[@class='value']//input[@id='email_address']");
    private By telefon = By.id("telephone");
    private By adresa = By.id("street_address");
    private By judet = By.id("entry_suburb");
    private By oras = By.id("city");
    private By termeni = By.xpath("//input[@name='termeni']");
    private By creare = By.xpath("//button[normalize-space()='Creeaza cont']");
    private final By errormsg = By.xpath("//span[@class='eroareafis']");


    private AutentificarePage() {
    }

    public static AutentificarePage getInstance() {
        if (instance == null) {
            instance = new AutentificarePage();
        }
        return instance;
    }

    public boolean isLogoDisplayed() {
        LOG.info("Verify if logo is displayed");
        return driver.findElement(logo).isDisplayed();

    }

    public void hoverOnContulMeu() {
        LOG.info("Hover on contul meu button");
        WebElement contulmeuElement = driver.findElement(contulmeu);
        Actions actions = new Actions(driver);
        actions.moveToElement(contulmeuElement).perform();
    }

    public void clickcontnou() {
        LOG.info("Click cont nou button");
        driver.findElement(contnou).click();
    }

    public void typeInNume(String Nume) {
        LOG.info("Type in nume");
        driver.findElement(firstname).sendKeys(Nume);
    }

    public void typeInPrenume(String Prenume) {
        LOG.info("Type in prenume");
        driver.findElement(lastname).sendKeys(Prenume);
    }

    public void typeInEmail(String Email) {
        LOG.info("Type in email");
        driver.findElement(email).sendKeys(Email);
    }

    public void typeInTelephone(String Telefon) {
        LOG.info("Type in telephone");
        driver.findElement(telefon).sendKeys(Telefon);
    }

    public void typeInAddress(String Adresa) {
        LOG.info("Type in adresa");
        driver.findElement(adresa).sendKeys(Adresa);
    }

    public void selectJudet(String Judet) {
        LOG.info("Select judet");
        Select newJudet = new Select(driver.findElement(judet));
        newJudet.selectByValue(Judet);

    }

    public void selectOras(String Oras) {
        LOG.info("Select oras");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select newOras = new Select(driver.findElement(oras));
        newOras.selectByValue(Oras);
    }

    public void clickTermenicheckmark() {
        LOG.info("Click termeni checkmark");
        driver.findElement(termeni).click();
    }

    public void scrolldown() {
        LOG.info("Scroll down to creare cont");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
    }

    public void clickCreearebutton() {
        LOG.info("Click Creeaza cont button");
        driver.findElement(creare).click();
    }

    public void clickBack() {
        LOG.info("Clicking back once in browser");
        driver.navigate().back();
    }

    public boolean isErrorMessageDisplayed() {
        LOG.info("Verify if error message is displayed");
        return driver.findElement(errormsg).isDisplayed();

    }

    public void click2Back() {
        LOG.info("Clicking back twice in browser");
        driver.navigate().back();
    }


}
