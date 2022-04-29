Feature: Validate Add items

  Scenario: Verify Add Item functionality
    Given Go to swiggy website
    When Enter search sweets "Dominos"
    Then Select item and Verify
    Then Add Item and Verify card section
