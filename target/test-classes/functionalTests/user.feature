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
    Then user is created with "<status_code>"
    When I updated user by "<username>" with the following body:
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
    Then user is updated with "<status_code>"
    When I delete user by "<username>"
    Then user is deleted with "<status_code>"
    Examples:
      | id | username | first_name | last_name | email | password | phone | user_status |status_code|
      | 10 | theUser  | Victor     |  Carvajal | victor@gmail.com | 12345 | 12345 |  1   |200       |
      | 11 | theUser1  | Victor     |  Carvajal | victor@gmail.com | 12345 | 12345 |  1   |200       |

  Scenario Outline: User send bad request and cannot create, update and delete an user

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
    Then user is created with "<status_code>"
    When I updated user by "<username>" with the following body:
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
    Then user is updated with "<status_code>"
    Examples:
      | id | username | first_name | last_name | email | password | phone | user_status |status_code|
      | y | theUser | Victor     |  Carvajal | victor@gmail.com | 12345 | 12345 |  1   |  400   |
      | i | theUser1 | Victor     |  Carvajal | victor@gmail.com | 12345 | 12345 |  1   |  400   |