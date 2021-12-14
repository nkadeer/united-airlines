package com.unitedairline.steps.regression_steps;

import com.unitedairline.pages.CarPage;
import com.unitedairline.pages.HotelPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Dimension;
import org.testng.Assert;

import java.util.ArrayList;

import static com.unitedairline.base.Hooks.driver;

public class Car_Tests {
    @Given("click on the car link")
    public void click_on_the_car_link() throws InterruptedException {
        CarPage carPage = new CarPage();
        carPage.getCar_tab_element().click();
        Thread.sleep(1000);

    }
    @And("verify all input info field displayed")
    public void verify_all_input_info_field_displayed() {
        CarPage carPage = new CarPage();
        boolean displayed = carPage.getCar_tab_input_field().isDisplayed();
        Assert.assertTrue(displayed,"True");
    }
    @And("click on the return car check box")
    public void click_on_the_return_car_check_box() throws InterruptedException {
        CarPage carPage = new CarPage();
        carPage.getReturn_car_checkBox_element().click();
        Thread.sleep(1000);
    }
    @Then("verify drop off location disappear")
    public void verify_drop_off_location_disappear() {
        CarPage carPage = new CarPage();
        boolean displayed = carPage.getCar_tab_input_field().isDisplayed();
        Assert.assertTrue(displayed);
    }
    @And("check primary driver is {int} or older")
    public void checkPrimaryDriverIsOrOlder(int arg0) throws InterruptedException {
        CarPage carPage = new CarPage();
        carPage.getPrimary_driver_checkBox_element().click();
        Thread.sleep(1000);
    }
    @Then("verify age field should disappear")
    public void verifyAgeFieldShouldDisappear() {
        CarPage carPage = new CarPage();
        boolean displayed = carPage.getPrimary_driver_checkBox_element().isDisplayed();
        Assert.assertTrue(displayed);
    }
    @And("filling up the form")
    public void fillingUpTheForm() throws InterruptedException {
        CarPage carPage = new CarPage();
        carPage.getPickup_location_element().click();
        Thread.sleep(1000);
        carPage.getPickup_location_element().sendKeys("fairfax");
        Thread.sleep(2000);
        carPage.getFairfax_location_element().click();
        carPage.getPickupDate_inputField().click();
        Thread.sleep(3000);
        carPage.getPickup_date_element().click();
        Thread.sleep(1000);
        carPage.getDropOffDate_inputField().click();
        carPage.getReturn_date_element().click();
        Thread.sleep(1000);

        carPage.getFind_car_button().click();
        Thread.sleep(5000);
    }
    @Then("verify new tab is open")
    public void verifyNewTabIsOpen() {
        ArrayList<String> strings = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(strings.get(1));

        CarPage carPage = new CarPage();
        boolean displayed = carPage.getNew_open_tab_element().isDisplayed();
        Assert.assertTrue(displayed);
    }

    @And("click on book with miles chek box")
    public void clickOnBookWithMilesChekBox() throws InterruptedException {
        CarPage carPage = new CarPage();
        carPage.getPickup_location_element().click();
        Thread.sleep(1000);
        carPage.getPickup_location_element().sendKeys("IAD");
        Thread.sleep(2000);
        carPage.getFairfax_location_element().click();
        carPage.getPickupDate_inputField().click();
        Thread.sleep(3000);
        carPage.getPickup_date_element().click();
        Thread.sleep(1000);
        carPage.getDropOffDate_inputField().click();
        carPage.getReturn_date_element().click();
        Thread.sleep(1000);
        carPage.getBookWithMiles_checkBox().click();
        carPage.getFind_car_button().click();
        Thread.sleep(5000);

    }
    @Then("verify the result with miles only")
    public void verifyTheResultWithMilesOnly() {
        ArrayList<String> strings = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(strings.get(1));

        CarPage carPage = new CarPage();
        for(int i = 0; i < 19; i++){
            carPage.getMiles_only_element().click();
        }
        String text = carPage.getMiles_only_element().getText();
        System.out.println(text);
        Assert.assertTrue(text.contains("Miles "));
    }

    @And("click driver age field and enter age")
    public void clickDriverAgeFieldAndEnterAge() throws InterruptedException {
        CarPage carPage = new CarPage();
        carPage.getPickup_location_element().click();
        Thread.sleep(1000);
        carPage.getPickup_location_element().sendKeys("IAD");
        Thread.sleep(2000);
        carPage.getFairfax_location_element().click();
        carPage.getPickupDate_inputField().click();
        Thread.sleep(3000);
        carPage.getPickup_date_element().click();
        Thread.sleep(1000);
        carPage.getDropOffDate_inputField().click();
        carPage.getReturn_date_element().click();
        Thread.sleep(1000);
        carPage.getPrimary_driver_checkBox_element().click();
        carPage.getDriverAge_field_element().click();
        carPage.getDriverAge_field_element().sendKeys("19");

        carPage.getFind_car_button().click();
        Thread.sleep(5000);

    }

    @Then("verify page with No results matching")
    public void verifyPageWithNoResultsMatching() {
        ArrayList<String> strings = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(strings.get(1));

        CarPage carPage = new CarPage();
        String text = carPage.getVerification_element().getText();
        System.out.println(text);
        Assert.assertTrue(text.contains("criteria"));
    }

    @And("click driver age field and enter age {int}")
    public void clickDriverAgeFieldAndEnterAge(int arg0) throws InterruptedException {
        CarPage carPage = new CarPage();
        carPage.getPickup_location_element().click();
        Thread.sleep(1000);
        carPage.getPickup_location_element().sendKeys("IAD");
        Thread.sleep(2000);
        carPage.getFairfax_location_element().click();
        carPage.getPickupDate_inputField().click();
        Thread.sleep(3000);
        carPage.getPickup_date_element().click();
        Thread.sleep(1000);
        carPage.getDropOffDate_inputField().click();
        carPage.getReturn_date_element().click();
        Thread.sleep(1000);
        carPage.getPrimary_driver_checkBox_element().click();
        carPage.getDriverAge_field_element().click();
        carPage.getDriverAge_field_element().sendKeys("21");

        carPage.getFind_car_button().click();
        Thread.sleep(5000);

    }

    @Then("verify with new search page")
    public void verifyWithNewSearchPage() {
        ArrayList<String> strings = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(strings.get(1));

        CarPage carPage = new CarPage();
        String text = carPage.getVerification_element().getText();
        System.out.println(text);
        Assert.assertTrue(text.contains("criteria"));
    }

    @Then("verify with new tab search page")
    public void verifyWithNewTabSearchPage() throws InterruptedException {
        CarPage carPage = new CarPage();
        carPage.getPickup_location_element().click();
        Thread.sleep(1000);
        carPage.getPickup_location_element().sendKeys("IAD");
        Thread.sleep(2000);
        carPage.getFairfax_location_element().click();
        carPage.getPickupDate_inputField().click();
        Thread.sleep(3000);
        carPage.getPickup_date_element().click();
        Thread.sleep(1000);
        carPage.getDropOffDate_inputField().click();
        carPage.getReturn_date_element().click();
        Thread.sleep(1000);
        carPage.getPrimary_driver_checkBox_element().click();
        carPage.getDriverAge_field_element().click();
        carPage.getDriverAge_field_element().sendKeys("25");

        carPage.getFind_car_button().click();
        Thread.sleep(5000);

        ArrayList<String> strings = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(strings.get(1));

        boolean displayed = carPage.getNew_open_tab_element().isDisplayed();
        Assert.assertTrue(displayed);

    }


}
