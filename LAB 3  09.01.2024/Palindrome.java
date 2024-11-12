import java.util.Scanner;
public class Palindrome {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number = ");
        String str = sc.next();
        String Newst = "";
        
        for(int i=str.length()-1;i>=0;i--){
        Newst = Newst + str.charAt(i);
    }
    if(str.equals(Newst)){
        System.out.print("Palindrome");
    }
    else{
        System.out.print("Not Palindrome");
    }
}
}