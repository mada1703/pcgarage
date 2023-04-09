package tests;

import org.testng.annotations.BeforeSuite;
import pages.AutentificarePage.AutentificarePage;
import pages.BasePage;
import pages.ComandaPage.ComandaPage;
import pages.ComparePage.ComparePage;
import pages.ConectarePage.ConectarePage;
import pages.MainPage.MainPage;
import pages.RCAPage.RCAPage;
import pages.ReturPage.ReturPage;
import pages.ServicePage.ServicePage;


public class BaseTest {

    public AutentificarePage autentificarePage = AutentificarePage.getInstance();
    public ComandaPage comandaPage = ComandaPage.getInstance();
    public MainPage mainPage = MainPage.getInstance();
    public ConectarePage conectarePage = ConectarePage.getInstance();
    public ComparePage comparePage = ComparePage.getInstance();
    public RCAPage rcaPage = RCAPage.getInstance();
    public ReturPage returPage = ReturPage.getInstance();
    public ServicePage servicePage = ServicePage.getInstance();

    @BeforeSuite
    public void init() {
        BasePage.setUp();
    }

//    @AfterSuite
//    public void tearDown(){
//        BasePage.tearDown();
//    }
}