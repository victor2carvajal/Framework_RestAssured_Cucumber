package stepDefinitions;

import endPoints.petEndPoints;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;

public class petSteps {

    private Response response;

    @Given("I add a new pet with the following body:")
    public void userAddNewPet(String requestBody) {
        response = petEndPoints.addNewPet(requestBody);
        Assert.assertEquals(200, response.getStatusCode());
    }

    @When("I update new pet with the following body")
    public void updatePet(String requestBody){
        response = petEndPoints.updatePet(requestBody);
        Assert.assertEquals(200, response.getStatusCode());
    }

    @Then("I delete pet by {string}")
    public void deletePetById(String id){
        response = petEndPoints.deletePet(id);
        Assert.assertEquals(200, response.getStatusCode());
    }

}
