@emergencyConctact
Feature: Add Employee's Emergency Contacts

  Background: 
    When login with valid credentials
    Then navigate to PIM page
    Then navigate to employee list page

  Scenario: Emergency conctact
    When enter employee as "7510"
    Then click on searchs Button
    Then click on employees who was founded
    Then click on Emergency Contacts
    Then click on Assigned Emergency Contacts Add Button
    Then add miltiple all data in fields and verify they added successfully
      | Name  | Relationship | Mobile |
      | Vasya | Brat         | 898473 |
