Feature:Hotel Regression Tests

  Scenario: Panel should have following fields: Going to, check-in, check-out, number of rooms, number of travelers,
    Given click on the hotel link
    And verify all input field displayed

  Scenario: One room and 1 travelers should be selected by default
    Given click on the hotel link
    Then verify that one traveler and one room is selected

  Scenario: User can select maximum 8 adult and 8 children travelers, 16 in total
    Given click on the hotel link
    Given click on travelers button
    And click on adult plus button eight times
    Then click on children plus button eight times
    Then Verify that traveler input field should display sixteen travelers