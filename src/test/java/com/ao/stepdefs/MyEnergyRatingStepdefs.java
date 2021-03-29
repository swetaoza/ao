package com.ao.stepdefs;

import com.ao.pages.WashingMachinesPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class MyEnergyRatingStepdefs {
    @And("^I Select Energy Rating A\\+\\+ or Above in ListerPage$")
    public void iSelectEnergyRatingAOrAboveInListerPage() {
        new WashingMachinesPage().AplUSPlUs_BekO_WashingMachine();
    }

    @Then("^I can see List of given Energy Rating BeKo Products Successfully$")
    public void iCanSeeListOfGivenEnergyRatingBeKoProductsSuccessfully() {
        Assert.assertEquals("A+++",new WashingMachinesPage().a_Plus_pLus_BeKo_SucCeSS_Text());
    }
}
