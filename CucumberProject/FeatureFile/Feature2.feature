Feature: As a user I want to test login feature with multiple datasets

  Scenario Outline: To test login scenario with multiple data sets
    Given Application is up and running
    When I enter <username> and <password> on login page
    Then I should be logged in successfully.

    Examples: 
      | username | password  |
      | nameA    | test@abhi |
      | nameB    | test@rony |
      | nameC    | test@@123 |
      