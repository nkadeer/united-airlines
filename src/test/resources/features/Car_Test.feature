

Feature:Car Regression Tests

  Scenario: Cars form should have following fields: Pickup location, Drop off location, Pickup time, Drop off
    Given click on the car link
    And verify all input info field displayed

  Scenario:  Drop off location should disappear if return car to same location checkbox is checked
    Given click on the car link
    And click on the return car check box
    Then verify drop off location disappear

  Scenario: Age field should disappear if primary driver is 25 or older checkbox is checked
    Given click on the car link
    And  check primary driver is 25 or older
    Then verify age field should disappear

  Scenario: Finding a car after filling up the form should navigate to a separate tab
    Given click on the car link
    And filling up the form
    Then verify new tab is open

  Scenario:  Finding a car with book with miles checked should return result with miles only
    Given click on the car link
    And click on book with miles chek box
    Then verify the result with miles only

  Scenario: Searching for a rental car with an age lesser than 21 should display “Some car rental suppliers
  do not rent to young drivers. If you are travelling with an older person, it may help to make
  them your main driver.”
    Given click on the car link
    And click driver age field and enter age
    Then verify page with No results matching

  Scenario: Searching for a rental car with an age of 21 should not return any search result
    Given click on the car link
    And click driver age field and enter age 21
    Then verify with new search page

  Scenario:  Searching for a rental car with an age bigger than 21 should return search result
    Given click on the car link
    And click driver age field and enter age 25
    Then verify with new tab search page

