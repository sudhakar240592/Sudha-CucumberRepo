package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FunctionalLibraries.Base;

public class VerifySelectPage extends Base{
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement radiobutton;

	@FindBy(xpath="//td//input[@id='location_0']")
	private WebElement selectedlocation;
	
	@FindBy(xpath="//td//input[@id='arr_date_0']")
	private WebElement arrival;
	
	@FindBy(xpath="//td//input[@id='dep_date_0']")
	private WebElement depart;
	
	@FindBy(xpath="//input[@id='total_price_0']")
	private WebElement totalprice;
	
	@FindBy(xpath="//input[@id='hotel_name_0']")
	private WebElement hotel;
	
	@FindBy(xpath="//input[@id='rooms_0']")
	private WebElement rooms;
	
	@FindBy(xpath="//input[@id='no_days_0']")
	private WebElement days;
	
    @FindBy(xpath="//input[@id='price_night_0']")
    private WebElement price;
    
	public WebElement getPrice() {
		return price;
	}

	public void setPrice(WebElement price) {
		this.price = price;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public void setRooms(WebElement rooms) {
		this.rooms = rooms;
	}

	public WebElement getDays() {
		return days;
	}

	public void setDays(WebElement days) {
		this.days = days;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public void setHotel(WebElement hotel) {
		this.hotel = hotel;
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public void setRadiobutton(WebElement radiobutton) {
		this.radiobutton = radiobutton;
	}
	

	public WebElement getSelectedlocation() {
		return selectedlocation;
	}

	public void setSelectedlocation(WebElement selectedlocation) {
		this.selectedlocation = selectedlocation;
	}

	public WebElement getArrival() {
		return arrival;
	}

	public void setArrival(WebElement arrival) {
		this.arrival = arrival;
	}

	public WebElement getDepart() {
		return depart;
	}

	public void setDepart(WebElement depart) {
		this.depart = depart;
	}

	public WebElement getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(WebElement totalprice) {
		this.totalprice = totalprice;
	}
	
	public VerifySelectPage() {
		PageFactory.initElements(driver, this);	
		}


}
