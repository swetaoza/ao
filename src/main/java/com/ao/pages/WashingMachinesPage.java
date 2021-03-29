package com.ao.pages;

import com.ao.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WashingMachinesPage extends Utility {

    //---This CLass contains All WebElements and Methods to implement functionality  of Washing Machine Page

    //-----Below Are Web Elements Locators -------

    @FindBy(xpath = "//a[@id='shopNow']")
    WebElement _sHOPNowTag;
    //               //body/div[@id='holder']/div[@id='container']/main[@id='app']/div[2]/div[1]/div[1]/aside[1]/div[2]/div[2]/div[2]/fieldset[1]/div[4]/a[1]/label[1]/span[1]
    @FindBy(xpath = "//body/div[@id='holder']/div[@id='container']/main[@id='app']/div[2]/div[1]/div[1]/aside[1]/div[2]/div[3]/div[2]/fieldset[1]/div[4]/a[1]/label[1]/span[1]")
    WebElement _Brand_name_BeKo;
    @FindBy(xpath = "//body/div[@id='holder']/div[@id='container']/main[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/span[3]")
    WebElement _BeKo_VeryFYinG_TeXt;
    @FindBy(xpath = "//h2[contains(text(),'Filter products')]")
    WebElement _Filter_Lister_page_verifying_Text;
    @FindBy(xpath = "//body/div[@id='holder']/div[@id='container']/main[@id='app']/div[2]/div[1]/div[1]/aside[1]/div[2]/div[5]/div[2]/fieldset[1]/div[1]/div[1]/div[3]/a[1]/label[1]")
    WebElement _Silver_BeKo_CheckBox;
    @FindBy(xpath = "//body/div[@id='holder']/div[@id='container']/main[@id='app']/div[2]/div[1]/div[1]/aside[1]/div[2]/div[5]/div[2]/fieldset[1]/div[1]/div[1]/div[3]/a[1]/label[1]")
    WebElement _Silver_BeKo_Washing_Machine_verifying_Text;

    //              //body/div[@id='holder']/div[@id='container']/main[@id='app']/div[2]/div[1]/div[1]/aside[1]/div[2]/div[5]/div[2]/fieldset[1]/div[1]/a[1]/label[1]
   // @FindBy(xpath = "//body/div[@id='holder']/div[@id='container']/main[@id='app']/div[2]/div[1]/div[1]/aside[1]/div[2]/div[5]/div[2]/fieldset[1]/div[1]/a[1]/label[1]")
   // @FindBy(id = "Energy Rating-facet_fv_aplusplusplus-A+++")
    ////               body/div[@id='holder']/div[@id='container']/main[@id='app']/div[2]/div[1]/div[1]/aside[1]/div[2]/div[5]/div[2]/fieldset[1]/div[1]/a[1]/label[1]/span[1]/span[1]
    @FindBy(xpath = "//body/div[@id='holder']/div[@id='container']/main[@id='app']/div[2]/div[1]/div[1]/aside[1]/div[2]/div[5]/div[2]/fieldset[1]/div[1]/a[1]/label[1]/span[1]/span[1]")
    WebElement _APlUSPlUS_BeKo_CheCKBox;

    @FindBy(xpath = "//body/div[@id='holder']/div[@id='container']/main[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/a[3]")
   // @FindBy(className = "mr-2 text-cta-action")
    WebElement _APlusPlus_BEko_VeriFy_Text;
    @FindBy(xpath = "//body/div[@id='holder']/div[@id='container']/main[@id='app']/div[2]/div[1]/div[1]/aside[1]/div[2]/div[3]/div[2]/fieldset[1]/div[1]/a[1]/label[1]/span[1]")
    WebElement _LaRgE_BeKO_CheckBox;
    @FindBy(xpath = "//a[contains(text(),'10 Kg, 10.5 Kg, 11 Kg, 12 Kg, 15 Kg')]")
    WebElement _Load_LarGe_VeriFyiNg_Text;


    //------Methods To manipulate Functionality

    //This method Will Click on brand BeKo
    public void ClickOnBeKoBrand() {
        clickOnElement(_sHOPNowTag);
        clickOnElement(_Brand_name_BeKo);
    }

    //This method Will verify customer is on brand BeKO page
    public String bran_BeKo_success_tEXt() {
        return getTextFromElement(_BeKo_VeryFYinG_TeXt);
    }

    //This Method Will CLick Silver_BeKo_Washing_Machine
    public void Silver_BeKo_WashingMachine() {
        clickOnElement(_Silver_BeKo_CheckBox);
    }

    //This Method Will Click A++_BeKo_Washing_Machine
    public void AplUSPlUs_BekO_WashingMachine() {
      waitUntilElementToBeClickable(_APlUSPlUS_BeKo_CheCKBox,20);
        clickOnElement(_APlUSPlUS_BeKo_CheCKBox);
    }

    //This Method Will Verify A++ Energy Rating BeKO WashingMachine
    public String a_Plus_pLus_BeKo_SucCeSS_Text() {
        return getTextFromElement(_APlusPlus_BEko_VeriFy_Text);
    }

    //This Method will click on Large wash Load BeKo Washing Machine
    public void LarGe_Wash_Load_BeKo_Washing_machine() {
        waitUntilElementToBeClickable(_LaRgE_BeKO_CheckBox,25);
        clickOnElement(_LaRgE_BeKO_CheckBox);
    }

    //This Method Will Verify Large Load Washing Machine
    public String Large_Load_BeKo_SucCeSS_Text() {
        waitUntilElementToBeClickable(_Load_LarGe_VeriFyiNg_Text,20);
        return getTextFromElement(_Load_LarGe_VeriFyiNg_Text);
    }


}
