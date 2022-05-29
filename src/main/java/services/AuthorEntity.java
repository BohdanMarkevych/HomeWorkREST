package services;


import com.google.gson.Gson;
import model.Author;

public class AuthorEntity {

    private Author createAuthorEntity = new Author();
    private Author.Name createAuthorName = new Author.Name();
    private Author.Birth createAuthorBirth = new Author.Birth();
    private Gson gson = new Gson();


    public Author createAuthor(int id, String first, String second, String nationality, String date,
                               String country, String city, String description){
        createAuthorEntity.setAuthorId(id);
        createAuthorEntity.setAuthorName(createAuthorName(first, second));
        createAuthorEntity.setNationality(nationality);
        createAuthorEntity.setBirth(createAuthorBirth(date, country, city));
        createAuthorEntity.setAuthorDescription(description);
        return createAuthorEntity;
    }

    private Author.Name createAuthorName(String first, String second) {
        createAuthorName.setFirst(first);
        createAuthorName.setSecond(second);
        return createAuthorName;
    }

    private Author.Birth createAuthorBirth(String date, String country, String city) {
        createAuthorBirth.setDate(date);
        createAuthorBirth.setCountry(country);
        createAuthorBirth.setCity(city);
        return createAuthorBirth;
    }

    public String authorToJson(Author author) {
        return gson.toJson(author);
    }

}
