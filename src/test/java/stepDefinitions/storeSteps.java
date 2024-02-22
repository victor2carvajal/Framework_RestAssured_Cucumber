package stepDefinitions;

import endPoints.storeEndPoints;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class storeSteps {

    private Response response;

    @Given("I place an order with the following body:")
    public void userAddNewPet(String requestBody) {
        response = storeEndPoints.placeAnOrder(requestBody);
        int actualStatusCode = response.getStatusCode();
        System.out.println(actualStatusCode);
    }

    @Then("order is placed")
    public  void orderIsPlaced(){

    }

    @When("I find purchase order by {string}")
    public void findPurchaseOrderById(String id){
        response = storeEndPoints.findPurchaseOrderById(id);
        int actualStatusCode = response.getStatusCode();
        System.out.println(actualStatusCode);
    }

    @Then("Order is found")
    public void orderIsFound(){
    }

    @When("I delete purchase order by {string}")
    public void deletePurchaseOrderById(String id){

    }

    @Then("Order is deleted")
    public void orderIsDeleted(){

    }

}
