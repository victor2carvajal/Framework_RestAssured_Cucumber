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
    Then order is placed
    When I find purchase order by "<id>"
    Then Order is found
    When I delete purchase order by "<id>"
    Then Order is deleted
    Examples:
      | id | pet_id | quantity | ship_date                 | status | complete |
      | 10 | 198772 |     7    |  2024-02-22T12:51:26.875Z | approved | true   |