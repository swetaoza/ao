package com.ao.pages;

import com.ao.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    //---This Class contains AO Homepage required WebElements which are located Using different methods
    //---Page Object Design Pattern .


    //----****---Locators----***//
    @FindBy(xpath = "//input[@id='siteSearch-input']")
    WebElement _sEarchProductField;
    @FindBy(xpath = "//header/div[@id='header-service-container']/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]/span[1]")
    WebElement _sEaRCHButton;
    @FindBy(xpath = "//h1[contains(text(),'Washing Machines')]")
    WebElement _paGeNavIgAtVeRiFyINGText;


    //--**------Methods------**---//

    //--This Method will search product from search bar
    public void eNtErProDuctName(String pName) {
        sendTextToElement(_sEarchProductField, pName);
        clickOnElement(_sEaRCHButton);
    }

    //--This Method Will verify text
    public String WashingMachinePageNaviGAtIonSuCcEssFUlLY() {
        return getTextFromElement(_paGeNavIgAtVeRiFyINGText);
    }

}
