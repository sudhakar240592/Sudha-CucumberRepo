package com.adactinStepDef;

import com.FunctionalLibraries.Base;
import com.util.JvmReport;
import com.util.SingletonManager;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdactinSteps extends Base {
	public static Map<String, String> mp = new HashMap<String, String>();
	SingletonManager sm = new SingletonManager();

	@Given("^user navigate to the app$")
	public void user_navigate_to_the_app() throws Throwable {
		launchUrl("http://adactinhotelapp.com/index.php");
		implicit();
	}

	@When("^submit username and password$")
	public void submit_username_and_password() throws Throwable {
		sendValues(sm.getVl().getUsername(), "sudhakar24");
		sendValues(sm.getVl().getPassword(), "sidhere4");
	}

	@When("^click enter to login$")
	public void click_enter_to_login() throws Throwable {
		click(sm.getVl().getLogin());
	}
	

	@When("^user enter the homepage it verifies$")
	public void user_enter_the_homepage_it_verifies() throws Throwable {

		String ValidLogin = sm.getVl().getLoginname().getAttribute("value");
		explicit(sm.getVl().getLoginname());
		System.out.println(sm.getVl().getLoginname().getAttribute("value"));
		if (ValidLogin.contains("Hello sudhakar24!")) {
			System.out.println("Login Succeed");
		} else {
			System.out.println("Login Failed");
		}
	}

//	Scenario------>2

	@When("^user selects the location$")
	public void user_selects_the_location() throws Throwable {
		explicit(sm.getVr().getLocation());
		selectMultipleOption(sm.getVr().getLocation(), "value", "Sydney");
	}

	@Then("^select Hotels$")
	public void select_Hotels() throws Throwable {
		selectMultipleOption(sm.getVr().getHotel(), "value", "Hotel Creek");
	}

	@Then("^select Room Type$")
	public void select_Room_Type() throws Throwable {
		selectMultipleOption(sm.getVr().getRoomtype(), "value", "Standard");
	}

	@Then("^select no\\.of rooms$")
	public void select_no_of_rooms() throws Throwable {
		selectMultipleOption(sm.getVr().getRooms(), "value", "1");
	}

	@Then("^Enter check-in date today \\+(\\d+) date$")
	public void enter_check_in_date_today_date(int arg1) throws Throwable {

		clearField(sm.getVr().getCheckin());
		sendValues(sm.getVr().getCheckin(), incrementDays(arg1));
	}

	@Then("^Ener check-out date today \\+(\\d+) date$")
	public void ener_check_out_date_today_date(int arg1) throws Throwable {
		clearField(sm.getVr().getCheckout());
		sendValues(sm.getVr().getCheckout(), incrementDays(arg1));
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = sdf.parse(sm.getVr().getCheckin().getAttribute("value"));
		Date d2 = sdf.parse(sm.getVr().getCheckout().getAttribute("value"));
		if (d2.before(d1)) {
			System.out.println("Check-In Date shall be before than Check-Out Date");
		} else {
			System.out.println("Valid date");
		}
	}

	@Then("^select Adults per room$")
	public void select_Adults_per_room() throws Throwable {
		sendValues(sm.getVr().getAdult(), "1 - One");
	}

	@Then("^select children per room$")
	public void select_children_per_room() throws Throwable {
		sendValues(sm.getVr().getChild(), "0 - None");
	}

	@Then("^Enter submit$")
	public void enter_submit() throws Throwable {
		click(sm.getVr().getSubmit());
	}

//Scenario------>3	

	@When("^user selects location as \"([^\"]*)\"$")
	public void user_selects_location_as(String sydney) throws Throwable {
		explicit(sm.getVr().getLocation());
		selectMultipleOption(sm.getVr().getLocation(), "value", sydney);
		mp.put("location", sydney);
	}

	@Then("^select hotel as \"([^\"]*)\"$")
	public void select_hotel_as(String hotel) throws Throwable {
		selectMultipleOption(sm.getVr().getHotel(), "value", hotel);
		mp.put("hotel", hotel);
	}

	@Then("^select room type as \"([^\"]*)\"$")
	public void select_room_type_as(String standard) throws Throwable {
		selectMultipleOption(sm.getVr().getRoomtype(), "value", standard);
	}

	@Then("^select no\\.of rooms as \"([^\"]*)\"$")
	public void select_no_of_rooms_as(String room) throws Throwable {
		selectMultipleOption(sm.getVr().getRooms(), "value", room);
		mp.put("noOfRooms", room);
	}

	@Then("^enter check-in date today's (-\\d+) date$")
	public void enter_check_in_date_today_s_date(int arg1) throws Throwable {
		clearField(sm.getVr().getCheckin());
		sendValues(sm.getVr().getCheckin(), incrementDays(arg1));
	}

	@Then("^enter check-out date today's (-\\d+) date$")
	public void enter_check_out_date_today_s_date(int arg1) throws Throwable {
		clearField(sm.getVr().getCheckout());
		sendValues(sm.getVr().getCheckout(), incrementDays(arg1));
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = sdf.parse(sm.getVr().getCheckin().getAttribute("value"));
		Date d2 = sdf.parse(sm.getVr().getCheckout().getAttribute("value"));
		Date date = new Date();
		String currentDate = sdf.format(date);
		if (d1.before(date)) {
			System.out.println("Check-In Date " + sm.getVr().getCheckin().getAttribute("value")
					+ " shall be before the Current-date " + currentDate);
			System.out.println("Invalid date!!!! Please Check the date");
		} else if (d2.before(d1)) {
			System.out.println("invalid date");
		} else {
			System.out.println("Valid date");
		}

	}

	@Then("^verify the application throws error$")
	public void verify_the_application_throws_error() throws Throwable {
		click(sm.getVr().getSubmit());
	}

//Scenario------>4

	@Then("^enter Today's check-in date$")
	public void enter_Today_s_check_in_date() throws Throwable {
		explicit(sm.getVr().getCheckin());
		clearField(sm.getVr().getCheckin());
		implicit();
		sendValues(sm.getVr().getCheckin(), incrementDays(0));
	}

	@Then("^enter check-out date today \\+(\\d+) date$")
	public void enter_check_out_date_today_date(int arg1) throws Throwable {
		clearField(sm.getVr().getCheckout());
		explicit(sm.getVr().getCheckout());
		sendValues(sm.getVr().getCheckout(), incrementDays(arg1));
	}

	@Then("^select no\\.of adults as \"([^\"]*)\"$")
	public void select_no_of_adults_as(String adult) throws Throwable {
		selectMultipleOption(sm.getVr().getAdult(), "value", adult);
	}

	@Then("^select no\\.of children as \"([^\"]*)\"$")
	public void select_no_of_children_as(String child) throws Throwable {
		selectMultipleOption(sm.getVr().getChild(), "value", child);
	}

	@Then("^enter search button$")
	public void enter_search_button() throws Throwable {
		click(sm.getVr().getSubmit());
	}

	@Then("^Verify that hotel displayed is the same as selected in search Hotel form$")
	public void verify_that_hotel_displayed_is_the_same_as_selected_in_search_Hotel_form() throws Throwable {
		String ReservationLocation = sm.getVs().getHotel().getAttribute("value");
		System.out.println(ReservationLocation);
		implicit();
		mp.get("hotel");
		Collection<String> loca = mp.values();
		if (loca.contains(ReservationLocation)) {
			System.out.println("Location Matched");
		} else {
			System.out.println("Check the location!!!");
		}
	}

//Scenario------>5

	@Then("^pass Today's check-in date$")
	public void pass_Today_s_check_in_date() throws Throwable {
		clearField(sm.getVr().getCheckin());
		sendValues(sm.getVr().getCheckin(), incrementDays(0));
		mp.put("checkin", sm.getVr().getCheckin().getAttribute("value"));

	}

	@Then("^send check-out date today \\+(\\d+) date$")
	public void send_check_out_date_today_date(int arg1) throws Throwable {
		clearField(sm.getVr().getCheckout());
		sendValues(sm.getVr().getCheckout(), incrementDays(arg1));
		mp.put("checkout", sm.getVr().getCheckout().getAttribute("value"));
	}

	@Then("^Verify that Check-in-date and Check-out-date displayed is the same as selected in search Hotel form$")
	public void verify_that_Check_in_date_and_Check_out_date_displayed_is_the_same_as_selected_in_search_Hotel_form()
			throws Throwable {
		implicit();
		System.out.println("Given Date");
		String chkin = mp.get("checkin");
		System.out.println(chkin);
		String chkout = mp.get("checkout");
		System.out.println(chkout);
		System.out.println("Date selected in reservation page");
		if (chkin.equals(sm.getVs().getArrival().getAttribute("value"))) {
			if (chkout.equals(sm.getVs().getDepart().getAttribute("value"))) {
				System.out.println("Both Dates are Matched");
			} else {
				System.out.println("checkin date mismatched");
			}
		} else {
			System.out.println("check-in and check-out should be same as seleced");
		}
	}

// scenario-->6

	@Then("^verify that total- price\\(excl\\.GST\\) is being calculated as \\(price-per-night \\* no- of-rooms \\* no-of-days\\)$")
	public void verify_that_total_price_excl_GST_is_being_calculated_as_price_per_night_no_of_rooms_no_of_days()
			throws Throwable {
		String room = mp.get("noOfRooms");
		int parroom = Integer.parseInt(room);
		System.out.println(room);
		String price = sm.getVs().getPrice().getAttribute("value");
		System.out.println(price);
		String substring = price.substring(6);
		int subprice = Integer.parseInt(substring);
		System.out.println(subprice);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = sdf.parse(sm.getVs().getArrival().getAttribute("value"));
		Date d2 = sdf.parse(sm.getVs().getDepart().getAttribute("value"));
		long diff_in_time = d2.getTime() - d1.getTime();
		long days = TimeUnit.MILLISECONDS.toDays(diff_in_time);
		int day = (int) days;
		String diffindays = String.valueOf(day);
		System.out.println(diffindays);
		String totalPrice = sm.getVs().getTotalprice().getAttribute("value");
		System.out.println(totalPrice);
		String totpric = totalPrice.substring(6);
		System.out.println(totpric);
		int formula = day * subprice * parroom;
		String form = String.valueOf(formula);
		System.out.println(formula);
		if (form == totpric) {
			System.out.println("The total amount is" + totalPrice + "and it's Matched");
		} else {
			System.out.println("Check the Values");
		}
	}
}
