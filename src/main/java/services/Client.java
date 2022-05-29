package services;


import model.Author;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Client {

    private final Header STANDARD_HEADER = new Header("Content-Type", "application/json");
    private Response response;
    private RequestSpecification request;
    private Author responseAuthor;


    public void createRequestPost(String jsonObj, String path) {
        request = RestAssured.given();
        request.header(STANDARD_HEADER);
        request.body(jsonObj);
        response = request.post(path);
    }

    public void createRequestPut(String jsonObj, String path) {
        request = RestAssured.given();
        request.header(STANDARD_HEADER);
        request.body(jsonObj);
        response = request.put(path);
    }

    public void createRequestGet(String path) {
        response = RestAssured.get(path);
    }

    public void createRequestDelete(String path) {
        response = RestAssured.delete(path);
    }

    public void createResponseAuthorEntity() {
        responseAuthor = getResponse().jsonPath().getObject("$", Author.class);
        System.out.println(responseAuthor);
    }




    public Response getResponse() {
        return response;
    }

    public Author getResponseAuthor() {
        return responseAuthor;
    }


}