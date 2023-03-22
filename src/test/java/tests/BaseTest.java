package tests;

import org.testng.annotations.BeforeSuite;
import pages.AutentificarePage.AutentificarePage;
import pages.BasePage;


public class BaseTest {

    public AutentificarePage autentificarePage= AutentificarePage.getInstance();

    @BeforeSuite
    public void init(){
        BasePage.setUp();
    }

//    @AfterSuite
//    public void tearDown(){
//        BasePage.tearDown();
//    }
}