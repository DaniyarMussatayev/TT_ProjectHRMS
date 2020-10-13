package com.syntaxx.stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.syntaxx.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DependentsStepDefinitions extends CommonMethods {

	@When("enter an employee as {string}")
	public void enter_an_employee_as(String id) {
		sendText(empList.employeeIdTextBox, id);
	}

	@Then("click on search Buttons")
	public void click_on_search_Buttons() {
		click(empList.employeeSearchButton);
	}

	@Then("click on employee which was founded")
	public void click_on_employee_which_was_founded() {
		click(empList.employeeIdResultTable);
	}

	@Then("click on Dependents")
	public void click_on_Dependents() {
		click(addDependents.DependentsBtn);
	}

	@Then("click on Assigned Dependents Add Button")
	public void click_on_Assigned_Dependents_Add_Button() {
		click(addDependents.addDependents);
	}

	@Then("add miltiple data in fields and verify it")
	public void add_miltiple_data_in_fields_and_verify_it(DataTable empDependents) {
		List<Map<String, String>> dependets = empDependents.asMaps();
		
		for (Map<String, String> dependet : dependets) {
			String name = dependet.get("Name");
			String relationship = dependet.get("Relationship");
			String dateOfBirth = dependet.get("Date of Birth");

			sendText(addDependents.DependentsName, name);
			selectDDValue(addDependents.DependentsRelationship, relationship);
			sendText(addDependents.yearMonthDayOfBirth, dateOfBirth);

			click(addDependents.saveDependents);

			List<WebElement> actualDependents = addDependents.actualDepen;
			for (WebElement actualDependent : actualDependents) {
				String actualName = actualDependent.getText();
				if (actualName.equals("name")) {
					Assert.assertEquals("Verifying depemdents name", name, actualName);
				}
			}
			click(addDependents.addDependents);
		}
	}

}
