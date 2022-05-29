package rest.testing;

import model.Author;
import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import services.AuthorEntity;
import services.PropertiesReader;
import services.Client;

public class Tests  {

    AuthorEntity authorEntity = new AuthorEntity();
    PropertiesReader reader = new PropertiesReader();
    Client client = new Client();
    TestAsserts testAsserts = new TestAsserts();
    String jsonCreatedAuthor = authorEntity.authorToJson(getCreatedAuthor());
    String jsonUpdatedAuthor = authorEntity.authorToJson(getUpdatedAuthor());

    @BeforeMethod
    public void setup() {
        RestAssured.baseURI = reader.getBaseUrl();
    }

    @Test(priority = 1)
    public void createNewAuthor() {
        client.createRequestPost(jsonCreatedAuthor, reader.getUrlAuthorPath());
        client.createResponseAuthorEntity();
        testAsserts.assertCode(201, client.getResponse());
        testAsserts.assertAuthor(client.getResponseAuthor(), getCreatedAuthor());
    }

    @Test(priority = 2)
    public void getAuthorById() {
        client.createRequestGet(reader.getUrlAuthorPathWithId());
        client.createResponseAuthorEntity();
        Assert.assertEquals(reader.getAuthorId(), client.getResponseAuthor().getAuthorId());
    }


    @Test(priority = 3)
    public void changeAuthor() {
        client.createRequestPut(jsonUpdatedAuthor, reader.getUrlAuthorPath());
        client.createResponseAuthorEntity();
        testAsserts.assertCode(200, client.getResponse());
        testAsserts.assertAuthor(client.getResponseAuthor(), getUpdatedAuthor());
    }

    @Test(priority = 4)
    public void deleteAuthorById() {
        client.createRequestDelete(reader.getUrlAuthorPathWithId());
        testAsserts.assertCode(204, client.getResponse());
    }
    @Test(priority = 5)
    public void assertAuthorIsDeleted() {
        client.createRequestDelete(reader.getUrlAuthorPathWithId());
        testAsserts.assertCode(404, client.getResponse());
    }




    private Author getCreatedAuthor(){
        return authorEntity.createAuthor(reader.getAuthorId(), reader.getCreatedAuthorFirstName(),
                reader.getCreatedAuthorSecondName(), reader.getCreatedAuthorNationality(), reader.getCreatedAuthorBirthDate()
                , reader.getCreatedAuthorBirthCountry(), reader.getCreatedAuthorBirthCity(), reader.getCreatedAuthorDescription());
    }

    private Author getUpdatedAuthor() {
        return authorEntity.createAuthor(reader.getAuthorId(), reader.getUpdatedAuthorFirstName(),
                reader.getUpdatedAuthorSecondName(), reader.getUpdatedAuthorNationality(), reader.getUpdatedAuthorBirthDate()
                , reader.getUpdatedAuthorBirthCountry(), reader.getUpdatedAuthorBirthCity(), reader.getUpdatedAuthorDescription());
    }
}
