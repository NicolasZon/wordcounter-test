package starter.locators;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class counterHomePage {
    public static final Target INPUT_FIELD = Target.the("input field")
            .locatedBy("#box");

    public static final Target COUNTED_TEXT = Target.the("counted text")
            .located(By.className("counted"));
}
