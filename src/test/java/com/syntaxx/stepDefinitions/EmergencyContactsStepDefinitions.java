package com.syntaxx.stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.syntaxx.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmergencyContactsStepDefinitions extends CommonMethods {


	@When("enter employee as {string}")
	public void enter_employee_as(String id) {
		sendText(empList.employeeIdTextBox, id);

	}

	@Then("click on searchs Button")
	public void click_on_search_Button() {
		click(empList.employeeSearchButton);

	}

	@Then("click on employees who was founded")
	public void click_on_employee_who_was_founded() {
		click(empList.employeeIdResultTable);
	}

	@Then("click on Emergency Contacts")
	public void click_on_Emergency_Contacts() {
		click(addEmergency.EmergencyContact);
	}

	@Then("click on Assigned Emergency Contacts Add Button")
	public void click_on_Assigned_Emergency_Contacts_Add_Button() {
		click(addEmergency.addEmeButton);
	}

	@Then("add miltiple all data in fields and verify they added successfully")
	public void add_miltiple_all_data_in_fields_and_verify_they_added_successfully(DataTable empEmergencyContacts) {
		List<Map<String, String>> emergencyList = empEmergencyContacts.asMaps();
		for (Map<String, String> emergency : emergencyList) {
			String name =emergency.get("Name");
			String relationship =emergency.get("Relationship");
			String phone =emergency.get("Mobile");
			
			sendText(addEmergency.EmergncyName, name);
			sendText(addEmergency.EmergencyRelationship, relationship);
			sendText(addEmergency.EmergencyPhone, phone);
			
			click(addEmergency.saveEmeButton);
			
			List<WebElement> actualEmergencyConctacts = addEmergency.actualEmergncyConctact;
			
			for (WebElement actualEmergencyConctact : actualEmergencyConctacts) {
				String actualName = actualEmergencyConctact.getText();
				if(actualName.equals(name)) {
					Assert.assertEquals("Verifying emergency contacts", name, actualName);
				}
				
			}
			
			
			
		
			
		}
	}

}
