package endPoints;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class userEndPoints {

    private static Response response;
    private static final String baseURI = "http://localhost:8080/api/v3/";

    public static Response createUser(String requestBody) {
        RestAssured.baseURI = baseURI;
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json").header("accept", "application/xml");
        return response = request.body(requestBody).post("/user");
    }

    public static Response updateUser(String username, String requestBody){
        RestAssured.baseURI = baseURI;
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json").header("accept", "*/*");
        return response = request.body(requestBody).put("/user"+"/"+username);
    }

    public static Response deleteUser(String username){
        RestAssured.baseURI = baseURI;
        RequestSpecification request = RestAssured.given();
        request.header("accept", "*/*");
        return response = request.delete("/user"+"/"+username);
    }
}
