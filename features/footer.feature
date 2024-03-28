
Feature: Scroll to footer on homepage

  
  Scenario: Navigate to terms and conditions in homepage
    Given when user is in redbus homepage
    When user scroll to footer scetion 
    And user click on terms and conditions link
    Then user should be redirected to new terms and conditions page
    

  Scenario: Navigate to privacy policy in homepage
    Given when user is in redbus homepage
    When user scroll to footer scetion 
    And user click on privacy policy link
    Then user should be redirected to privacy policy page
    
  
  Scenario: Navigate to FAQ in homepage
    Given when user is in redbus homepage
    When user scroll to footer scetion 
    And user click on FAQ link
    Then user should be redirected to FAQ page
    
    
  Scenario: Navigate to blog in homepage
    Given when user is in redbus homepage
    When user scroll to footer scetion 
    And user click on blog link
    Then user should be redirected to blog page
    
    
  Scenario: Navigate to registration in homepage
    Given when user is in redbus homepage
    When user scroll to footer scetion 
    And user click on bus operator registration link
    Then user should be redirected to bus operator registration page
    And user should enter valid phone number
    And user should click on generate otp button
    Then user should enter otp
    And user should click on enter otp
    Then user redirected to details page  
    