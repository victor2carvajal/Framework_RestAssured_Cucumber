Feature: Everything about your Pets

  Scenario Outline: User can add, update and delete a pet

    Given I add a new pet with the following body:
      """
      {
        "id": <id>,
        "name": "<name>",
        "category": {
          "id": <category_id>,
          "name": "<category_name>"
        },
        "photoUrls": [
          "<photo_url>"
        ],
        "tags": [
          {
            "id": <tag_id>,
            "name": "<tag_name>"
          }
        ],
        "status": "<status>"
      }
      """
    Then pet is added with "<status_code>"
    When I update new pet with the following body
    """
      {
        "id": <id>,
        "name": "<name2>",
        "category": {
          "id": <category_id>,
          "name": "<category_name>"
        },
        "photoUrls": [
          "<photo_url>"
        ],
        "tags": [
          {
            "id": <tag_id>,
            "name": "<tag_name>"
          }
        ],
        "status": "<status>"
      }
      """
    Then pet is update with "<status_code>"
    When I delete pet by "<id>"
    Then pet is deleted with "<status_code>"
    Examples:
      | id | name    | category_id | category_name | photo_url | tag_id | tag_name | status      | name2 |status_code|
      | 10 | doggie  | 1           | Dogs          | string    | 0      | string   | available   |  charlotte|200    |
      | 11 | doggie  | 2           | Cats          | string    | 0      | string   | available   |  charlotte|200    |

  Scenario Outline: User send bad request and cannot add, update and delete a pet

    Given I add a new pet with the following body:
      """
      {
        "id": <id>,
        "name": "<name>",
        "category": {
          "id": <category_id>,
          "name": "<category_name>"
        },
        "photoUrls": [
          "<photo_url>"
        ],
        "tags": [
          {
            "id": <tag_id>,
            "name": "<tag_name>"
          }
        ],
        "status": "<status>"
      }
      """
    Then pet is added with "<status_code>"
    When I update new pet with the following body
    """
      {
        "id": <id>,
        "name": "<name2>",
        "category": {
          "id": <category_id>,
          "name": "<category_name>"
        },
        "photoUrls": [
          "<photo_url>"
        ],
        "tags": [
          {
            "id": <tag_id>,
            "name": "<tag_name>"
          }
        ],
        "status": "<status>"
      }
      """
    Then pet is update with "<status_code>"
    When I delete pet by "<id>"
    Then pet is deleted with "<status_code>"
    Examples:
      | id | name    | category_id | category_name | photo_url | tag_id | tag_name | status      | name2 |status_code|
      | T | doggie  | 1           | Dogs          | string    | 0      | string   | available   |  charlotte|400    |
      | G | doggie  | 2           | Cats          | string    | 0      | string   | available   |  charlotte|400    |