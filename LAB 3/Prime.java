import java.util.Scanner;
public class Prime {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number = ");
        int n = sc.nextInt();
        int count = 0;
        for(int i=0;i>=n;i++){
            if(n%i==0){
                count++;
            }
            else{
                i++;
            }
        }
        if(count==2){
            System.out.print("Prime Number");
        }
        else{
            System.out.print("Not a Prime Number");
        }
    }
}