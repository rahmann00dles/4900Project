@registration
Feature: This feature is to register a new account

  @registerNewUser
  Scenario: As a new user, I can register for a new account
    Given A user goes to the contact list app
    When A user is on the app
    Then Verify the "Contact List App" header
    And Verify the "sign up" message
    And Verify the sign up button is clickable
    When A user clicks on the sign up button
    Then Verify the "Add User" header
    And Verify the the fields are enabled
    And Verify the "add user" message
    Then A user can enter their "first name"
    Then A user can enter their "last name"
    Then A user can enter their "email"
    Then A user can enter their "password"
    And Verify the "Submit" button is clickable
    And Verify the "Cancel" button is clickable
    When A user clicks on the "Submit" button
    Then Verify the "Contact List" header