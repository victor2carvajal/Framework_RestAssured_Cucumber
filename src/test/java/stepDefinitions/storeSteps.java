package stepDefinitions;

import endPoints.storeEndPoints;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;

public class storeSteps {

    private Response response;

    @Given("I place an order with the following body:")
    public void userAddNewPet(String requestBody) {
        response = storeEndPoints.placeAnOrder(requestBody);
    }

    @Then("order is placed with {string}")
    public void orderIsPlacedWith(String status_code) {
        Assert.assertEquals(Integer.parseInt(status_code), response.getStatusCode());
    }

    @When("I find purchase order by {string}")
    public void findPurchaseOrderById(String id){
        response = storeEndPoints.findPurchaseOrderById(id);
    }

    @Then("order is found with {string}")
    public void orderIsFoundWith(String status_code) {
        Assert.assertEquals(Integer.parseInt(status_code), response.getStatusCode());
    }

    @When("I delete purchase order by {string}")
    public void deletePurchaseOrderById(String id){
        response = storeEndPoints.deletePurchaseOrderById(id);
    }

    @Then("order is deleted with {string}")
    public void orderIsDeletedWith(String status_code) {
        Assert.assertEquals(Integer.parseInt(status_code), response.getStatusCode());
    }
}
