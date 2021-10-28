package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import pages.TestPage;

public class StepDefs {
    @Steps
    TestPage testPage;
    @Given("Launch the Browser")
    public void launchTheBrowser() {
        testPage.open();
    }

    @And("search for the given text in google")
    public void navigateToTheGivenUrl() {
        testPage.doSearch();
    }
}
