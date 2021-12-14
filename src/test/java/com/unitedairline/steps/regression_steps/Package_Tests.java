package com.unitedairline.steps.regression_steps;

import com.unitedairline.pages.PackagePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.ArrayList;

import static com.unitedairline.base.Hooks.driver;

public class Package_Tests {
    @Given("click on the packages link")
    public void click_on_the_packages_link() throws InterruptedException {
        PackagePage packagePage = new PackagePage();
        packagePage.getPackageTab_element().click();
        Thread.sleep(1000);
    }
    @Given("filling up the vacation form")
    public void filling_up_the_vacation_form() throws InterruptedException {
        PackagePage packagePage = new PackagePage();
        packagePage.getVacation_origin_input().click();
        packagePage.getVacation_origin_input().sendKeys("Cincinnati");
        Thread.sleep(1000);
        packagePage.getOrigin_menu_item_element().click();

        packagePage.getVacation_destination_input().click();
        packagePage.getVacation_destination_input().sendKeys("fairfax");
        Thread.sleep(1000);
        packagePage.getDestination_menu_item_element().click();
        Thread.sleep(1000);

        packagePage.getDeparture_field_element().click();
        packagePage.getDeparture_date_element().click();
        Thread.sleep(1000);
        packagePage.getReturn_field_element().click();
        packagePage.getReturn_date_element().click();
        Thread.sleep(1000);

        packagePage.getTraveller_number_element().click();
        Thread.sleep(1000);
        packagePage.getRoom_number_element().click();
        Thread.sleep(1000);
        packagePage.getFindTrip_button_element().click();
        Thread.sleep(5000);


    }
    @Given("verify with search result")
    public void verify_with_search_result() {
        ArrayList<String> strings = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(strings.get(1));
        PackagePage packagePage = new PackagePage();
        int size = packagePage.getSearchResults_list().size();
        System.out.println(size);
        Assert.assertTrue(size>0);
    }

    @And("increase room number to {int}")
    public void increaseRoomNumberTo(int arg0) throws InterruptedException {
        PackagePage packagePage = new PackagePage();
        packagePage.getRoom_number_element().click();

        packagePage.getRooms_list().get(3).click();
        Thread.sleep(1000);
    }
    @Then("Rooms container should say “rooms” if room count is bigger than one")
    public void roomsContainerShouldSayRoomsIfRoomCountIsBiggerThanOne() {
        PackagePage packagePage = new PackagePage();
        String text = packagePage.getVacationRoom_number_element().getText();
        Assert.assertTrue(text.contains("rooms"));
    }


}
