Feature:Package Regression Tests

  Scenario:  User should see vacation search result with all fields filled properly
    Given click on the packages link
    And filling up the vacation form
    And verify with search result

  @test
  Scenario: Vacation form should have only up to 4 rooms
    Given click on the packages link
    And increase room number to 4
    Then Rooms container should say “rooms” if room count is bigger than one

