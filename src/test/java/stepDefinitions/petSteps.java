package stepDefinitions;

import endPoints.petEndPoints;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class petSteps {

    private Response response;

    @Given("I add a new pet with the following body:")
    public void userAddNewPet(String requestBody) {

        response = petEndPoints.addNewPet(requestBody);
        int actualStatusCode = response.getStatusCode();
        System.out.println(actualStatusCode);
    }

    @Then("Pet is added")
    public void pet_is_added() {

    }

    @When("I update new pet with the following body")
    public void i_update_new_pet(String requestBody){

        response = petEndPoints.updatePet(requestBody);
        int actualStatusCode = response.getStatusCode();
        System.out.println(actualStatusCode);
    }

    @Then("Pet is updated")
    public void pet_is_updated() {
    }

    @When("I delete pet by {string}")
    public void iDeletePetBy(String id){

        response = petEndPoints.deletePet(id);
        int actualStatusCode = response.getStatusCode();
        System.out.println(actualStatusCode);
    }

    @Then("Pet is deleted")
    public void pet_is_deleted() {

    }

}
