package com.unitedairline.steps.regression_steps;

import com.unitedairline.pages.HotelPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Hotels_Test {
    @Given("click on the hotel link")
    public void clickOnTheHotelLink() throws InterruptedException {
        HotelPage hotelPage = new HotelPage();
        hotelPage.getHotel_link().click();
        Thread.sleep(2000);
    }

    @And("verify all input field displayed")
    public void clickTheGoingCheckInAndCheckOutFieldAndFillTheField() throws InterruptedException {
        HotelPage hotelPage = new HotelPage();
        int size = hotelPage.getInput_field_list().size();
        System.out.println(size);
        Assert.assertEquals(size,5);

    }
    @Then("verify that one traveler and one room is selected")
    public void verifyThatOneTravelerAndOneRoomIsSelected() {
        HotelPage hotelPage = new HotelPage();
        String text = hotelPage.getRoom_field_element().getText();
        System.out.println(text);

        Assert.assertTrue(text.contains("1 room"));
        String value1 = hotelPage.getTraveller_number_field().getAttribute("value");
        System.out.println(value1);
        Assert.assertTrue(value1.contains("1 adult"));
    }

    @Given("click on travelers button")
    public void clickOnTravelersButton() throws InterruptedException {
        HotelPage hotelPage = new HotelPage();
        hotelPage.getTraveller_number_field().click();
        Thread.sleep(3000);

    }

    @And("click on adult plus button eight times")
    public void clickOnAdultPlusButtonEightTimes() {
        HotelPage hotelPage = new HotelPage();
        for (int i = 0; i < 10; i++) {
            hotelPage.getAdd_button().click();
        }
        String text = hotelPage.getTraveller_number_field().getText();
        System.out.println(text);
        Assert.assertTrue(text.contains("8"));
    }

    @Then("click on children plus button eight times")
    public void clickOnChildrenPlusButtonEightTimes() {
        HotelPage hotelPage = new HotelPage();
        for(int i = 0; i < 9; i++){
            hotelPage.getChild_add_button().click();
        }
        String text = hotelPage.getTraveller_number_field().getText();
        System.out.println(text);
        Assert.assertTrue(text.contains("8"));
    }

    @Then("Verify that traveler input field should display sixteen travelers")
    public void verifyThatTravelerInputFieldShouldDisplaySixteenTravelers() {
        HotelPage hotelPage = new HotelPage();
        String text = hotelPage.getTraveller_number_field().getText();
        System.out.println(text);
        Assert.assertTrue(text.contains("16"));


    }
}
