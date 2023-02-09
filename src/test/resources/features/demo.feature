Feature: Filling up form on Insure page

  Scenario: User fill up the insure page with positive details
    Given User opens the "Chrome" browser
    Then User Click on Get Started Button
    Then User select Applicant Type "Employee"
    Then user select Product Supplementa Life
    Then User enter the First Name as "Vijay" and Last Name as "XYZ"
    Then User enter email id as "abc@gmail.com"
    Then User set the coverage amount
    Then User enter the DOB as "11-02-2000"
    Then user select the gender as male
    Then User enter the phone mumber as "2622846856"
    Then User enter the address as "382 Channel Drive Port Washington, NY, USA" and accept the term and condition
    Then User enter the weight as "222"
    Then User enter the height as "5'11""
    Then user select the NoneOfTheAbove option
    Then User enter the First Name as "Vijay" and Last Name as "XYZ" on sign your application
    Then User click on Sign Your Application
