package services;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
    Properties properties = new Properties();

    public PropertiesReader() {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream("src/main/resources/data.properties");
            properties.load(fileInputStream);
            fileInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public String getBaseUrl() {
        return properties.getProperty("BASE_URL");
    }

    public String getUrlAuthorPath() {
        return properties.getProperty("URL_AUTHOR_PATH");
    }

    public String getUrlAuthorPathWithId() {
        return properties.getProperty("URL_AUTHOR_PATH_WITH_ID");
    }

    public String getUrlAuthorPathAllAuthors() {
        return properties.getProperty("URL_AUTHOR_PATH_ALL_AUTHORS");
    }

    public int getAuthorId() {
        String id = properties.getProperty("AUTHOR_ID");
        return Integer.parseInt(id);
    }

    public String getCreatedAuthorFirstName() {
        return properties.getProperty("CREATED_AUTHOR_FIRST_NAME");
    }

    public String getCreatedAuthorSecondName() {
        return properties.getProperty("CREATED_AUTHOR_SECOND_NAME");
    }

    public String getCreatedAuthorNationality() {
        return properties.getProperty("CREATED_AUTHOR_NATIONALITY");
    }

    public String getCreatedAuthorBirthDate() {
        return properties.getProperty("CREATED_AUTHOR_BIRTH_DATE");
    }

    public String getCreatedAuthorBirthCountry() {
        return properties.getProperty("CREATED_AUTHOR_BIRTH_COUNTRY");
    }

    public String getCreatedAuthorBirthCity() {
        return properties.getProperty("CREATED_AUTHOR_BIRTH_CITY");
    }

    public String getCreatedAuthorDescription() {
        return properties.getProperty("CREATED_AUTHOR_DESCRIPTION");
    }

    public String getUpdatedAuthorFirstName() {
        return properties.getProperty("UPDATED_AUTHOR_FIRST_NAME");
    }

    public String getUpdatedAuthorSecondName() {
        return properties.getProperty("UPDATED_AUTHOR_SECOND_NAME");
    }

    public String getUpdatedAuthorNationality() {
        return properties.getProperty("UPDATED_AUTHOR_NATIONALITY");
    }

    public String getUpdatedAuthorBirthDate() {
        return properties.getProperty("UPDATED_AUTHOR_BIRTH_DATE");
    }

    public String getUpdatedAuthorBirthCountry() {
        return properties.getProperty("UPDATED_AUTHOR_BIRTH_COUNTRY");
    }

    public String getUpdatedAuthorBirthCity() {
        return properties.getProperty("UPDATED_AUTHOR_BIRTH_CITY");
    }

    public String getUpdatedAuthorDescription() {
        return properties.getProperty("UPDATED_AUTHOR_DESCRIPTION");
    }

}
