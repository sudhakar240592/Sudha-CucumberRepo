Feature: Facebook Login

Background: 
Given user navigate to the site
When submits username and password
And clicks enter to login

@smoke
Scenario: To verify whether its landed on homepage 
Then checks the username matches or not