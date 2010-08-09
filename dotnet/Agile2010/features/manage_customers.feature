Feature: Manage Customers
  
  Scenario: Add a customer
    Given there are no customers in the system
    When I add a customer named "Aslak"
    Then the customer list should contain "Aslak"