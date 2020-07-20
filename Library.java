//Задача-посчитать окончательную стоимость входа в библиотеку(а почему бы и да)
import java.util.Scanner;
public class Library {
    public static void price(double initial_price,double coefficient){
        double result=initial_price * coefficient;
        System.out.println("Your final price is "+result);
    }
}
