//Write a program to print given array in reverse order.
import java.util.Scanner;
    public class Reverseofarray{
        public static void main(String []args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the size of array = ");
            int n = sc.nextInt();

            String arr[] = new String[n];

            for(int i=0;i<n;i++){
                System.out.println("Element "+(i+1)+": ");
                arr[i] = sc.next();
            }
            
            for(int i=n-1;i>=0;i--){           //if array size fixed just replace n with arr.length
                System.out.println(""+arr[i]);
            }
        }
    }
