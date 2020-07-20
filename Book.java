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
}
