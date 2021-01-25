Feature: Menu Management
#  simple business language to help all stakeholders, business analysts,
#  end users, product owner, technical (developer, DBA, architect), QA testers

  Scenario: Add a menu item
    Given I have a menu item with name "Cucumber Sandwich" and price 20
    When I add that menu item
    Then Menu Item with name "Cucumber Sandwich" should be added
