package UI.stepdefinitions;

import UI.pages.HomePage;
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
    @Steps
    HomePage homepage;

    @Given("I navigate to base url")
    public void i_navigate_to_base_url() {
        baseURLPage.open();
    }

    @Then("the div contains {string}")
    public void the_h1_contains(String h1) {
        Assert.assertTrue(baseURLPage.getH1().contains(h1));
    }

    @Then("I type in login information")
    public void I_type_in_login_information(){
        homepage.fillInput("standard_user","secret_sauce");
    }

}

