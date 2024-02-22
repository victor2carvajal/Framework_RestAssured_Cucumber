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

    @When("I updated user")
    public void updateUser(){
    }

    @Then("I delete user")
    public void deleteUser(){
    }
}
