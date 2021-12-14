Feature:Sanity Tests

Scenario: user is able to change language
 Given click on the language selector button in the header
 And click on the select language dropdown
 Then select the desirable option from dropdown
 Then click on the change button
 And verify the language is changed successfully

 Scenario: Home page booker container tabs should display correct fields
  Given user is on home page
  And Book tab should have all necessary fields
  And Flight status tab should have necessary fields
  And Check-in tab should have necessary fields
  And My trips tab should have necessary fields

 Scenario: Footer links should not be broken
  Given user is on home page
  Then find all links and verify each link has href attribute

 Scenario: Top header tabs should show correct panels when clickedGiven user is on home page
  Then verify that the each tab has area-selected attribute true

 Scenario: Advisory top section should display info with links
  Given user is on home page
  Then verify that the info display has link