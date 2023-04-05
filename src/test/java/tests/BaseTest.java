package tests;

import org.testng.annotations.BeforeSuite;
import pages.AutentificarePage.AutentificarePage;
import pages.BasePage;
import pages.ComandaPage.ComandaPage;
import pages.ConectarePage.ConectarePage;
import pages.MainPage.MainPage;


public class BaseTest {

    public AutentificarePage autentificarePage= AutentificarePage.getInstance();
    public ComandaPage comandaPage = ComandaPage.getInstance();
    public MainPage mainPage = MainPage.getInstance();
    public ConectarePage conectarePage = ConectarePage.getInstance();

    @BeforeSuite
    public void init(){
        BasePage.setUp();
    }

//    @AfterSuite
//    public void tearDown(){
//        BasePage.tearDown();
//    }
}