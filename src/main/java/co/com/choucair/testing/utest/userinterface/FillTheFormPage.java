package co.com.choucair.testing.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillTheFormPage extends PageObject {
    public static final Target INPUT_NAME =Target.the("Enter the name")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME =Target.the("Enter the last name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL =Target.the("Enter the email")
            .located(By.id("email"));
    public static final Target INPUT_YEAR =Target.the("Enter the year")
            .located(By.id("birthYear"));
    public static final Target INPUT_DAY =Target.the("Enter the day")
            .located(By.id("birthDay"));
    public static final Target INPUT_MONTH =Target.the("Enter the month")
            .located(By.id("birthMonth"));
    public static final Target INPUT_NEXT_LOCATION =Target.the("Click Next location")
            .located(By.xpath("//div[@class='form-group col-xs-12 text-right']//span[contains(text(),'Next: Location')]"));
    public static final Target INPUT_CITY =Target.the("Enter the city")
            .located(By.id("city"));
    public static final Target INPUT_ZIP_CODE =Target.the("Enter the zip code")
            .located(By.id("zip"));
    public static final Target INPUT_NEXT_DEVICES =Target.the("Click Next Devices")
            .located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(),'Next: Devices')]"));
    public static final Target INPUT_NEXT_LAST =Target.the("Click Next Last Step")
            .located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(),'Next: Last Step')]"));
    public static final Target INPUT_PASSWORD =Target.the("Enter the password")
            .located(By.id("password"));
    public static final Target INPUT_COFIRM_PASSWORD =Target.the("Enter the password confirmation")
            .located(By.id("confirmPassword"));
    public static final Target INPUT_TERMS =Target.the("Check terms")
            .located(By.xpath("//span[@class='checkmark signup-consent__checkbox error']"));
    public static final Target INPUT_PRIVACY =Target.the("Check privacy and security")
            .located(By.xpath("//label[@class='input-check-box signup-consent']"));
    public static final Target INPUT_COMPLETE =Target.the("Click Complete setup")
            .located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(),'Complete Setup')]"));

}
