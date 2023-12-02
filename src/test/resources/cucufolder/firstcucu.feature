Feature: Verifying facebook login details

  Scenario Outline: Verifying facebook login with valid credentials
    Given User is on the facebook page
    When User enter "<username>" and "<password>"
    And User click login button
    Then User should verify after login success message
    
    Examples:
    |username|password|
    |Raj|Raj@123|
    |Ramesh|Ramesh@123|
    |Raju|Raju@123|
