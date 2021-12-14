package com.unitedairline.steps;

import com.unitedairline.pages.HomePage;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.unitedairline.base.Hooks.driver;

public class Smoke_Tests {
    @Given("verify all the tabs on the homepage")
    public void verify_all_the_tabs_on_the_homepage() {
        HomePage homePage = new HomePage();
        int size = homePage.getTabs().size();
        Assert.assertEquals(size, 4);
    }

    @Given("fill out leaving and destination field")
    public void fill_out_leaving_and_destination_field() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.getFlight_button().click();
        homePage.getFlight_origin_input().click();
        Thread.sleep(500);
        homePage.getFlight_origin_input().clear();
        homePage.getFlight_origin_input().sendKeys("IAD");
        Thread.sleep(500);
        homePage.getText_area().click();
        homePage.getDestination_input().click();
        Thread.sleep(500);
        homePage.getDestination_input().sendKeys("CVG");
        Thread.sleep(500);
        homePage.getDestination_textarea().click();
        Thread.sleep(500);
    }

    @Given("click find flights button")
    public void click_find_flights_button() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.getFind_flights_button().click();
        Thread.sleep(5000);
    }

    @Then("verify available flights are displayed")
    public void verify_available_flights_are_displayed() {
        HomePage homePage = new HomePage();
        int size = homePage.getFlights_result_lists().size();
        Assert.assertTrue(size > 0);

    }

    @Given("click on the one way radio button")
    public void click_on_the_one_way_radio_button() {
        HomePage homePage = new HomePage();
        homePage.getOne_way_radio_button().click();
    }

    @Given("select the date")
    public void select_the_date() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.getFlight_date_field().click();
        Thread.sleep(2000);
        homePage.getFlight_date_field().clear();
        Thread.sleep(1000);
        homePage.getFlight_date_field().click();
    }

    @Given("enter departure and return date")
    public void enter_departure_and_return_date() {

    }

    @Given("choose two adults and one infant travelers")
    public void choose_two_adults_and_one_infant_travelers() {

    }
}
