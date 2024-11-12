//Write a program that creates and initializes a four integer element array.
// Calculate and display the average of its values.
import java.util.Scanner;
public class Averageof4{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [4];
        int i, sum=0;
        for(i=0;i<arr.length;i++){
            System.out.print("Enter the number = ");
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("Average = "+(double)sum/4);
    }
}