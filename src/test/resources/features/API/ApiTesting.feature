@apiTest @all
Feature: Automated API Test using restassured

	Scenario: BaseURL API Test
		Given the "baseURL" endpoint is available
		When I set the endpoint
		And I GET the endpoint
		Then I should get 200 back

		