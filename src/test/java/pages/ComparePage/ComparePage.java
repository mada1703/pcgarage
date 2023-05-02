package pages.ComparePage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

import java.util.concurrent.TimeUnit;

public class ComparePage extends BasePage {

    public static final Logger LOG = LoggerFactory.getLogger(ComparePage.class);
    public static ComparePage instance;

    private ComparePage(){
    }

    public static ComparePage getInstance(){
        if (instance == null){
            instance = new ComparePage();
        }
        return instance;
    }

    private By componentemenu = By.xpath("//a[normalize-space()='Componente & Periferice']");
    private By videocard = By.xpath("//a[@class='subcategTitle'][normalize-space()='Placi video']");
    private By furnizor = By.xpath("//a[normalize-space()='Furnizor']");
    private By amd = By.xpath("//a[normalize-space()='AMD']");
    private By sortare = By.id("sortare");
    private By decreasing = By.xpath("//option[@value='pretd']");
    private By favorit1 = By.xpath("//div[@id='r7487478']");
    private By nvidia = By.xpath("//a[normalize-space()='NVIDIA']");
    private By favorit2 = By.xpath("//div[@id='r6874666']");
    private By favorite = By.xpath("//span[@id='prod_ret_cate']");
    private By selectallfavorite = By.xpath("//input[@id='select_all_Placivideo']");
    private By compara = By.xpath("//span[normalize-space()='Compara']");
    private By sterge2 = By.xpath("//a[@href='https://www.cel.ro/compara/6874666']");
    private By adaugare = By.xpath("//a[@class='addProducts']");
    private By magazin = By.xpath("//a[normalize-space()='Magazin']");
    private By favorit3 = By.xpath("//div[@id='r7579164']");
    private By favorit1checkmark = By.xpath("//input[@value='6874666']");
    private By favorit3checkmark = By.xpath("//input[@value='7487478']");
    private By rtx4090 = By.xpath("//a[@href='https://www.cel.ro/placa-video-asus-tuf-gaming-nvidia-geforce-rtx-4090-oc-edition-24gb-gddr6x-384-bit-dlss-3-0-tuf-rtx4090-o24g-pNyo0MDMoMA-l/']");
    private By pictureright = By.xpath("//a[@id='rarrow']");
    private By adaugacos = By.xpath("//div[@class='specialButtons']//span[contains(text(),'Adauga in cos')]");
    private By categorii = By.xpath("//div[@class='categoriesHeader showCategoriesBtn']//i[@class='icon-menu']");


    public void hoverOnComponenteMenu() {
        LOG.info("Hover on componente menu button");
        WebElement componentemenuElement = driver.findElement(componentemenu);
        Actions actions = new Actions(driver);
        actions.moveToElement(componentemenuElement).perform();
    }

    public void clickvideocard(){
        LOG.info("Click video cards menu");
        driver.findElement(videocard).click();
    }

    public void clickfurnizorcheckmark(){
        LOG.info("Click stoc furnizor checkmark");
        driver.findElement(furnizor).click();
    }

    public void scrolldown(){
        LOG.info("Scroll down to chipset AMD");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
    }

    public void clickamd(){
        LOG.info("Click producator AMD");
        driver.findElement(amd).click();
    }

    public void clicksortare(){
        LOG.info("Click sortare submenu");
        driver.findElement(sortare).click();
    }

    public void clickdecreasing(){
        LOG.info("Click decreasing button");
        driver.findElement(decreasing).click();
    }

    public void clickfavorit1(){
        LOG.info("Click the favorite on the first product");
        driver.findElement(favorit1).click();
    }

    public void clicknvidia(){
        LOG.info("Click producator Nvidia");
        driver.findElement(nvidia).click();
    }

    public void clickfavorit2(){
        LOG.info("Click the favorite on the second product");
        driver.findElement(favorit2).click();
        sleep(300);
    }

    public void clickprodusefavorite(){
        LOG.info("Click produse favorite menu");
        driver.findElement(favorite).click();
    }

    public void clickallproductscheckmark(){
        LOG.info("Click on the checkmark for all products");
        driver.findElement(selectallfavorite).click();
    }

    public void clickcomparabutton(){
        LOG.info("Click on the compara button");
        driver.findElement(compara).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String originalWindow = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            if (!originalWindow.equals(handle)){
                driver.switchTo().window(driver.getWindowHandles().toArray(new String[0])[1]);
                ;
                break;
            }
        }

    }

    public void clickstergeproduct2(){
        LOG.info("Click on sterge button from the second prdouct");
        driver.findElement(sterge2).click();
    }

    public void clickadaugare(){
        LOG.info("Click adaugare button");
        driver.findElement(adaugare).click();

    }

    public void clickmagazin(){
        LOG.info("Click stoc magazin checkmark");
        driver.findElement(magazin).click();
    }

    public void clickthirdproduct(){
        LOG.info("Click third product to add to favorites");
        driver.findElement(favorit3).click();
        sleep(300);
    }

    public void clickprodusefavorite2(){
        LOG.info("Click produse favorite button for the second time");
        driver.findElement(favorite).click();
    }

    public void clickcheckmark1(){
        LOG.info("Click the checkmark of the first product");
        driver.findElement(favorit1checkmark).click();
    }

    public void clickcheckmark3(){
        LOG.info("Click the checkmark of the third product");
        driver.findElement(favorit3checkmark).click();
    }

    public void click4090(){
        LOG.info("Click the 4090 video card");
        driver.findElement(rtx4090).click();
    }

    public void sliderright(){
        LOG.info("Slide right through the images");
        driver.findElement(pictureright).click();
    }

    public void clickadaugabutton(){
        LOG.info("Click adaugare in cos button");
        driver.findElement(adaugacos).click();
    }

    public void hoverOnCategoriiMenu() {
        LOG.info("Hover on categorii dropdown menu");
        WebElement categoriimenuElement = driver.findElement(categorii);
        Actions actions = new Actions(driver);
        actions.moveToElement(categoriimenuElement).perform();
    }



}
