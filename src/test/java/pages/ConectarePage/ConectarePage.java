package pages.ConectarePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class ConectarePage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(ConectarePage.class);
    public static ConectarePage instance;

    private By contulmeu = By.xpath("//i[@class='icon-icon_user']");
    private By conectare = By.xpath("//div[@class='myAccountMenu']//a[contains(text(),'Conecteaza-te')]");
    private By insertemail = By.id("email_address");
    private By insertpassword = By.xpath("//input[@name='passwordx']");
    private By enter = By.xpath("//button[normalize-space()='Conecteaza-te']");

    private ConectarePage() {
    }

    public static ConectarePage getInstance() {
        if (instance == null) {
            instance = new ConectarePage();
        }
        return instance;
    }

    public void hoverOnContulMeu() {
        LOG.info("Hover on contul meu button");
        WebElement contulmeuElement = driver.findElement(contulmeu);
        Actions actions = new Actions(driver);
        actions.moveToElement(contulmeuElement).perform();
    }

    public void clickconectarebutton() {
        LOG.info("Click conecteaz-te button");
        driver.findElement(conectare).click();
    }

    public void insertemailaddress(String email){
        LOG.info("Insert email address in the email field");
        driver.findElement(insertemail).sendKeys(email);
    }

    public void insertpassword(String password){
        LOG.info("Insert password in the password field");
        driver.findElement(insertpassword).sendKeys(password);
    }

    public void clickenter(){
        LOG.info("Click 'conecteaza-te' button");
        driver.findElement(enter).click();
    }


}
