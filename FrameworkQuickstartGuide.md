# Quickstart Instructions
   

## Selenium & Rest Assured
NOTE: Full in depth guide can be found in src/test/java/selenium/Documentation/README.md
### Installation/Setup
1.	Extract the zip file delivered with this email
2.	Open cmd or terminal, navigate to your unzipped framework
3.	Run - “mvn validate”
### Run commands
* 	Run all the tests - “mvn clean verify -Denvironment=default”
* 	Run specific test by tag - “mvn clean verify -Dcucumber.filter.tags=”UITest” -Denvironment=default”
* 	Run all but ignore specific tests by tag - “mvn clean verify -Dcucumber.filter.tags=”not UITest” -Denvironment=default”   

## Selenium with Axe
### Installation/Setup
1.	No additional setup is required
### Run commands
* 	Run the tests as normal using the standard run commands from the Selenium run commands section. NOTE: You can use cucumber tagging to run the axe tests exclusively   


## Jmeter
### Installation/Setup
1. Create a .jmx file for your performance test case using the Jmeter GUI
2. Export the .jmx file and drop it into src/test/resources/jmeter/outputs directory
3. Specify your .jmx file name and required volumetrics for testing in the JmeterPerformanceTest.feature file
### Run commands
* 	To run your jmx file with the specified volumetrics run – “mvn clean verify -Dcucumber.filter.tags=”@Jmeter” -Denvironment=default” (The output of your performance test run will be stored in src/test/resources/jmeter/outputs) 