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
        Assert.assertEquals(200, response.getStatusCode());
    }

    @When("I updated user by {string} with the following body:")
    public void updateUser(String username, String requestBody){
        response = userEndPoints.updateUser(username,requestBody);
        Assert.assertEquals(200, response.getStatusCode());
    }

    @Then("I delete user by {string}")
    public void deleteUser(String username){
        response = userEndPoints.deleteUser(username);
        Assert.assertEquals(200, response.getStatusCode());
    }
}
