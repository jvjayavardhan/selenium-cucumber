@demoTag 
Feature: Demo Feature 

Scenario: Search for india in goolge 
	Given user launches google URL in the browser 
	When the user search for the keyword "India" 
	Then the google should return the page results for "India"