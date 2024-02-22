Feature: Operations about user

  Scenario Outline: User can create, update and delete an user

    Given I create a new user with the following body:
      """
        {
          "id": <id>,
          "username": "<username>",
          "firstName": "<first_name>",
          "lastName": "<last_name>",
          "email": "<email>",
          "password": "<password>",
          "phone": "<phone>",
          "userStatus": <user_status>
        }
      """
    When I updated user
    Then I delete user
    Examples:
      | id | username | first_name | last_name | email | password | phone | user_status |
      | 10 | theUser  | Victor     |  Carvajal | victor@gmail.com | 12345 | 12345 |  1   |