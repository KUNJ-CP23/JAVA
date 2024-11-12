//import java.util.Scanner;

class Area{
    //circle class area function
    double circle(int r){
        double ans = Math.PI*r*r;
        return ans;  
    }
    double rect(int l,int b){
        double answ;
        answ=l*b;
        return answ;
    }
}

public class Areas {
    public static void main(String[] args) {
        Area obj = new Area();
        //Scanner sc = new Scanner(System.in);
        double a1 = obj.circle(10);
        double a2 = areaOfCircle(10);
        double a3 = obj.rect(4,5);
        double a4 = areaOfRect(5, 6);
        System.out.println("Area of circle by func = "+a1);
        System.out.println("Area of circle by static = "+a2);
        System.out.println("Area of rectangle by func = "+a3);
        System.out.println("Area of rectangle by static = "+a4);
    }
    static double areaOfCircle(int r){
        double ans = Math.PI*r*r;
        return ans;
    }    
    static double areaOfRect(int l, int b) {
        double answ = l*b;
        return answ;
    } 
}