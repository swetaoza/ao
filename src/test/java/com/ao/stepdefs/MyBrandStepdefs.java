package com.ao.stepdefs;

import com.ao.pages.WashingMachinesPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class MyBrandStepdefs {
    @And("^I Select Brand Name BeKo$")
    public void iSelectBrandNameBeKo() {
        new WashingMachinesPage().ClickOnBeKoBrand();
    }

    @Then("^I navigate to Target Page Successfully$")
    public void iNavigateToTargetPageSuccessfully() {
        Assert.assertEquals("Beko",new WashingMachinesPage().bran_BeKo_success_tEXt());
    }
}
