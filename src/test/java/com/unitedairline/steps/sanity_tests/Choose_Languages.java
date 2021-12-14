package com.unitedairline.steps.sanity_tests;

import com.unitedairline.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class Choose_Languages {
    @Given("click on the language selector button in the header")
    public void clickOnTheLanguageSelectorButtonInTheHeader() throws InterruptedException {

       HomePage homePage = new HomePage();
        homePage.getLanguage_select_btn().click();

    }
    @And("click on the select language dropdown")
    public void clickOnTheSelectLanguageDropdown() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.getLanguage_dropdown_arrow().click();
        Thread.sleep(2000);
    }

    @Then("select the desirable option from dropdown")
    public void selectTheDesirableOptionFromDropdown() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.getEspanol_language_element().click();
        Thread.sleep(2000);
    }

    @Then("click on the change button")
    public void clickOnTheChangeButton() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.getChange_button().click();
        Thread.sleep(2000);
    }

    @And("verify the language is changed successfully")
    public void verifyTheLanguageIsChangedSuccessfully() {
        HomePage homePage = new HomePage();
       String text = homePage.getLanguage_select_btn().getText();
        Assert.assertTrue(text.contains("Español"));
    }
}
