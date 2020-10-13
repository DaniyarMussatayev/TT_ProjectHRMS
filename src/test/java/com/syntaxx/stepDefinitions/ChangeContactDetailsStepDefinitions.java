package com.syntaxx.stepDefinitions;

import java.util.List;
import java.util.Map;

import com.syntaxx.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangeContactDetailsStepDefinitions extends CommonMethods {

	@Then("navigate to PIM page")
	public void navigate_to_PIM_page() {
		jsClick(dash.pimLinkBtn);
	}

	@Then("navigate to employee list page")
	public void navigate_to_employee_list_page() {
		click(dash.empList);
	}
	

	@When("enter employee Id field {string}")
	public void enter_employee_Id_field(String id) throws InterruptedException {
		
		sendText(addContactDetails.searchById, id);
	}

	@Then("click on search Button")
	public void click_on_search_Button() {
		click(addContactDetails.searchButton);
	}

	@Then("click on employee who was founded")
	public void click_on_employee_who_was_founded() {
		waitForVisib(addContactDetails.employeeOnTable);
		click(addContactDetails.employeeOnTable);
	}
	
	@Then("click on Contact Details")
	public void click_on_Contact_Details() {
		waitForClickability(addContactDetails.contactDetailsBtn);
		click(addContactDetails.contactDetailsBtn);
	}

	@Then("click on edit Button")
	public void click_on_edit_Button() {
		click(addContactDetails.contactAddBtn);
	}

	@Then("add miltiple contact details and verify the added successfully")
	public void add_miltiple_contact_details_and_verify_the_added_successfully(DataTable empContDet) {
		List<Map<String, String>> detailsList = empContDet.asMaps();
		
		for (Map<String, String> details : detailsList) {
			String address = details.get("Address Street");
			String city = details.get("City");
			String state = details.get("State/Province");
			String zip = details.get("Zip/Postal");
			String country = details.get("Country");
			String telephone = details.get("Home Telephone");
			String email= details.get("Work Email");
			String otherEmail=details.get("Other Email");
			
			sendText(addContactDetails.contactStreet, address);
			sendText(addContactDetails.contactCity, city);
			sendText(addContactDetails.contactProvince, state);
			sendText(addContactDetails.contactZip, zip);
			selectDDValue(addContactDetails.contactCountry, country);
			sendText(addContactDetails.contactTel, telephone);
			sendText(addContactDetails.contactWorkEmail, email);
			sendText(addContactDetails.contactOtherEmail, otherEmail);
			
			click(addContactDetails.contactAddBtn);

		}
	}

}
