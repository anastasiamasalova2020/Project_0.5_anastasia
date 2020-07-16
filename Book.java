//Задача - посчитать скидку на покупку книг в зависимости от их количества
import java.util.Scanner;
public class Book {
    public static int sale(int number){
        int K=0, MaxK=60;
        for(int i=0;i<number;i++){
            K+=6;
        }
        if(K>60){K=60;}
        return K;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of books that you want to buy: ");
        int number=sc.nextInt();
        sc.close();
        System.out.println("Your discount will be "+sale(number)+"%");
    }

}
