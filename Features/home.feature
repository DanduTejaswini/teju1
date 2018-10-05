Feature: This feature file is designed to validate home page functionalities in below listed scenarios

@Regressiontest
Scenario: This scenario is designed to validate all the display conditions
     Given as an user i want to launch Firefox browser
     When a browser is launched verify Homepage is displayed
     Then verify Tabs order
     Then verify Broken links of the tabs 
     
@Smoketest
Scenario: This scenario is designed to validate staff section display conditions
     Given Launch Firefox browser and application
     When an application is opened click admin login using admin credentials "Username" and "Password" and verify admin home page is dispalyed
     |admin|admin|
     |admin|admin|
     |admin|admin|
     |admin|admin|
          
     Then verify tabs order under staff section 
     Then verify all invalid inputs in Add staff section

Scenario: This scenario is designed to Add Staff member
    Given Launch browser and open application
    When app opened login \"([^\"]*)\" and \"([^\"]*)\" as admin credentials
    |admin|admin|
    Then click add staff tab
    Then "Enter credentials to Add Staff"
    |Tejaswini|F|03/07/1992|Married|Developer|10/11/2018|Nizampet|9666609621|teju@gmail.com|1234|
     
 