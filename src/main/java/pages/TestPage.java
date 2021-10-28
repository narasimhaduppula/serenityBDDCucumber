package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class TestPage extends PageObject {

    @FindBy(name = "q") public WebElementFacade searchBox;
    @FindBy(css = ".FPdoLc.lJ9FBc [name=btnK]") public  WebElementFacade googleSearchButton;

    @Step("Searching for a Text")
    public void doSearch(){
        searchBox.sendKeys("Veriniti");
        googleSearchButton.click();
        waitABit(10000);
    }
}
