//Задача-посчитать окончательную стоимость входа в библиотеку(а почему бы и да)
import java.util.Scanner;
public class Library {
    public static void price(double initial_price,double coefficient){
        double result=initial_price * coefficient;
        System.out.println("Your final price is "+result);
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial price of entrance fee to library: ");
        double ip=sc.nextDouble();
        System.out.println("Enter the governmental tax(coefficient) : ");
        double cf=sc.nextDouble();
        sc.close();
        price(ip,cf);
    }
}
