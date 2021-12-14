package com.unitedairline.pages;

import com.unitedairline.base.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HotelPage {
    @FindBy(css = "li[aria-controls='bookHotelTab-panel']")
    private WebElement hotel_link;

    //hotel input page which is displayed all input
    @FindBy(css = "#bookHotelTab-panel input")
    private List<WebElement> input_field_list;

    @FindBy(css = "div[aria-label=\"1 room\"]")
    private WebElement room_field_element;

    @FindBy(css = "input[name='bookHotelModel.passengers']")
    private WebElement traveller_number_field;

    @FindBy(css = "button[aria-label=\"Substract one Adult\"]")
    private WebElement add_button;

    @FindBy(css = "button[aria-label=\"Substract one Child\"]")
    private  WebElement child_add_button;


    public HotelPage() {PageFactory.initElements(Hooks.driver, this);}

    public WebElement getHotel_link() {return hotel_link;}

    public List<WebElement> getInput_field_list() {return input_field_list;}

    public WebElement getRoom_field_element() {return room_field_element;}

    public WebElement getTraveller_number_field() {return traveller_number_field;}

    public WebElement getAdd_button() {return add_button;}

    public WebElement getChild_add_button() {return child_add_button;}

}
