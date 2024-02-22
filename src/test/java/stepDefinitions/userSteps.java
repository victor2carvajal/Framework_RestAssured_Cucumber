package stepDefinitions;

import endPoints.userEndPoints;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class userSteps {

    private Response response;

    @Given("I create a new user with the following body:")
    public void createUser(String requestBody) {
        response = userEndPoints.createUser(requestBody);
        int actualStatusCode = response.getStatusCode();
        System.out.println(actualStatusCode);
    }

    @Then("User is created")
    public  void userIsCreated(){

    }

    @When("I updated user")
    public void updateUser(){
    }

    @Then("user is updated")
    public void userIsUpdate(){
    }

    @When("I delete user")
    public void deleteUser(){
    }

    @Then("user is deleted")
    public void userIsDeleted(){

    }
}
