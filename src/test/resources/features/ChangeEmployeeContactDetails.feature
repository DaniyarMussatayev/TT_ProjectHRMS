@changeEmployeeContactDetails
Feature: Change Employee Contact Details

  Background: 
    When login with valid credentials
    Then navigate to PIM page
    Then navigate to employee list page

  Scenario: Contact Details
    When enter employee Id field "8625"
    Then click on search Button
    Then click on employee who was founded
    Then click on Contact Details
    Then click on edit Button
    Then add miltiple contact details and verify the added successfully
      | Address Street  | City   | State/Province | Zip/Postal | Country     | Home Telephone | Work Email    | Other Email                    |
      | 8787 West 8str. | Almaty | DC Washington  |      12345 | Switzerland |      405891768 | dan@gmail.com | daniyarmussatayev808@gmail.com |
