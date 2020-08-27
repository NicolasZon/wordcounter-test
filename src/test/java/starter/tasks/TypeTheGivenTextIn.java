package starter.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static starter.locators.counterHomePage.INPUT_FIELD;

public class TypeTheGivenTextIn {
    public static Performable inField(String text) {
        return Task.where("{0} Types '" + text + "' in the field",
                Enter.theValue(text)
                        .into(INPUT_FIELD)
                        .thenHit(Keys.ENTER)
        );
    }
}
