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
        Assert.assertEquals(200, response.getStatusCode());
    }

    @When("I find purchase order by {string}")
    public void findPurchaseOrderById(String id){
        response = storeEndPoints.findPurchaseOrderById(id);
        Assert.assertEquals(200, response.getStatusCode());
    }

    @Then("I delete purchase order by {string}")
    public void deletePurchaseOrderById(String id){
        response = storeEndPoints.deletePurchaseOrderById(id);
        Assert.assertEquals(200, response.getStatusCode());
    }
}
