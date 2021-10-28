package utils;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class WindowHandlesUtil extends PageObject {

public void switchToLastWindow() {
        for (String window : getDriver().getWindowHandles()) {
            getDriver().switchTo().window(window);
            waitABit(1000);
        }
    }
}
