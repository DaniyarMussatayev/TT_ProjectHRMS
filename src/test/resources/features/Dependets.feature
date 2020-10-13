@Dependents
Feature: Add multiple dependents

  Background: 
    When login with valid credentials
    Then navigate to PIM page
    Then navigate to employee list page

  Scenario: Dependets
    When enter an employee as "7507"
    Then click on search Buttons
    Then click on employee which was founded
    Then click on Dependents
    Then click on Assigned Dependents Add Button
    Then add miltiple data in fields and verify it
      | Name    | Relationship | Date of Birth |
      | Michael | Child        | 2015-12-31    |
      | Bruce   | Child        | 2015-10-08    |
