package co.com.choucair.testing.utest.tasks;

import co.com.choucair.testing.utest.userinterface.FillTheFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class FillTheForm implements Task {

    public static FillTheForm theForm(){
        return Tasks.instrumented(FillTheForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Hernandez").into(FillTheFormPage.INPUT_LAST_NAME),
                Enter.theValue("Danny").into(FillTheFormPage.INPUT_NAME),
                Enter.theValue("prueba1@terra.com.co").into(FillTheFormPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("January").from(FillTheFormPage.INPUT_MONTH),
                SelectFromOptions.byVisibleText("2003").from(FillTheFormPage.INPUT_YEAR),
                SelectFromOptions.byVisibleText("4").from(FillTheFormPage.INPUT_DAY),
                Click.on(FillTheFormPage.INPUT_NEXT_LOCATION),
                Enter.theValue("Puerto Boyaca").into(FillTheFormPage.INPUT_CITY).thenHit(Keys.ARROW_DOWN).thenHit(Keys.ARROW_DOWN).thenHit(Keys.ARROW_DOWN)
                        .thenHit(Keys.ARROW_DOWN).thenHit(Keys.ARROW_DOWN),
                Enter.theValue("0553201").into(FillTheFormPage.INPUT_ZIP_CODE),
                Click.on(FillTheFormPage.INPUT_NEXT_DEVICES),
                Click.on(FillTheFormPage.INPUT_NEXT_LAST),
                Enter.theValue("Pruebatecnica1").into(FillTheFormPage.INPUT_PASSWORD),
                Enter.theValue("Pruebatecnica1").into(FillTheFormPage.INPUT_COFIRM_PASSWORD),
                Click.on(FillTheFormPage.INPUT_TERMS),
                Click.on(FillTheFormPage.INPUT_PRIVACY),
                Click.on(FillTheFormPage.INPUT_COMPLETE)
                );

    }

}
