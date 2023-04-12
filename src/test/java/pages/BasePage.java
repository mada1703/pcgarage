package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(BasePage.class);
    public static WebDriver driver;

    public static void setUp(){
        LOG.info("Start test");
        System.setProperty("webdriver.chrome.driver", "C://Webdrivers/chromedriver112.exe");
        driver = new ChromeDriver();
        String url = "https://www.cel.ro//";
        driver.get(url);

        LOG.info("Open browser maximize");
        driver.manage().window().maximize();

    }

//    public static void tearDown(){
//        LOG.info("Close the browser");
//        driver.quit();
//    }

    public static String returnBaseUrl(){
        return "https://www.cel.ro/";
    }

    public static String getBaseUrl(){
        String baseUrl = returnBaseUrl();
        if (baseUrl != null){
            return  baseUrl.replace("", "");
        }
        return baseUrl;
    }

    public static void sleep(long ms){
        try {
            Thread.sleep(ms)
            ;
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }




}
