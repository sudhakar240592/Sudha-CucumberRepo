package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FunctionalLibraries.Base;

public class VerifyReservationPage extends Base {

	@FindBy(name="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement rooms;
	
    @FindBy(xpath="//input[@id='datepick_in' and @class='date_pick']")
    private  WebElement checkin;
    
    @FindBy(id="datepick_out")
    private WebElement  checkout;
    
    @FindBy(id="adult_room")
    private WebElement adult;
    
    @FindBy(id="child_room")
    private WebElement child;

    @FindBy(id="Submit")
    private WebElement submit;
    
	public WebElement getLocation() {
		return location;
	}

	public void setLocation(WebElement location) {
		this.location = location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public void setHotel(WebElement hotel) {
		this.hotel = hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(WebElement roomtype) {
		this.roomtype = roomtype;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public void setRooms(WebElement rooms) {
		this.rooms = rooms;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public void setCheckin(WebElement checkin) {
		this.checkin = checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public void setCheckout(WebElement checkout) {
		this.checkout = checkout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public void setAdult(WebElement adult) {
		this.adult = adult;
	}

	public WebElement getChild() {
		return child;
	}
	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}

	public void setChild(WebElement child) {
		this.child = child;
	}
    
    public VerifyReservationPage() {
PageFactory.initElements(driver, this);
    }

	    
     
    
}
