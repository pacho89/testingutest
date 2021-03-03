package co.com.choucair.testing.proyectobase.stepdefinitions;

import co.com.choucair.testing.utest.questions.Answer;
import co.com.choucair.testing.utest.tasks.FillTheForm;
import co.com.choucair.testing.utest.tasks.JoinToday;
import co.com.choucair.testing.utest.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairUtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Danny wants to join today on utest page$")
    public void thanDannyWantsToJoinTodayOnUtestPage() {
        OnStage.theActor("Danny").wasAbleTo(OpenUp.thePage(), JoinToday.onThePage());

    }

    @When("^he fill the form for join today in utest page$")
    public void heFillTheFormForJoinTodayInUtestPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(FillTheForm.theForm());

    }

    @Then("^he register in the utest page$")
    public void heRegisterInTheUtestPage(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }

}
