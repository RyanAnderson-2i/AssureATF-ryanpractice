@AccessibilityTest @all
Feature: Accessibility testing example

  Scenario Outline: Navigating to baseURL and checking accessibility criteria
    Given I navigate to base url
    Then the page meets <standard> accessibility criteria

    Examples:
      | standard      |
      | WCAG 2 AA     |
#      | WCAG 2 A      |
#      | Section 508   |
#      | Experimental  |

