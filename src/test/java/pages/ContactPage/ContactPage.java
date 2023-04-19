package pages.ContactPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class ContactPage extends BasePage {

    public static final Logger LOG = LoggerFactory.getLogger(ContactPage.class);
    public static ContactPage instance;

    private ContactPage() {
    }

    public static ContactPage getInstance() {
        if (instance == null) {
            instance = new ContactPage();
        }
        return instance;
    }

    private By map = By.id("map");
    private By contactbutton = By.xpath("//a[@class='meniu1_last contact']");
    private By suportclienti = By.xpath("//a[normalize-space()='Suport Clienti']");
    private By contactservice = By.xpath("//a[normalize-space()='Contact service']");
    private By contactcorporate = By.xpath("//a[normalize-space()='Contact corporate']");
    private By sesizari = By.xpath("//a[normalize-space()='Sesizari si reclamatii']");
    private By presa = By.xpath("//a[normalize-space()='Relatii cu presa']");
    private By formular = By.id("mainSelect");
    private By inputnume = By.xpath("//input[@id='generala_nume']");
    private By inputemail = By.xpath("//input[@id='generala_email']");
    private By inputphone = By.xpath("//input[@id='generala_telefon']");
    private By continuabutton = By.xpath("//div[@type='generala']//div[@class='nextStep'][normalize-space()='Continua']");
    private By inputmesaj = By.id("generala_mesaj");


    public void clickcontactbutton(){
        LOG.info("Click contact button");
        driver.findElement(contactbutton).click();
    }

    public void clickmap(){
        LOG.info("Click map");
        driver.findElement(map).click();
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

    public void scrolldown() {
        LOG.info("Scroll down to date de contact");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
    }

    public void clicksuportclienti(){
        LOG.info("Click suport clienti dropdown");
        driver.findElement(suportclienti).click();
    }

    public void clickcontactservice(){
        LOG.info("Click contact service dropdown");
        driver.findElement(contactservice).click();
    }

    public void clickcontactcorporate(){
        LOG.info("Click contact corporate dropdown");
        driver.findElement(contactcorporate).click();
    }

    public void clicksesizari(){
        LOG.info("Click sesizari si reclamatii dropdown");
        driver.findElement(sesizari).click();
    }

    public void clickrelatiipresa(){
        LOG.info("Click relatii cu presa dropdown");
        driver.findElement(presa).click();
    }

    public void selectintrebare(String intrebare){
        LOG.info("Select intrebare from formular contact dropdown menu");
        Select newIntrebare = new Select(driver.findElement(formular));
        newIntrebare.selectByValue(intrebare);
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(continuabutton));
    }

    public void inputname(String nume){
        LOG.info("Input name in the name field");
        driver.findElement(inputnume).sendKeys(nume);
    }

    public void inputemail(String email){
        LOG.info("Input email in the email field");
        driver.findElement(inputemail).sendKeys(email);
    }

    public void inputphone(String phone){
        LOG.info("Input phone number in the phone number");
        driver.findElement(inputphone).sendKeys(phone);
    }

    public void clickcontinuabutton(){
        LOG.info("Click continua button");
        driver.findElement(continuabutton).click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(inputmesaj));
        sleep(1000);
    }

    public void inputmesaj(String mesaj){
        LOG.info("Input mesaj");
        driver.findElement(inputmesaj).click();
        driver.findElement(inputmesaj).sendKeys(mesaj);
    }

    public void clickBack() {
        LOG.info("Clicking back in browser");
        driver.navigate().back();
    }
}
