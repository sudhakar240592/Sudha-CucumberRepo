Feature: Adactin Test Cases

Background: 
Given user navigate to the app
When submit username and password
And click enter to login

@smoke
Scenario: Verify the login
When user enter the homepage it verifies

Scenario: To verify whether the check-out date field accepts a later date than checkin date
When user selects the location
Then select Hotels
Then select Room Type
Then select no.of rooms
Then Enter check-in date today +7 date
Then Ener check-out date today +5 date
Then select Adults per room 
And select children per room
Then Enter submit


Scenario: To check if error is reported if check-out date field is in the past
When user selects location as "Sydney"
Then select hotel as "Hotel Creek"
Then select room type as "Standard"
Then select no.of rooms as "1"
Then enter check-in date today's -5 date
Then enter check-out date today's -3 date
Then  verify the application throws error 


Scenario: To verify whether locations in Select Hotel page are displayed according to the location selected in Search Hotel
When user selects location as "Sydney"
Then select hotel as "Hotel Creek"
Then select room type as "Standard"
Then select no.of rooms as "1"
Then enter Today's check-in date
Then enter check-out date today +1 date
Then select no.of adults as "1"
Then select no.of children as "0" 
And enter search button
Then Verify that hotel displayed is the same as selected in search Hotel form

Scenario: To verify whether Check-in date and Check Out date are being displayed in Select Hotel page according to the dates selected in search Hotel. 
When user selects location as "Sydney"
Then select hotel as "Hotel Creek"
Then select room type as "Standard"
Then select no.of rooms as "1"
Then pass Today's check-in date
Then send check-out date today +1 date
Then select no.of adults as "1"
Then select no.of children as "0" 
And enter search button
Then Verify that Check-in-date and Check-out-date displayed is the same as selected in search Hotel form


Scenario: To verify whether the total price is calculated as “price per night * no. of nights * no of rooms”
 When user selects location as "Sydney"
Then select hotel as "Hotel Creek"
Then select room type as "Standard"
Then select no.of rooms as "2"
Then enter Today's check-in date
Then enter check-out date today +1 date
Then select no.of adults as "1"
Then select no.of children as "0" 
And enter search button
Then verify that total- price(excl.GST) is being calculated as (price-per-night * no- of-rooms * no-of-days)