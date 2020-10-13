package com.syntaxx.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntaxx.testBase.BaseClass;

public class AddDependentsPageElements extends BaseClass {
	
	@FindBy(linkText = "Dependents")
	public WebElement DependentsBtn;
	
	@FindBy(id = "btnAddDependent")
	public WebElement addDependents;
	
	@FindBy(id = "dependent_name")
	public WebElement DependentsName;
	
	@FindBy(id = "dependent_relationshipType")
	public WebElement DependentsRelationship;
	
//	@FindBy(className = "ui-datepicker-month")
//	public WebElement selectMonth;
//
//	@FindBy(className = "ui-datepicker-year")
//	public WebElement selectYear;
//
//	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr/td")
//	public List<WebElement> selectDays;
	
	@FindBy(id = "dependent_dateOfBirth")
	public WebElement yearMonthDayOfBirth;
	
	@FindBy(id = "btnSaveDependent")
	public WebElement saveDependents;
	
	@FindBy(xpath = "//table[@id = 'dependent_list']/tbody/tr")
	public List<WebElement> actualDepen;
	
	public AddDependentsPageElements() {
		PageFactory.initElements(driver, this);
	}

}
