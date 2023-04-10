package pages.RCAPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class RCAPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RCAPage.class);
    public static RCAPage instance;

    private RCAPage() {
    }

    public static RCAPage getInstance() {
        if (instance == null) {
            instance = new RCAPage();
        }
        return instance;
    }

    private By rcabutton = By.xpath("//div[@class='top-main-data']//a[2]");
    private By talon = By.xpath("//div[@class='uploadpic']");
    private By inputemail = By.id("email");
    private By inputphone = By.id("telefon");
    private By inputcnp = By.id("cnp");
    private By inputserieci = By.xpath("//input[@data-fieldname='serieci']");
    private By inputnumarci = By.id("numarci");
    private By inputanpermis = By.id("anpermis");
    private By inputetaj = By.id("etaj");
    private By succesmsg = By.xpath("//div[normalize-space()='Datele tale au fost completate! Te rugam sa verifici datele!']");


    public void clickrcabutton() {
        LOG.info("Click rca ieftin button");
        driver.findElement(rcabutton).click();
    }

    public void selectImage() {
        LOG.info("Choose image to upload");
        WebElement fileChoose = driver.findElement(talon);
        fileChoose.click();
        sleep(1000);
        StringSelection ss = new StringSelection("D:\\javapic\\talon2.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(succesmsg));
    }

    public void scrolldown() {
        LOG.info("Scroll down to date proprietar");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
    }

    public void inputemail(String email){
        LOG.info("Input email in the email field");
        driver.findElement(inputemail).sendKeys(email);
    }

    public void inputphone(String phone){
        LOG.info("Input telephone number in the telefon field");
        driver.findElement(inputphone).sendKeys(phone);
    }

    public void inputcnp(String cnp){
        LOG.info("Input cnp in the cnp field");
        driver.findElement(inputcnp).sendKeys(cnp);
    }

    public void inputserieci(String serie){
        LOG.info("Input seria ci in serie CI field");
        driver.findElement(inputserieci).sendKeys(serie);
    }

    public void inputnumarci(String numar){
        LOG.info("Input numar ci in numar CI field");
        driver.findElement(inputnumarci).sendKeys(numar);
    }

    public void selectanpermis(String anpermis) {
        LOG.info("Select an permis");
        Select newAnPermis = new Select(driver.findElement(inputanpermis));
        newAnPermis.selectByValue(anpermis);

    }

    public void inputetaj(String etaj){
        LOG.info("Input etaj in the etaj field");
        driver.findElement(inputetaj).sendKeys(etaj);
    }

    public void clickBack() {
        LOG.info("Clicking back in browser");
        driver.navigate().back();
    }







}
