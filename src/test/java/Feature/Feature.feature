Feature: New user registration
  Scenario: Verification of successful registration when the inputs are correct
    Given the user is on the user registration page
    When the user enters a valid username
      And a valid email address
      And a valid password
      And confirms the password
      And enters a valid birth date
      And selects a valid gender
      And enters a valid phone number
    Then the user registration should be successful