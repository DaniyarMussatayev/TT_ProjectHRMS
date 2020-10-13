package com.syntaxx.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntaxx.testBase.BaseClass;

public class AddEmergencyPageElements extends BaseClass {
	
	@FindBy(linkText = "Emergency Contacts")
	public WebElement EmergencyContact;
	
	@FindBy(id = "btnAddContact")
	public WebElement addEmeButton;
	
	@FindBy(id = "emgcontacts_name")
	public WebElement EmergncyName;
	
	@FindBy(id = "emgcontacts_relationship")
	public WebElement EmergencyRelationship;
	
	@FindBy(id = "emgcontacts_mobilePhone")
	public WebElement EmergencyPhone;
	
	@FindBy(id = "btnSaveEContact")
	public WebElement saveEmeButton;
	
	@FindBy(xpath = "//table[@id ='emgcontact_list']/tbody/tr")
	public List<WebElement> actualEmergncyConctact;
	
	public AddEmergencyPageElements() {
		PageFactory.initElements(driver, this);
	}
	
}
