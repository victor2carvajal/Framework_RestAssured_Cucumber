Feature: Operations about user

  Scenario: User can create, update and delete an user

    Given I create a new user
    Then User is created
    When I updated user
    Then user is updated
    When I delete user
    Then user is deleted