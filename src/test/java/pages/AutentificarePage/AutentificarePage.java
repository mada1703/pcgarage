package pages.AutentificarePage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class AutentificarePage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(AutentificarePage.class);
    public static AutentificarePage instance;

    private AutentificarePage() {
    }

    public static AutentificarePage getInstance(){
        if (instance == null){
            instance = new AutentificarePage();
        }
        return instance;
    }
}
