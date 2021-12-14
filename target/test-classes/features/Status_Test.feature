Feature:Flight Status Regression Tests

  Scenario:User searches flight status between from and to destinations
    Given click on the flight status link
    And check between from and to destinations
    Then click on the search button
    And verify user able to see flight status

  Scenario: Flight number field should not accept other than numbers
    Given click on the flight status link
    And click on the flight number field
    Then verify only accept number

  Scenario: Invalid number error message should be displayed when a wrong flight number is entered
    Given click on the flight status link
    And enter invalid number
    Then verify with error massage