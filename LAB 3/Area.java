import java.util.Scanner;
public class Area {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter radius of circle = ");
        int r = sc.nextInt();
        System.out.print("Area = "+((double)r*r*Math.PI));
    }
}