import java.util.Scanner;
public class ConsandVow {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String");
        String str = sc.nextLine();
        int con = 0;
        int vow = 0;
        int sp = 0;

        for(int j=0;j<str.length();j++){
            if(str.charAt(j)=='a' || str.charAt(j)=='e' || str.charAt(j)=='i' || str.charAt(j)=='o' || str.charAt(j)=='u' || str.charAt(j)=='A' || str.charAt(j)=='E' || str.charAt(j)=='I' || str.charAt(j)=='O' || str.charAt(j)=='U'){
                vow++;
            }
            else if(str.charAt(j)==' '){
                sp++;
            }
            else{
                con++;
            }
        }
        sc.close();
        System.out.println("Consonent = "+con);
        System.out.println("Vowels = "+vow);
    }
}
