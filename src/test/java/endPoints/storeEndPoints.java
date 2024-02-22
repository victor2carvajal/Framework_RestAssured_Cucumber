package endPoints;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class storeEndPoints {

    private static Response response;
    private static final String baseURI = "http://localhost:8080/api/v3/";

    public static Response placeAnOrder(String requestBody) {
        RestAssured.baseURI = baseURI;
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json").header("accept", "application/xml");
        return response = request.body(requestBody).post("/store/order");
    }

    public static Response findPurchaseOrderById (String requestBody) {
        RestAssured.baseURI = baseURI;
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json").header("accept", "application/xml");
        return response = request.body(requestBody).put("/pet");
    }

    public static Response deletePurchaseOrderById(String id){
        RestAssured.baseURI = baseURI;
        RequestSpecification request = RestAssured.given();
        request.header("accept", "*/*");
        return response = request.delete("/pet"+"/"+id);
    }
}
