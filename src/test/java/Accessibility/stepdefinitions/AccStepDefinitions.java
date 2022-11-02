package Accessibility.stepdefinitions;

import Accessibility.stepLib.AccStepLib;
import io.cucumber.java.en.Then;

public class AccStepDefinitions {
    private AccStepLib accStepLib;

    @Then("^the page meets (.*) accessibility criteria$")
    public void pageMeetsAccessibilityCriteria(String standard) {
        accStepLib.validateAccessibility(standard);
    }
}
