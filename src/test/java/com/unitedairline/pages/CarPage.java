package com.unitedairline.pages;

import com.unitedairline.base.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarPage {
    @FindBy(id = "bookCarTab")
    private WebElement car_tab_element;

    @FindBy(id = "bookCarForm")
    private WebElement car_tab_input_field;

    @FindBy(xpath = "//*[@id=\"bookCarForm\"]/div[1]/div[2]/label")
    private WebElement return_car_checkBox_element;

    @FindBy(xpath = "//*[@id=\"bookCarForm\"]/div[2]/div[3]/label")
    private WebElement primary_driver_checkBox_element;

    @FindBy(css = "#bookCarPickupInput")
    private WebElement pickup_location_element;

    @FindBy(xpath = "(//tbody/tr/td[text()='24'])[2]")
    private WebElement pickup_date_element;

    @FindBy(css = "input[name=\"bookCarPickupDate\"]")
    private WebElement pickupDate_inputField;

    @FindBy(css = "input[name=\"bookCarDropoffDate\"]")
    private WebElement dropOffDate_inputField;

    @FindBy(css = "#bookCarPickupInput-menu-item-0")
    private WebElement fairfax_location_element;

    @FindBy(xpath = "(//tbody/tr/td[text()='20'])[3]")
    private WebElement return_date_element;

    @FindBy(css = "button[aria-label='Find cars button.']")
    private  WebElement find_car_button;

    @FindBy(xpath = "/html/body/article/div/section/div/div/div")
    private WebElement new_open_tab_element;

    @FindBy(xpath = "//*[@id=\"bookCarForm\"]/div[5]/label")
    private WebElement bookWithMiles_checkBox;

    @FindBy(css = "div[data-auto-id=\"loyaltyEarnChip\"]")
    private WebElement miles_only_element;

    @FindBy(css = "input[aria-label='Age']")
    private  WebElement driverAge_field_element;

    @FindBy(xpath = "//*[@id=\"ct-availability-list-no-result\"]/div/div[1]/h3/span")
    private  WebElement verification_element;

    @FindBy(xpath = "//*[@id=\"ct-availability-list-no-result\"]/div/div[2]/div[1]/p")
    private  WebElement ageRestrict_element;


    public CarPage() {PageFactory.initElements(Hooks.driver, this);}

    public WebElement getCar_tab_element() {return car_tab_element;}

    public WebElement getCar_tab_input_field() {return car_tab_input_field;}

    public WebElement getReturn_car_checkBox_element() {return return_car_checkBox_element;}

    public WebElement getPrimary_driver_checkBox_element() {return primary_driver_checkBox_element;}

    public WebElement getPickup_location_element() {return pickup_location_element;}

    public WebElement getPickup_date_element() {return pickup_date_element;}

    public WebElement getReturn_date_element() {return return_date_element;}

    public WebElement getFind_car_button() {return find_car_button;}

    public WebElement getNew_open_tab_element() {return new_open_tab_element;}

    public WebElement getFairfax_location_element() {return fairfax_location_element;}

    public WebElement getPickupDate_inputField() {return pickupDate_inputField;}

    public WebElement getDropOffDate_inputField() {return dropOffDate_inputField;}

    public WebElement getBookWithMiles_checkBox() {return bookWithMiles_checkBox;}

    public WebElement getMiles_only_element() {return miles_only_element;}

    public WebElement getDriverAge_field_element() {return driverAge_field_element;}

    public WebElement getVerification_element() {return verification_element;}

    public WebElement getAgeRestrict_element() {return ageRestrict_element;}
}
