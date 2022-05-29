package model;

import java.util.Objects;

public class Author {
    private int authorId;
    private Name authorName;
    private String nationality;
    private Birth birth;
    private String authorDescription;

    public Author(int authorId, Name authorName, String nationality, Birth birth, String authorDescription) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.nationality = nationality;
        this.birth = birth;
        this.authorDescription = authorDescription;
    }

    public Author() {
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorID=" + authorId +
                ", authorName=" + authorName +
                ", nationality='" + nationality + '\'' +
                ", birth=" + birth +
                ", authorDescription='" + authorDescription + '\'' +
                '}';
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public Name getAuthorName() {
        return authorName;
    }

    public void setAuthorName(Name authorName) {
        this.authorName = authorName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Birth getBirth() {
        return birth;
    }

    public void setBirth(Birth birth) {
        this.birth = birth;
    }

    public String getAuthorDescription() {
        return authorDescription;
    }

    public void setAuthorDescription(String authorDescription) {
        this.authorDescription = authorDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return authorId == author.authorId && Objects.equals(authorName, author.authorName) && Objects.equals(nationality, author.nationality) && Objects.equals(birth, author.birth) && Objects.equals(authorDescription, author.authorDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorId, authorName, nationality, birth, authorDescription);
    }

    public static class Name {
        private String first;
        private String second;

        public Name() {
        }

        @Override
        public String toString() {
            return "Name{" +
                    "first='" + first + '\'' +
                    ", second='" + second + '\'' +
                    '}';
        }

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public String getSecond() {
            return second;
        }

        public void setSecond(String second) {
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Name name = (Name) o;
            return Objects.equals(first, name.first) && Objects.equals(second, name.second);
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }
    }

    public static class Birth {
        private String date;
        private String country;
        private String city;

        public Birth() {
        }

        @Override
        public String toString() {
            return "Birth{" +
                    "date='" + date + '\'' +
                    ", country='" + country + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Birth birth = (Birth) o;
            return Objects.equals(date, birth.date) && Objects.equals(country, birth.country) && Objects.equals(city, birth.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(date, country, city);
        }
    }
}
