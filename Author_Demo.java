package by.literature.masalova;

public class Author_Demo {
    private String surname;
    private String nationality;
    private Genre_Demo mainGenre;


    public Author_Demo(String surname, String nationality, Genre_Demo mainGenre){
        this.surname=surname;
        this.nationality=nationality;
        this.mainGenre=mainGenre;
    }
    
    public String toStringAuthor() {
        return "the author {" +
                "surname- " + getSurname() +
                ", nationality- " + getNationality() + ", main genre- " + getMainGenre() +
                '}';
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }


    public Genre_Demo getMainGenre() {
        return mainGenre;
    }

    public void setMainGenre(Genre_Demo mainGenre) {
        this.ainGenre = mainGenre;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
