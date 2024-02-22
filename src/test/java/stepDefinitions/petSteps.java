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
    }

    @Then("pet is added with {string}")
    public void successfulPetAddition(String status_code){
        Assert.assertEquals(Integer.parseInt(status_code), response.getStatusCode());
    }

    @When("I update new pet with the following body")
    public void updatePet(String requestBody){
        response = petEndPoints.updatePet(requestBody);
    }

    @Then("pet is update with {string}")
    public void petIsUpdateWith(String status_code) {
        Assert.assertEquals(Integer.parseInt(status_code), response.getStatusCode());
    }

    @When("I delete pet by {string}")
    public void deletePetById(String id){
        response = petEndPoints.deletePet(id);
    }

    @Then("pet is deleted with {string}")
    public void petIsDeletedWith(String status_code) {
        Assert.assertEquals(Integer.parseInt(status_code), response.getStatusCode());
    }
}
