package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.navigation.NavigateTo;
import starter.tasks.TypeTheGivenTextIn;
import starter.tasks.assertions.ValidatedCorrectAmount;

public class counterWordsStepDefinitions {


    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{actor} is counting the words of a test in the website")
    public void countingWordsInTheWebsite(Actor actor) {
        actor.wasAbleTo(NavigateTo.wordcounterHomePage());
    }

    @When("{actor} types the Lorem Ipsum")
    public void typeTheLoremIpsum(Actor actor) {
        actor.attemptsTo(
                TypeTheGivenTextIn.inField(
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
                ));
    }

    @Then("{actor} should see the number of words and characters in the Lorem Ipsum")
    public void shouldSeeTheNumberOfWordsInTheLoremIpsum(Actor actor) {
        actor.attemptsTo(ValidatedCorrectAmount.of().words(69).characters(445));
    }
}
