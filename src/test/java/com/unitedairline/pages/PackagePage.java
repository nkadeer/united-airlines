package com.unitedairline.pages;

import com.unitedairline.base.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PackagePage {
    @FindBy(xpath = "//*[@id=\"bookPackageTab\"]/h3/span")
    private WebElement packageTab_element;

    @FindBy(css = "#vacationOriginInput")
    private WebElement vacation_origin_input;

    @FindBy(xpath = "//*[@id=\"vacationOriginInput-menu-item-0\"]/button/div/span")
    private WebElement origin_menu_item_element;

    @FindBy(css = "#vacationDestinationInput")
    private WebElement vacation_destination_input;

    @FindBy(xpath = "//*[@id=\"vacationDestinationInput-menu-item-0\"]/button/div/span")
    private WebElement destination_menu_item_element;

    @FindBy(css = "input[placeholder=\"Departure\"]")
    private WebElement departure_field_element;

    @FindBy(xpath = "(//tbody/tr/td[text()='24'])[2]")
    private WebElement departure_date_element;

    @FindBy(css = "#ReturnDate")
    private WebElement return_field_element;

    @FindBy(xpath = "(//tbody/tr/td[text()='3'])[3]")
    private WebElement return_date_element;

    @FindBy(xpath = "//*[@id=\"containerId\"]/button")
    private WebElement traveller_number_element;

    @FindBy(xpath = "//*[@id=\"selectedRooms\"]/div")
    private WebElement room_number_element;

    @FindBy(xpath = "//*[@id=\"bookVacationForm\"]/div[3]/button")
    private WebElement findTrip_button_element;

    @FindBy(css = "div[class=\"HotelsList__BoxSizingContentBox-sc-1epc8tr-2 hqGFES\"]>div>div")
    private List<WebElement> searchResults_list;

    @FindBy(css = "button[aria-label='undefined Selected 4 rooms']>div")
    private WebElement vacationRoom_number_element;

    @FindBy(css = "ul[aria-labelledby=\"roomDescriptor\"]>li")
    private List<WebElement> rooms_list;








    public PackagePage() {PageFactory.initElements(Hooks.driver, this);}

    public WebElement getPackageTab_element() {return packageTab_element;}

    public WebElement getVacation_origin_input() {return vacation_origin_input;}

    public WebElement getInput_menu_item_element() {return origin_menu_item_element;}

    public WebElement getVacation_destination_input() {return vacation_destination_input;}

    public WebElement getOrigin_menu_item_element() {return origin_menu_item_element;}

    public WebElement getDestination_menu_item_element() {return destination_menu_item_element;}

    public WebElement getDeparture_field_element() {return departure_field_element;}

    public WebElement getDeparture_date_element() {return departure_date_element;}

    public WebElement getReturn_field_element() {return return_field_element;}

    public WebElement getReturn_date_element() {return return_date_element;}

    public WebElement getTraveller_number_element() {return traveller_number_element;}

    public WebElement getRoom_number_element() {return room_number_element;}

    public WebElement getFindTrip_button_element() {return findTrip_button_element;}

    public List<WebElement> getSearchResults_list() {return searchResults_list;}

    public WebElement getVacationRoom_number_element() {return vacationRoom_number_element;}

    public List<WebElement> getRooms_list() {
        return rooms_list;
    }
}
