//Write a program to ƒind length of string and print second half of the string.
import java.util.Scanner;
public class Length_secondhalf{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        //String st = "Kavan";
        System.out.println(str.length());
        int n = str.length();
        String st2 = "";
        for(int i = n/2;i<n;i++){
            st2 = st2 + str.charAt(i);
        }
        System.out.println(st2);
        sc.close();
    }
}