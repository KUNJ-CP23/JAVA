//c = f-32*5/9
import java.util.Scanner;
public class Tempconver {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Fahrenheit temperature = ");
        int f = sc.nextInt();
        System.out.print("Celcuis Temperature = "+((((double)f-32)*5))/9);
    }
}