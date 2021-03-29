package com.ao.stepdefs;

import com.ao.pages.WashingMachinesPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class MyWashLoadStepdefs {
    @And("^I Select wash Load Large in ListerPage$")
    public void iSelectWashLoadLargeInListerPage() {
        new WashingMachinesPage().LarGe_Wash_Load_BeKo_Washing_machine();
    }

    @Then("^I can see List of given Wash Load BeKo Products Successfully$")
    public void iCanSeeListOfGivenWashLoadBeKoProductsSuccessfully() {
        Assert.assertEquals("10 Kg, 10.5 Kg, 11 Kg, 12 Kg, 15 Kg",new WashingMachinesPage().Large_Load_BeKo_SucCeSS_Text());
    }
}
