//Задача-порекоммендовать читателю книги его любого жанра
import java.util.Scanner;
public class Ganre {
    public static void link(String ganre){
        if(ganre.equals("Fantasy")){
            System.out.println("Visit this page: https://www.nerdmuch.com/best-fantasy-books/ - to find a new book of fantasy to read.");}
        else if (ganre.equals("Poetry")){
                System.out.println("Visit this page: https://www.goodreads.com/list/show/36.Best_Poetry_Books - to find a new book of poetry to read.");
            }
        else if (ganre.equals("Drama")){
            System.out.println("Visit this page: https://www.inkitt.com/genres/drama - to find a new book of drama to read.");
        }
        else{System.out.println("Visit this page: https://www.theguardian.com/books/2017/dec/31/the-100-best-nonfiction-books-of-all-time-the-full-list - to find a new book of non-fiction to read.");}

    }
}
