//Deƒine class for Complex number with real and imaginary as data members. Create its contructor, 
//overload the constructors. Also deƒne addition method to add two complex objects

//import java.util.Scanner;

public class Complexadd{
    public static void main(String[] args) {
        Complex n1 = new Complex(2.3,4.5);
        Complex n2 = new Complex(4,7);
        //n1.addition(num1.r, num1.i, num2.r, num2.i);
        Complex.addition(n1,n2);
    }
}
class Complex{
    double r,i;
    Complex(){
        r = 10;
        i = 10;
    }
    Complex(double real, double img){
        r = real;
        i = img;
    }
    static void addition(Complex n1, Complex n2){
        double real = n1.r+n1.i;
        double img = n2.r+n2.i;;
        System.out.println("Sum of two complex is : "+real +" + "+img +"i");
     }
}
