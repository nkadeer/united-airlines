package com.unitedairline.steps.regression_steps;

import com.unitedairline.pages.FlightPage;
import com.unitedairline.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

import static com.unitedairline.base.Hooks.driver;

public class Flight_Tests {
    @Given("fill return data field")
    public void fill_return_data_field() throws InterruptedException {
        FlightPage flightPage = new FlightPage();
        flightPage.getOne_way_radio_button().click();
        flightPage.getFlight_date_field().click();
        Thread.sleep(1000);
        flightPage.getFlight_return_date();
        Thread.sleep(1000);
    }

    @Given("click on the round way radio button")
    public void click_on_the_round_way_radio_button() throws InterruptedException {
        FlightPage flightPage = new FlightPage();
        flightPage.getRound_trip_radio_button().click();
        flightPage.getFlight_origin_input().click();
        Thread.sleep(500);
        flightPage.getFlight_origin_input().clear();
    }

    @Given("fill departing and return data field")
    public void fill_departing_and_return_data_field() throws InterruptedException {
        FlightPage flightPage = new FlightPage();
        flightPage.getFlight_origin_input().sendKeys("IAD");
        Thread.sleep(500);
        flightPage.getText_area().click();
        flightPage.getDestination_input().click();
        Thread.sleep(500);
        flightPage.getDestination_input().sendKeys("CVG");
        Thread.sleep(500);
        flightPage.getDestination_textarea().click();
        Thread.sleep(500);
    }

    @Given("click on the traveller field")
    public void click_on_the_traveller_field() throws InterruptedException {
        FlightPage flightPage = new FlightPage();
        flightPage.getPassenger_field().click();
        Thread.sleep(3000);
    }

    @Given("on the dropdown option add new traveller")
    public void on_the_dropdown_option_add_new_traveller() throws InterruptedException {
        FlightPage flightPage = new FlightPage();

        for (int i = 0; i < 10; i++) {
            flightPage.getAdd_passenger_button().click();
        }
        String text = flightPage.getPassenger_field().getText();
        System.out.println(text);
        Assert.assertTrue(text.contains("9"));
    }

    @Given("on the dropdown option subtract traveller number")
    public void on_the_dropdown_option_subtract_traveller_number() throws InterruptedException {
        FlightPage flightPage = new FlightPage();
        flightPage.getPassenger_field().click();
        Thread.sleep(3000);
        for (int i = 10; i < 1; i--) {
            flightPage.getSubstract_passenger_button().click();
        }
        String text = flightPage.getPassenger_field().getText();
        System.out.println(text);
        Assert.assertTrue(text.contains("1"));
    }

    @Given("on the dropdown option you can choose children traveller age")
    public void on_the_dropdown_option_you_can_choose_children_traveller_age() throws InterruptedException {
        FlightPage flightPage = new FlightPage();
        flightPage.getPassenger_field().click();
        Thread.sleep(3000);
        String text = flightPage.getChildren_passenger_element().getText();
        Assert.assertTrue(text.contains("Children (15 - 17)"));
    }

    @Given("click the right arrow and left arrow")
    public void click_the_right_arrow_and_left_arrow() throws InterruptedException {
        FlightPage flightPage = new FlightPage();
        flightPage.getSwitch_arrow_element().click();
        Thread.sleep(1000);

    }

    @Given("verify the depart and destination is switched")
    public void verify_the_depart_and_destination_is_switched() throws InterruptedException {
        FlightPage flightPage = new FlightPage();
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

        flightPage.getSwitch_arrow_element().click();

        String value = flightPage.getFlight_origin_input().getAttribute("value");
        Assert.assertTrue(value.contains("IAD"));
        System.out.println(value);

        String value1 = flightPage.getDestination_input().getAttribute("value");
        Assert.assertTrue(value1.contains("CVG"));
        System.out.println(value);

    }

    @Given("verify the depart and destination with attribute")
    public void verify_the_depart_and_destination_with_attribute() {
        FlightPage flightPage = new FlightPage();
        String placeholder = flightPage.getPalceholder_from_element().getAttribute("placeholder");
        String placeholder1 = flightPage.getPlaceholder_to_element().getAttribute("placeholder");
        Assert.assertTrue(placeholder.contains("From"));
        Assert.assertTrue(placeholder1.contains("To"));
    }
    @Given("click the circle remove button")
    public void click_the_circle_remove_button() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.getFlight_button().click();
        homePage.getFlight_origin_input().click();
        Thread.sleep(500);
        homePage.getFlight_origin_input().clear();
        homePage.getFlight_origin_input().sendKeys("IAD");
        Thread.sleep(500);
    }
    @Given("verify the depart and destination value removed")
    public void verify_the_depart_and_destination_value_removed() {
        HomePage homePage = new HomePage();
        String value = homePage.getFlight_origin_input().getAttribute("value");
        Assert.assertTrue(value.isEmpty());

    }
    @Given("click the dropdown arrow")
    public void click_the_dropdown_arrow() throws InterruptedException {
        FlightPage flightPage = new FlightPage();
        flightPage.getCabin_search_element().click();
        Thread.sleep(3000);
    }
    @Given("choose class option")
    public void choose_class_option() throws InterruptedException {
        FlightPage flightPage = new FlightPage();
        List<WebElement> class__elements = flightPage.getClass__elements();
        for(WebElement list :class__elements){
            if(list.getAttribute("aria-label").equals("Premium economy")){
                list.click();
                Thread.sleep(2000);
                break;
            }
        }
    }
    @Then("verify the changed successfully")
    public void verify_the_changed_successfully() throws InterruptedException {
        FlightPage flightPage = new FlightPage();
        Thread.sleep(2000);
        String text = flightPage.getCabin_search_element().getText();
        Assert.assertTrue(text.contains("Premium"));
    }
    @Given("click the traveller field")
    public void click_the_traveller_field() throws InterruptedException {
        FlightPage flightPage = new FlightPage();
        flightPage.getPassenger_field().click();
        Thread.sleep(3000);
        for (int i = 10; i < 1; i--) {
            flightPage.getSubstract_passenger_button().click();
        }
    }
    @Then("verify the traveller number successfully")
    public void verify_the_traveller_number_successfully() {
        FlightPage flightPage = new FlightPage();
        String text = flightPage.getPassenger_field().getText();
        System.out.println(text);
        Assert.assertTrue(text.contains("1"));
    }
    @Given("hover over to travel with pet option then click")
    public void hover_over_to_travel_with_pet_option_then_click() throws InterruptedException {
        FlightPage flightPage = new FlightPage();
        flightPage.getAdd_pet_element().click();
        Thread.sleep(1000);

    }
    @Then("verify the pet is added successfully")
    public void verify_the_pet_is_added_successfully() throws InterruptedException {
        FlightPage flightPage = new FlightPage();
        flightPage.getPet_number_element().click();
        Thread.sleep(3000);
        Select select = new Select(flightPage.getPet_number_element());
        select.selectByVisibleText("1 pet");
        Thread.sleep(3000);
    }
    @Given("click the traveller selector field")
    public void clickTheTravellerSelectorField() throws InterruptedException {
        FlightPage flightPage = new FlightPage();
        flightPage.getPassenger_field().click();
        Thread.sleep(5000);
    }
    @Given("click the advance search link")
    public void click_the_advance_search_link() throws InterruptedException {
        FlightPage flightPage = new FlightPage();
        flightPage.getAdvance_search_element().click();

        Thread.sleep(3000);
    }
    @Then("verify the open with new page successfully")
    public void verify_the_open_with_new_page_successfully() {
        FlightPage flightPage = new FlightPage();
        int size = flightPage.getReservationInputFields_list().size();
        Assert.assertEquals(size,26);
    }
    @Given("click the flexible check box")
    public void click_the_flexible_check_box() throws InterruptedException {
        FlightPage flightPage = new FlightPage();
        flightPage.getFlexible_date_checkBox().click();
        Thread.sleep(2000);
    }
    @Then("verify dates dropdown fields changes successfully")
    public void verify_dates_dropdown_fields_changes_successfully() {
        FlightPage flightPage = new FlightPage();
        int size = flightPage.getMonth_elements().size();
        Assert.assertEquals(size,12);

    }




}
