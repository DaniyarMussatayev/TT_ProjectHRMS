package com.syntaxx.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntaxx.testBase.BaseClass;

public class AddContactPageElements extends BaseClass {
	
	@FindBy(id = "menu_pim_viewEmployeeList")
	public WebElement empList1;
	
	@FindBy(xpath = "//input[@id ='empsearch_id']")
	public WebElement searchById;
	
	@FindBy(id = "searchBtn")
	public WebElement searchButton;
	
	@FindBy(xpath = "//td[@class='left']/a")
	public WebElement employeeOnTable;
	
	@FindBy(linkText = "Contact Details")
	public WebElement contactDetailsBtn;
	
	@FindBy(id = "btnSave")
	public WebElement contactAddBtn;
	
	@FindBy(id = "contact_street1")
	public WebElement contactStreet;
	
	@FindBy(id = "contact_city")
	public WebElement contactCity;
	
	@FindBy(id = "contact_province")
	public WebElement contactProvince;
	
	@FindBy (id = "contact_emp_zipcode")
	public WebElement contactZip;
	
	@FindBy(id = "contact_country")
	public WebElement contactCountry;
	
	@FindBy(id = "contact_emp_hm_telephone")
	public WebElement contactTel;
	
	@FindBy(id = "contact_emp_work_email")
	public WebElement contactWorkEmail;
	
	@FindBy(id = "contact_emp_oth_email")
	public WebElement contactOtherEmail;
	
	
	public AddContactPageElements() {
		PageFactory.initElements(driver, this);
	}
}
