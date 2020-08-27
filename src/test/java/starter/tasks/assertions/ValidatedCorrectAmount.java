package starter.tasks.assertions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static starter.locators.counterHomePage.COUNTED_TEXT;

public class ValidatedCorrectAmount implements Task {

    private Integer words;
    private Integer characters;

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (words != null){
            actor.attemptsTo(Ensure.that(COUNTED_TEXT).text().contains(words + " words"));
        }

        if (characters != null){
            actor.attemptsTo(Ensure.that(COUNTED_TEXT).text().contains(characters + " characters"));
        }
    }

    public static ValidatedCorrectAmount of(){
        return instrumented(ValidatedCorrectAmount.class);
    }

    public ValidatedCorrectAmount words(int words){
        this.words = words;
        return this;
    }

    public ValidatedCorrectAmount characters(int characters){
        this.characters = characters;
        return this;
    }
}
