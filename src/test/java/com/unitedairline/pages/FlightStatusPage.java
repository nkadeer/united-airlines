package com.unitedairline.pages;

import com.unitedairline.base.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FlightStatusPage {
    @FindBy(xpath = "//*[@id=\"statusTab\"]/h2/span")
    private WebElement flightStatus_link_element;

    @FindBy(css = "#flightStatusOriginInput")
    private WebElement flightStatusOriginInput_field;

    @FindBy(xpath = "//*[@id=\"flightStatusOriginInput-menu-item-0\"]/button/div")
    private WebElement flightStatusOriginInput_menu_item;

    @FindBy(css = "#flightStatusDestinationInput")
    private WebElement flightStatusDestinationInput_field;

    @FindBy(css = "#flightStatusDestinationInput")
    private WebElement flightStatusDestinationInput_menu_item;

    @FindBy(css = "button[aria-label=\"Search\"]")
    private WebElement search_button;

    @FindBy(css = "div[class=\"app-components-flifo-ResultsTable-resultsTable__data--cGMzx\"]>div")
    private List<WebElement> flightStatus_list_elements;

    @FindBy(css = "input[placeholder=\"Flight no")
    private WebElement flight_number_field;






    public FlightStatusPage(){PageFactory.initElements(Hooks.driver,this);}

    public WebElement getFlightStatus_link_element() {return flightStatus_link_element;}

    public WebElement getFlightStatusOriginInput_field() {return flightStatusOriginInput_field;}

    public WebElement getFlightStatusOriginInput_menu_item() {return flightStatusOriginInput_menu_item;}

    public WebElement getFlightStatusDestinationInput_field() {return flightStatusDestinationInput_field;}

    public WebElement getFlightStatusDestinationInput_menu_item() {return flightStatusDestinationInput_menu_item;}

    public WebElement getSearch_button() {return search_button;}

    public List<WebElement> getFlightStatus_list_elements() {return flightStatus_list_elements;}

    public WebElement getFlight_number_field() {return flight_number_field;}
}
