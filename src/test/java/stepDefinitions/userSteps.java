package stepDefinitions;

import endPoints.userEndPoints;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;

public class userSteps {

    private Response response;

    @Given("I create a new user with the following body:")
    public void createUser(String requestBody) {
        response = userEndPoints.createUser(requestBody);
    }

    @Then("user is created with {string}")
    public void userIsCreatedWith(String status_code) {
        Assert.assertEquals(Integer.parseInt(status_code), response.getStatusCode());
    }

    @When("I updated user by {string} with the following body:")
    public void updateUser(String username, String requestBody){
        response = userEndPoints.updateUser(username,requestBody);
    }

    @Then("user is updated with {string}")
    public void userIsUpdatedWith(String status_code) {
        Assert.assertEquals(Integer.parseInt(status_code), response.getStatusCode());
    }

    @When("I delete user by {string}")
    public void deleteUser(String username){
        response = userEndPoints.deleteUser(username);
    }

    @Then("user is deleted with {string}")
    public void userIsDeletedWith(String status_code) {
        Assert.assertEquals(Integer.parseInt(status_code), response.getStatusCode());
    }
}
