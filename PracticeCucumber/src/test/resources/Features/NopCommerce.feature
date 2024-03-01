Feature: Test the NopCommerce Web Application

Scenario Outline: login Functionality

	Given user should enter into the login page
	When user enters <username> and <password> 
	And user should click on login button
	Then user should enter into the homepage

Examples:
    | username   | password |
    | standard_user | secret_sauce |
    | locked_out_user | secret_sauce |
	