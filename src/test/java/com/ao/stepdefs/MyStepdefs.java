package com.ao.stepdefs;

import com.ao.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    @When("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @And("^I click on LoginTab$")
    public void iClickOnLoginTab() {
    }

    @Then("^I redirected to Login Page$")
    public void iRedirectedToLoginPage() {
    }

    @When("^I enter url$")
    public void iEnterUrl() {
    }

    @Then("^I redirected to HomePage$")
    public void iRedirectedToHomePage() {
    }

    @Given("^I am  on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I Enter \"([^\"]*)\" in search input field$")
    public void iEnterInSearchInputField(String proDucTName)  {
      new HomePage().eNtErProDuctName(proDucTName);
    }

    @Then("^I redirected to washingMachine Page$")
    public void iRedirectedToWashingMachinePage() {
        Assert.assertEquals("Washing Machines",new HomePage().WashingMachinePageNaviGAtIonSuCcEssFUlLY());
    }
}
