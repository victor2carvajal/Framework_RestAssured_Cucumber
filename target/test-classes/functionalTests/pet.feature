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
    Then Pet is added
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
    Then Pet is updated
    When I delete pet by "<id>"
    Then Pet is deleted
    Examples:
      | id | name    | category_id | category_name | photo_url | tag_id | tag_name | status      | name2 |
      | 10 | doggie  | 1           | Dogs          | string    | 0      | string   | available   |  charlotte|