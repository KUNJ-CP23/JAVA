import java.util.Scanner;
public class Percentage {
    public static void main(String []args){
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter mark of subject 1 = ");
     int m1 = sc.nextInt();
     System.out.println("Enter marks of subject 2 = ");
     int m2 = sc.nextInt();
     System.out.println("Enter marks of subject 3 = ");
     int m3 = sc.nextInt();
     System.out.println("Enter marks of subject 4 = ");
     int m4 = sc.nextInt();
     System.out.println("Enter marks of subject 5 = ");
     int m5 = sc.nextInt();
    
     
     double p =  (((double) m1+m2+m3+m4+m5)/5)*100;

     if(p>=60){
        System.out.print("First Division");
     }
     else if(p>50){
        System.out.print("Second Division");
     }
      else if(p>40){
        System.out.print("Third Division");
     }
      else if(p<40){
        System.out.print("Fail");
     }

    }
    }
