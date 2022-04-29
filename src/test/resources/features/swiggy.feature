Feature: Validate search functionality

  Scenario Outline: Verify that search functionality
    Given Go to swiggy website
    When Enter search sweets "<search>"
    Then verify the results

    Examples: 
      | search   |
      | Dominos  |
      | Haldiram |
