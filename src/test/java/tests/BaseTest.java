package tests;

import org.testng.annotations.BeforeSuite;
import pages.AutentificarePage.AutentificarePage;
import pages.BasePage;
import pages.ComandaPage.ComandaPage;


public class BaseTest {

    public AutentificarePage autentificarePage= AutentificarePage.getInstance();
    public ComandaPage comandaPage = ComandaPage.getInstance();

    @BeforeSuite
    public void init(){
        BasePage.setUp();
    }

//    @AfterSuite
//    public void tearDown(){
//        BasePage.tearDown();
//    }
}