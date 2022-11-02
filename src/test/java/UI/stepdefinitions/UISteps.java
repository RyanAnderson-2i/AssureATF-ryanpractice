package UI.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import UI.pages.BaseURLPage;
import org.junit.Assert;

public class UISteps {

    @Steps
    BaseURLPage baseURLPage;

    @Given("I navigate to base url")
    public void i_navigate_to_base_url() {
        baseURLPage.open();
    }

    @Then("the h1 contains {string}")
    public void the_h1_contains(String h1) {
        Assert.assertTrue(baseURLPage.getH1().contains(h1));
    }

}

