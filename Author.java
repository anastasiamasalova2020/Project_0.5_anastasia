//Задача-дать краткую биографию двух писателей
import java.util.Scanner;
public class Author {
    public static void author(String name){
        if(name.equals("Alexandre Dumas")) {
            System.out.println(" Alexandre Dumas was a French writer. His works have been translated into many languages, and he is one of the most widely read French authors.\n Many of his historical novels of high adventure were originally published as serials, including The Count of Monte Cristo, The Three Musketeers, Twenty Years After, and The Vicomte of Bragelonne: Ten Years Later.\n His novels have been adapted since the early twentieth century into nearly 200 films.s.\n Additional information u can find there: https://en.wikipedia.org/wiki/Alexandre_Dumas ");
        }else if(name.equals("Jules Gabriel Verne")){
            System.out.println(" Jules Gabriel Verne was a French novelist, poet, and playwright. \n His collaboration with the publisher Pierre-Jules Hetzel led to the creation of the Voyages extraordinaires,\n a series of bestselling adventure novels including Journey to the Center of the Earth (1864), Twenty Thousand Leagues Under the Sea (1870), and Around the World in Eighty Days (1872). \n Additional information u can find there: https://en.wikipedia.org/wiki/Jules_Verne");
        }
        else{
            System.out.println("We caught a mistake) change the spelling !");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of an author:Alexandre Dumas or Jules Gabriel Verne : ");
        String name=sc.nextLine();
        sc.close();
        author(name);

    }
}
