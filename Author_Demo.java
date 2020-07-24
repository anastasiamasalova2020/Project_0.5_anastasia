package by.literature.masalova;

public class Author_Demo implements Author_ {
    private String Surname;
    private String Nationality;
    private Genre_Demo MainGenre;


    public Author_Demo(String surname, String nationality, Genre_Demo mainGenre){
        this.Surname=surname;
        this.Nationality=nationality;
        this.MainGenre=mainGenre;
    }
    @Override
    public String toStringAuthor() {
        return "the author {" +
                "surname- " + getSurname() +
                ", nationality- " + getNationality() + ", main genre- " + getMainGenre() +
                '}';
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }


    public Genre_Demo getMainGenre() {
        return MainGenre;
    }

    public void setMainGenre(Genre_Demo mainGenre) {
        MainGenre = mainGenre;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }
}
