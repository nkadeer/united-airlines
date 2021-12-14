package com.unitedairline.steps.sanity_tests;

import com.unitedairline.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage_Steps {
    @Given("user is on home page")
    public void userIsOnHomePage() {
        HomePage homePage = new HomePage();
        int size = homePage.getTabs().size();
        Assert.assertEquals(size, 4);
    }

    @And("Book tab should have all necessary fields")
    public void bookTabShouldHaveAllNecessaryFields() {
        HomePage homePage = new HomePage();
        homePage.getBook_tab_fields().isDisplayed();
    }

    @And("Flight status tab should have necessary fields")
    public void flightStatusTabShouldHaveNecessaryFields() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.getFlight_status_button().click();
        Thread.sleep(1000);
        homePage.getFlight_status_modal().isDisplayed();
    }

    @And("Check-in tab should have necessary fields")
    public void checkInTabShouldHaveNecessaryFields() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.getCheck_in_button().click();
        Thread.sleep(1000);
        homePage.getCheck_in_panel().isDisplayed();
    }

    @And("My trips tab should have necessary fields")
    public void myTripsTabShouldHaveNecessaryFields() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.getMy_trip_button().click();
        Thread.sleep(2000);
        homePage.getTrip_panel().isDisplayed();
    }

    @Then("find all links and verify each link has href attribute")
    public void findAllLinksAndVerifyEachLinkHasHrefAttribute() {
        HomePage homePage = new HomePage();
        for (WebElement link : homePage.getFooter_links()) {
            Assert.assertFalse(link.getAttribute("href").isEmpty());
        }
    }

    @Then("verify that the each tab has area-selected attribute true")
    public void verifyThatTheEachTabHasAreaSelectedAttributeTrue() throws InterruptedException {
        HomePage homePage = new HomePage();
        for(WebElement link : homePage.getHeader_links()){
           link.click();
           Thread.sleep(1000);
           Assert.assertEquals(link.getAttribute("aria-selected"), "true");
        }

    }

    @Then("verify that the info display has link")
    public void verifyThatTheInfoDisplayHasLink() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.getTop_link_element().isDisplayed();
        Thread.sleep(1000);



    }


}
