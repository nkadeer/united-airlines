package com.unitedairline.steps.regression_steps;

import com.unitedairline.pages.FlightStatusPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class FlightStatus_Tests {
    @Given("click on the flight status link")
    public void click_on_the_flight_status_link() throws InterruptedException {
        FlightStatusPage flightStatusPage = new FlightStatusPage();
        flightStatusPage.getFlightStatus_link_element().click();
        Thread.sleep(1000);

    }
    @Given("check between from and to destinations")
    public void check_between_from_and_to_destinations() throws InterruptedException {
        FlightStatusPage flightStatusPage = new FlightStatusPage();
        flightStatusPage.getFlightStatusDestinationInput_field().click();
        Thread.sleep(1000);
        flightStatusPage.getFlightStatusDestinationInput_menu_item().sendKeys("CVG");
        Thread.sleep(2000);
        flightStatusPage.getFlightStatusDestinationInput_menu_item().click();
        Thread.sleep(1000);
    }
    @Then("click on the search button")
    public void clickOnTheSearchButton() throws InterruptedException {
        FlightStatusPage flightStatusPage = new FlightStatusPage();
        flightStatusPage.getSearch_button().click();
        Thread.sleep(3000);
    }

    @And("verify user able to see flight status")
    public void verifyUserAbleToSeeFlightStatus() {
        FlightStatusPage flightStatusPage = new FlightStatusPage();
        int size = flightStatusPage.getFlightStatus_list_elements().size();
        System.out.println(size);
        Assert.assertTrue(size>0);
    }

    @And("click on the flight number field")
    public void clickOnTheFlightNumberField() {
        FlightStatusPage flightStatusPage = new FlightStatusPage();
        flightStatusPage.getFlight_number_field().click();
        flightStatusPage.getFlight_number_field().sendKeys("1212");
    }

    @Then("verify only accept number")
    public void verifyOnlyAcceptNumber() {
        FlightStatusPage flightStatusPage = new FlightStatusPage();
    }

    @And("enter invalid number")
    public void enterInvalidNumber() {
        FlightStatusPage flightStatusPage = new FlightStatusPage();
    }

    @Then("verify with error massage")
    public void verifyWithErrorMassage() {
        FlightStatusPage flightStatusPage = new FlightStatusPage();
    }
}
