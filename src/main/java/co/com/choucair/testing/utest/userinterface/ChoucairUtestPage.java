package co.com.choucair.testing.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/")
public class ChoucairUtestPage extends PageObject {
    public static final Target JOIN_TODAY_BUTTON = Target.the("button that show us the form sign up")
            .located(By.xpath("//div[@class='unauthenticated-nav-bar__links navbar-right hidden-sm hidden-xs']//a[contains(text(),'Join Today')]"));
    public static final Target NAME_COMPLETE = Target.the("Extract the message of complete register")
            .located(By.xpath("//h1[contains(text), 'Welcome to the world's largest community of freelance software testers!'"));

}
