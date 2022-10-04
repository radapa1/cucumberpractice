#Rama and Sanket
  Feature: login to application with correct user id and password

    Scenario: Successfully login into the application
      Given I opened application in browser
      When I entered user id and password and clicked on signin button
      Then successfully logged into the application
