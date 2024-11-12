import java.util.Scanner;
public class Calculator {
    public static void main(String []args){
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter number 1 = ");
     int a = sc.nextInt();
     System.out.println("Enter number 2 = ");
     int b = sc.nextInt();
     System.out.println("Enter character = ");
     char ch = sc.next().charAt(0);

     switch(ch){
        case('+'):{
            System.out.print("Addition = "+(a+b));
            break;
     }
      case('-'):{
            System.out.print("Subtraction = "+(a-b));
            break;
     }
      case('*'):{
            System.out.print("Multiplication = "+(a*b));
            break;
     }
      case('/'):{
            System.out.print("Addition = "+((double)a/b));
            break;
     }
     default:{
        System.out.print("Enter Valid Operator");
        break;
     }
    }
    }
}
