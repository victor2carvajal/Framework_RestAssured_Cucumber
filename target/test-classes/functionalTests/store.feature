Feature: Access to Petstore orders

  Scenario Outline: User can place an order, find and delete purchase order

    Given I place an order with the following body:
      """
        {
          "id": <id>,
          "petId": <pet_id>,
          "quantity": <quantity>,
          "shipDate": "<ship_date>",
          "status": "<status>",
          "complete": <complete>
        }
      """
    Then order is placed with "<status_code>"
    When I find purchase order by "<id>"
    Then order is found with "<status_code>"
    When I delete purchase order by "<id>"
    Then order is deleted with "<status_code>"
    Examples:
      | id | pet_id | quantity | ship_date                 | status | complete |status_code|
      | 10 | 198772 |     7    |  2024-02-22T12:51:26.875Z | approved | true   |200        |
      | 11 | 198773 |     7    |  2024-02-22T12:51:26.875Z | approved | true   |200        |

  Scenario Outline: User send bad request and cannot place an order, find and delete purchase order

    Given I place an order with the following body:
      """
        {
          "id": <id>,
          "petId": <pet_id>,
          "quantity": <quantity>,
          "shipDate": "<ship_date>",
          "status": "<status>",
          "complete": <complete>
        }
      """
    Then order is placed with "<status_code>"
    When I find purchase order by "<id>"
    Then order is found with "<status_code>"
    When I delete purchase order by "<id>"
    Then order is deleted with "<status_code>"
    Examples:
      | id | pet_id | quantity | ship_date                 | status | complete |status_code|
      | T | 198772 |     7    |  2024-02-22T12:51:26.875Z | approved | true   |400        |
      | G | 198773 |     7    |  2024-02-22T12:51:26.875Z | approved | true   |400        |