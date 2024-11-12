import java.util.Scanner;
public class scanner {
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //obj name
        System.out.print("Enter name 1 : ");
        int a = sc.nextInt();
         System.out.print("Enter name 2 : ");
        int b = sc.nextInt();
        int sum = a+b;
         System.out.println("Sum : "+sum);
          System.out.println("Sum : "+a+b);
           System.out.println("Sum :  "+(a+b));
         sc.close();
     }
}
