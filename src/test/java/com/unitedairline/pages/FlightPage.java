package com.unitedairline.pages;

import com.unitedairline.base.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FlightPage {
    @FindBy(xpath = "//*[@id=\"bookFlightForm\"]/div[1]/fieldset/div/label[2]/span[2]")
    private WebElement one_way_radio_button;

    @FindBy(css = "#DepartDate")
    private WebElement flight_date_field;

    @FindBy(css = "td[aria-label='Saturday, January 15, 2022. Prices from $104']")
    private WebElement flight_return_date;

    @FindBy(xpath = "//*[@id=\"bookFlightForm\"]/div[1]/fieldset/div/label[1]/span[2]")
    private WebElement round_trip_radio_button;

    @FindBy(css = "#bookFlightOriginInput")
    private WebElement flight_origin_input;

    @FindBy(xpath = "//span[contains(text(),'Washington, DC')]")
    private WebElement text_area;

    @FindBy(css = "#bookFlightDestinationInput")
    private WebElement destination_input;

    @FindBy(xpath = "//span[contains(text(),'Cincinnati')]")
    private WebElement destination_textarea;

    @FindBy(xpath = "//*[@id=\"passengerSelector\"]/button")
    private WebElement passenger_field;

    @FindBy(css = "button[aria-label=\"Substract one Adult\"]")
    private WebElement add_passenger_button;

    @FindBy(css = "button[aria-label=\"Add one more Adult\"]")
    private WebElement substract_passenger_button;

    @FindBy(xpath = "//*[@id=\"passengerMenuId\"]/div[1]/div[2]/div[1]/p/span")
    private WebElement children_passenger_element;

    @FindBy(xpath = "//*[@id=\"bookFlightForm\"]/div[2]/div/div[1]/div/div/button/img")
    private WebElement switch_arrow_element;

    @FindBy(css = "#bookFlightOriginInput")
    private WebElement palceholder_from_element;

    @FindBy(css = "#bookFlightDestinationInput")
    private  WebElement placeholder_to_element;

    @FindBy(css = "#cabinType>div")
    private WebElement cabin_search_element;

    @FindBy(css = "ul[aria-labelledby='cabinDescriptor']>li")
    private List<WebElement> class__elements;

    @FindBy(css = "button[aria-label=\"Add one more Adult\"]")
    private WebElement travelers_field;

    @FindBy(xpath = "//*[@id=\"passengerMenuId\"]/div[2]/button/span")
    private WebElement add_pet_element;

    @FindBy(css = "select[name='bookFlightModel.advancedSearch.petCabin']")
    private WebElement pet_number_element;

    @FindBy(xpath = "//*[@id=\"bookFlightForm\"]/div[5]/div/div[1]/div/div/div[1]/button/span")
    private WebElement advance_search_element;

    @FindBy(css = "div[class='atm-l-section atm-l-sidebar__main'] input")
    private List<WebElement> reservationInputFields_list;

    @FindBy(xpath = "//*[@id=\"flexDatesLabel\"]")
    private WebElement flexible_date_checkBox;

    @FindBy(css = "ul[aria-labelledby=\"bookFlightModel_dates_label\"]>li")
    private List<WebElement> month_elements;



    public FlightPage() {
        PageFactory.initElements(Hooks.driver, this);
    }
    public WebElement getOne_way_radio_button() {return one_way_radio_button;}

    public WebElement getFlight_date_field() {return flight_date_field;}

    public WebElement getFlight_return_date() {return flight_return_date;}

    public WebElement getRound_trip_radio_button() {return round_trip_radio_button;}

    public WebElement getFlight_origin_input() {return flight_origin_input;}

    public WebElement getText_area() {return text_area;}

    public WebElement getDestination_input() {return destination_input;}

    public WebElement getDestination_textarea() {return destination_textarea;}

    public WebElement getPassenger_field() {return passenger_field;}

    public WebElement getAdd_passenger_button() {return add_passenger_button;}

    public WebElement getSubstract_passenger_button() {return substract_passenger_button;}

    public WebElement getChildren_passenger_element() {return children_passenger_element;}

    public WebElement getSwitch_arrow_element() {return switch_arrow_element;}

    public WebElement getPalceholder_from_element() {return palceholder_from_element;}

    public WebElement getPlaceholder_to_element() {return placeholder_to_element;}

    public WebElement getCabin_search_element() {return cabin_search_element;}

    public List<WebElement> getClass__elements() {return class__elements;}

    public WebElement getTravelers_field() {return travelers_field;}

    public WebElement getAdd_pet_element() {return add_pet_element;}

    public WebElement getPet_number_element() {return pet_number_element;}

    public WebElement getAdvance_search_element() {return advance_search_element;}

    public List<WebElement> getReservationInputFields_list() {return reservationInputFields_list;}

    public WebElement getFlexible_date_checkBox() {return flexible_date_checkBox;}

    public List<WebElement> getMonth_elements() {
        return month_elements;
    }
}