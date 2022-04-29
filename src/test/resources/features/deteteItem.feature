Feature: Validate Delete items

  Scenario: Verify Delete Item functionality
    Given Go to swiggy website
    When Enter search sweets "Chinese hut"
    Then Select item and Verify
    Then Add Item and Verify card section
    Then Delete Item and Verify card section
