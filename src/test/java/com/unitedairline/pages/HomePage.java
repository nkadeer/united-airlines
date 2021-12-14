package com.unitedairline.pages;

import com.unitedairline.base.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[5]/main/section/div/div/div[1]/div/div/div[2]/ul/li")
    private List<WebElement> tabs;

    @FindBy(css = "#bookFlightTab")
    private WebElement flight_button;

    @FindBy(css = "#bookFlightOriginInput")
    private WebElement flight_origin_input;

    @FindBy(xpath = "//span[contains(text(),'Washington, DC')]")
    private WebElement text_area;

    @FindBy(css = "#bookFlightDestinationInput")
    private WebElement destination_input;

    @FindBy(xpath = "//span[contains(text(),'Cincinnati')]")
    private WebElement destination_textarea;

    @FindBy(xpath = "//span[text()='Find flights']")
    private WebElement find_flights_button;

    @FindBy(xpath = "//*[@id=\"flightResults-content\"]/div[2]")
    private List<WebElement> flights_result_lists;

    @FindBy(xpath = "//*[@id=\"bookFlightForm\"]/div[1]/fieldset/div/label[2]/span[2]")
    private WebElement one_way_radio_button;

    @FindBy(css = "[aria-label=\"Saturday, January 15, 2022. Prices from $104\"]")
    private WebElement flight_date_field;

    @FindBy(css = "button[aria-label=\"Add one more Adult\"]")
    private WebElement travelers_field;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[5]/header/div/div/div[1]/div/div/div/div[2]/nav/ul/li[1]/div/div/button")
    private WebElement language_select_btn;

    @FindBy(css = "button[name='localization-language-selector']")
    private WebElement language_dropdown_arrow;

    @FindBy(css = "div>ul>li[id=\"localization-language-selector_item-2\"]")
    private WebElement espanol_language_element;

    @FindBy(xpath = "//button[text()='Cambiar']")
    private WebElement change_button;

    @FindBy(css = "#bookFlightTab-panel")
    private WebElement book_tab_fields;

    @FindBy(xpath = "//*[@id=\"statusTab\"]/h2/span")
    private WebElement flight_status_button;

    @FindBy(css = "#flightStatusModel")
    private WebElement  flight_status_modal;

    @FindBy(xpath = "//*[@id=\"checkInTab\"]/h2/div")
    private WebElement check_in_button;

    @FindBy(css = "#checkInTab-panel")
    private WebElement check_in_panel;

    @FindBy(xpath = "//*[@id=\"tripsTab\"]/h2/div/div/div/div[1]/div/div")
    private WebElement my_trip_button;

    @FindBy(xpath = "//*[@id=\"tripsTab-panel\"]/div/div")
    private WebElement trip_panel;

    @FindBy(css = "footer a")
    private List<WebElement> footer_links;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[5]/header/div/div/div[1]/div/div/div/div[2]/nav/div/div[1]/div/div[1]/div/a")
    private List<WebElement> header_links;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div/div/div[1]/div[2]/div[2]/span/a[1]")
    private WebElement top_link_element;


    public HomePage() {
        PageFactory.initElements(Hooks.driver, this);
    }

    public List<WebElement> getTabs() {
        return tabs;
    }

    public WebElement getFlight_button() {
        return flight_button;
    }

    public WebElement getFlight_origin_input() {
        return flight_origin_input;
    }

    public WebElement getText_area() {
        return text_area;
    }

    public WebElement getDestination_input() {
        return destination_input;
    }

    public WebElement getDestination_textarea() {
        return destination_textarea;
    }

    public WebElement getFind_flights_button() {
        return find_flights_button;
    }

    public List<WebElement> getFlights_result_lists() {
        return flights_result_lists;
    }

    public WebElement getOne_way_radio_button() {
        return one_way_radio_button;
    }

    public WebElement getFlight_date_field() {
        return flight_date_field;
    }

    public WebElement getTravelers_field() {
        return travelers_field;
    }

    public WebElement getLanguage_select_btn() {
        return language_select_btn;
    }

    public WebElement getLanguage_dropdown_arrow() {
        return language_dropdown_arrow;
    }

    public WebElement getChange_button() {
        return change_button;
    }

    public WebElement getEspanol_language_element() {return espanol_language_element;}

    public WebElement getBook_tab_fields() {return book_tab_fields;}

    public WebElement getFlight_status_button() {return flight_status_button;}

    public WebElement getFlight_status_modal() {return flight_status_modal;}

    public WebElement getCheck_in_button() {return check_in_button;}

    public WebElement getCheck_in_panel() {return check_in_panel;}

    public WebElement getMy_trip_button() {return my_trip_button;}

    public WebElement getTrip_panel() {return trip_panel;}

    public List<WebElement> getFooter_links() {return footer_links;}

    public List<WebElement> getHeader_links() {return header_links;}

    public WebElement getTop_link_element() {return top_link_element;}


}