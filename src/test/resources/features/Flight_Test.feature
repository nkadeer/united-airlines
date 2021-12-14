Feature:Flight Regression Tests

  Scenario: user is able to choose one way flight
    Given click on the one way radio button
    And fill return data field

  Scenario: user is able to choose round trip flight
    Given click on the round way radio button
    And fill departing and return data field

  Scenario: user is able to add travellers
    Given click on the traveller field
    And on the dropdown option add new traveller

  Scenario: user is able to subtract travellers
    Given click on the traveller field
    And on the dropdown option subtract traveller number

  Scenario: user is able to see children age if added
    Given click on the traveller field
    And on the dropdown option you can choose children traveller age

  Scenario: user is able to switch depart and destination
    Given click the right arrow and left arrow
    And verify the depart and destination is switched

  Scenario: depart and destination fields should have correct placeholder
    Given verify the depart and destination with attribute

  Scenario: user should able to remove value depart and destination fields
    Given click the circle remove button
    And verify the depart and destination value removed


  Scenario: User can select different flight classes such as Economy, Premium economy, Business or First
    Given click the dropdown arrow
    And choose class option
    Then  verify the changed successfully

  Scenario: user should able to select minimum one traveller
    Given click the traveller field
    Then  verify the traveller number successfully

  Scenario: user should able to select travel with pet
    Given click the traveller selector field
    And hover over to travel with pet option then click
    Then  verify the pet is added successfully

  Scenario: user should able to advance search
    Given click the advance search link
    Then  verify the open with new page successfully

  Scenario: user should able to check flexible dates
    Given click the flexible check box
    Then  verify dates dropdown fields changes successfully




