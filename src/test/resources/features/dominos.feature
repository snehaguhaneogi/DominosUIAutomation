Feature: Dominos Order Flow

  Background:
    Given user launches dominos website
    And user logs in to dominos

  Scenario Outline: Add pizza and verify cart
    When user closes popup
    And user clicks on menu
    And user selects pizza "<pizza>"
    And user opens cart
    Then address button should be visible

    Examples:
      | pizza        |
      | Peppy Paneer |
