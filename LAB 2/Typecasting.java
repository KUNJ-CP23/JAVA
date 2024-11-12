import java.util.Scanner;
public class Typecasting {
    public static void main(String[]args){
        Scanner per = new Scanner(System.in);
        System.out.println("Enter marks of sub1 = ");
         int sub1 = per.nextInt();
         System.out.println("Enter marks of sub2 = ");
         int sub2 = per.nextInt();
         System.out.println("Enter marks of sub3 = ");
         Double sub3 = per.nextDouble();
         System.out.println("Percentage : "+(((sub1+sub2+sub3)/300)*100));
    }
}
