package pages.ServicePage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class ServicePage extends BasePage {

    public static final Logger LOG = LoggerFactory.getLogger(ServicePage.class);
    public static ServicePage instance;

    private ServicePage() {
    }

    public static ServicePage getInstance() {
        if (instance == null) {
            instance = new ServicePage();
        }
        return instance;
    }

    private By servicebutton = By.xpath("//a[@class='service']");
    private By inputnume = By.id("nume");
    private By inputemail = By.id("email");
    private By inputphone = By.id("telefon");
    private By factura = By.id("nrfactura");
    private By nrfactura = By.id("nrFactFromModal");
    private By renuntabutton = By.xpath("//a[@href='#'][normalize-space()='Renunta']");
    private By serialnumber = By.id("sn");
    private By descrieredefect = By.id("defect");
    private By adresaridicare = By.id("ridicare_adresa");
    private By selectjudet = By.id("ridicare_judet");
    private By conditiicheckbox = By.id("checkbox");
    private By file = By.id("fisiere_atasate");


    public void clickservicebutton(){
        LOG.info("Click service button");
        driver.findElement(servicebutton).click();
        }

    public void scrolldown() {
        LOG.info("Scroll down to formular service");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1800)");
    }

    public void inputnume(String nume) {
        LOG.info("Input name in the name field");
        driver.findElement(inputnume).sendKeys(nume);
    }

    public void inputemail(String email) {
        LOG.info("Input email in the email field");
        driver.findElement(inputemail).sendKeys(email);
    }

    public void inputphone(String phone) {
        LOG.info("Input phone number in the telefon field");
        driver.findElement(inputphone).sendKeys(phone);
    }

    public void clickfactura() {
        LOG.info("Click factura field");
        driver.findElement(factura).click();
    }

    public void inputnrfactura(String numarfactura) {
        LOG.info("Input nr factura in the numar factura field");
        driver.findElement(nrfactura).sendKeys(numarfactura);
    }

    public void clickrenuntabutton() {
        LOG.info("Click renunta button");
        driver.findElement(renuntabutton).click();
    }

    public void inputserialnumber(String sn){
        LOG.info("Input serial number in the serial number field");
        driver.findElement(serialnumber).sendKeys(sn);
    }

    public void inputdescrieredefect(String defect){
        LOG.info("Input descriere defect in the defect field");
        driver.findElement(descrieredefect).sendKeys(defect);
    }

    public void inputadresaridicare(String adresa){
        LOG.info("Input adresa in the adresa ridicare colet field");
        driver.findElement(adresaridicare).sendKeys(adresa);
    }

    public void selectJudet(String Judet) {
        LOG.info("Select judet");
        Select newJudet = new Select(driver.findElement(selectjudet));
        newJudet.selectByValue(Judet);
    }

    public void clickconditiicheckbox(){
        LOG.info("Click the termeni si conditii checkbox");
        driver.findElement(conditiicheckbox).click();
    }

    public void selectImage(){
        LOG.info("Choose image to upload");
        WebElement fileChoose = driver.findElement(file);
        fileChoose.sendKeys("C:/Users//mada1703//Desktop//javapic//Thinking-of-getting-a-cat.png");
    }

    public void clickBack() {
        LOG.info("Clicking back once in browser");
        driver.navigate().back();
    }
}
