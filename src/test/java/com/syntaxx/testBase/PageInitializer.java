package com.syntaxx.testBase;

import com.syntaxx.pages.AddContactPageElements;
import com.syntaxx.pages.AddDependentsPageElements;
import com.syntaxx.pages.AddEmergencyPageElements;
import com.syntaxx.pages.AddEmployeePageElements;
import com.syntaxx.pages.DashboardPageElements;
import com.syntaxx.pages.LoginPageElements;
import com.syntaxx.pages.PersonalDetailsPageElements;
import com.syntaxx.pages.SearchEmployeeElements;

public class PageInitializer extends BaseClass{

	public static LoginPageElements login;
	protected static DashboardPageElements dash;
	protected static AddEmployeePageElements addEmp;
	protected static SearchEmployeeElements empList;
	protected static PersonalDetailsPageElements persDetails;
	protected static AddContactPageElements addContactDetails;
	protected static AddEmergencyPageElements addEmergency;
	protected static AddDependentsPageElements addDependents;

	public static void initializePageObjects() {
		login = new LoginPageElements();
		dash = new DashboardPageElements();
		addEmp = new AddEmployeePageElements();
		empList = new SearchEmployeeElements();
		persDetails=new PersonalDetailsPageElements();
		addContactDetails = new AddContactPageElements();
		addEmergency = new AddEmergencyPageElements();
		addDependents = new AddDependentsPageElements();
	}
}
