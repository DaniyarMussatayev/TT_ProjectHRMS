package com.syntaxx.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntaxx.testBase.BaseClass;

public class PersonalDetailsPageElements extends BaseClass {

	@FindBy(xpath = "//div[@id='profile-pic']/h1")
	public WebElement profileName;

	public PersonalDetailsPageElements() {
		PageFactory.initElements(driver, this);
	}
}
