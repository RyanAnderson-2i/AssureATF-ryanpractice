@Jmeter @Performance
Feature: Run a simple performance test using a give JMX file

  Scenario: Performance testing using a preconfigured JMX file
    When the following volumetrics are used for the JMX file: "sample.jmx"
      | concurrent users | ramp up | loops | duration | start up delay | delay between calls | url          |
      | 10               | 2       | 2     | 2        | 12             | 500                 | https://www.saucedemo.com/ |
    Then the JMX file: "sample.jmx" is executed
