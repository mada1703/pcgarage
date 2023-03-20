package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.AutentificarePage.AutentificarePage;


public class BaseTest {

    public AutentificarePage AutentificarePage=AutentificarePage.getInstance();

    @BeforeSuite
    public void init(){
        BasePage.setUp();
    }

    @AfterSuite
    public void tearDown(){
        BasePage.tearDown();
    }
}
