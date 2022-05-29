package rest.testing;

import model.Author;
import io.restassured.response.Response;
import org.testng.Assert;

public class CustomAsserts {
    public void assertAuthor(Author author1, Author author2) {
        Assert.assertEquals(author1, author2);
    }

    public void assertCode(int code, Response response) {
        Assert.assertEquals(code, response.getStatusCode());
    }
}
