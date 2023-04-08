package pages.ComandaPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

import java.util.concurrent.TimeUnit;

public class ComandaPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(ComandaPage.class);
    public static ComandaPage instance;


    private ComandaPage(){
    }

    public static ComandaPage getInstance(){
        if (instance == null){
            instance = new ComandaPage();
        }
        return instance;
    }

    private By logo = By.id("logo_head");
    private By telefoanemenu = By.xpath("//a[normalize-space()='Telefoane Mobile & Gadget']");
    private By telefoane = By.xpath("//a[@class='subcategTitle'][normalize-space()='Telefoane Mobile']");
    private By apple = By.xpath("//a[normalize-space()='Apple']");
    private By minimvalue = By.id("minManualValue");
    private By inputminimvalue = By.id("minManualValue");
    private By maximvalue = By.id("maxManualValue");
    private By inputmaxvalue = By.id("maxManualValue");
    private By tehnologie = By.xpath("//a[normalize-space()='5G']");
    private By culoare = By.xpath("//a[normalize-space()='Deep Purple']");
    private By sortare = By.id("sortare");
    private By decreasing = By.xpath("//option[@value='pretd']");
    private By iphone = By.xpath("//img[@alt='Telefon Mobil Apple iPhone 14 Pro Dual SIM 5G 6GB 1TB Deep Purple ']");
    private By cumpara = By.xpath("//div[@class='specialButtons']//div[@title='Cumpara Telefon Mobil Apple iPhone 14 Pro Dual SIM 5G 6GB 1TB Deep Purple']");
    private By bucati = By.xpath("//select[@name='cart_quantity[]']");
    private By adaugaadresa= By.xpath("//div[@class='block-section']//div[@class='radio_value adaugaadresa'][normalize-space()='Adauga o adresa']");
    private By inputnume = By.id("fullname");
    private By inputtelehponenumber = By.id("phone");
    private By inputadresa = By.xpath("//input[@id='adresaInput']");
    private By judet = By.xpath("//select[@id='judetadr']");
    private By localitate = By.xpath("//select[@id='localitateadr']");
    private By codpostal = By.id("codpostal");
    private By greenadauga = By.xpath("//a[normalize-space()='Adauga']");
    private By ramburs = By.id("plata2");
    private By informatii = By.xpath("//textarea[@name='comments']");
    private By conditii = By.xpath("//input[@id='read_retur']");
    private By declaratie = By.id("e_major");

    public boolean islogodisplayed(){
        LOG.info("Verify if logo is displayed");
        return driver.findElement(logo).isDisplayed();
    }

    public void hoverOnTelefoaneMenu() {
        LOG.info("Hover on telefoane menu button");
        WebElement telefoanemenuElement = driver.findElement(telefoanemenu);
        Actions actions = new Actions(driver);
        actions.moveToElement(telefoanemenuElement).perform();
    }

    public void clicktelefoane(){
        LOG.info("Click telefoane button");
        driver.findElement(telefoane).click();
    }

    public void clickproducator(){
        LOG.info("Click producator checkmark");
        driver.findElement(apple).click();
    }

    public void deleteminvaluedata() {
        LOG.info("Delete minim value data");
        driver.findElement(minimvalue).clear();
    }

    public void typeInMinValue(String minimvalue){
        LOG.info("Type in minimum value");
        driver.findElement(inputminimvalue).sendKeys(minimvalue);
    }

    public void deletemaxvaluedata(){
        LOG.info("Delete maxim value data");
        driver.findElement(maximvalue).clear();
    }

    public void typeInMaxValue(String maximvalue){
        LOG.info("Type in maxim value");
        driver.findElement(inputmaxvalue).sendKeys(maximvalue);
    }

    public void scrolldown(){
        LOG.info("Scroll down to tehnologie");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");
    }

    public void clicktehnologie(){
        LOG.info("Click tehnologie 5G checkmark");
        driver.findElement(tehnologie).click();
    }

    public void scrolldown2(){
        LOG.info("Scroll down to tehnologie");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");
    }

    public void clickculoare(){
        LOG.info("Click culoare deep purple checkmark");
        driver.findElement(culoare).click();
    }

    public void clicksortare(){
        LOG.info("Click sortare submenu");
        driver.findElement(sortare).click();
    }

    public void clickdecreasing(){
        LOG.info("Click decreasing button");
        driver.findElement(decreasing).click();
    }

    public void clickiphone(){
        LOG.info("Click iphone product");
        driver.findElement(iphone).click();
    }

    public void clickcumpara(){
        LOG.info("Click adauga in cos button");
        driver.findElement(cumpara).click();
    }

    public void selectBucati(String selectBucati){
        LOG.info("Select nr bucati dropdown menu");
        Select newBucati = new Select(driver.findElement(bucati));
        newBucati.selectByValue(selectBucati);
    }

    public void scrolldown3(){
        LOG.info("Scroll down to date cont");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        sleep(2000);
    }

    public void clickadaugaadresa(){
        LOG.info("Click adauga adresa button");
        driver.findElement(adaugaadresa).click();
    }

    public void typeInFullname(String fullname){
        LOG.info("Type in full name");
        driver.findElement(inputnume).sendKeys(fullname);
    }

    public void typeInTelephonenumber(String telephonenumber){
        LOG.info("Type in telephone number");
        driver.findElement(inputtelehponenumber).sendKeys(telephonenumber);
    }

    public void typeInAdresa(String adresa){
        LOG.info("Type in adresa");
        driver.findElement(inputadresa).sendKeys(adresa);
    }

    public void selectJudet(String selectJudet) {
        LOG.info("Select judet dropdown menu");
        Select newJudet = new Select(driver.findElement(judet));
        newJudet.selectByValue(selectJudet);
    }

    public void selectLocalitate(String selectLocalitate){
        LOG.info("Select localitate dropdown menu");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select newLocalitate = new Select(driver.findElement(localitate));
        newLocalitate.selectByValue(selectLocalitate);
    }

    public void inputcodpostal(String Codpostal){
        LOG.info("Input cod postal in the cod postal field");
        driver.findElement(codpostal).sendKeys(Codpostal);
    }

    public void clickgreenadauga(){
        LOG.info("Click the green adauga button");
        driver.findElement(greenadauga).click();
    }

    public void scrolldown5(){
        LOG.info("Scroll down to metoda de plata");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        sleep(1000);
    }

    public void clickramburs(){
        LOG.info("Click ramburs checkmark");
        driver.findElement(ramburs).click();
    }

    public void clickconditi(){
        LOG.info("Click conditii de returnare checkmark");
        driver.findElement(conditii).click();
    }

    public void click18ani(){
        LOG.info("Click declaratie 18 ani");
        driver.findElement(declaratie).click();
    }

    public void typeInComentarii(String comentarii){
        LOG.info("Type in alte informatii");
        driver.findElement(informatii).sendKeys(comentarii);
    }

    public void scrolldown6(){
        LOG.info("Scroll down to submit");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
    }


}
