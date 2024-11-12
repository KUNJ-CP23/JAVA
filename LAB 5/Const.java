public class Const {
    public static void main(String[]args){

        Time t1 = new Time(5,70);
        Time t2 = new Time(5,20.6); 
        //decimal input hase to double vadi method execute thase, even koi ek bhi 

        System.out.println(t1.hr + ":" + t1.min + " + " + t2.hr + ":" + t2.min);     
        t1.addition(t1.hr, t2.hr, t1.min, t2.min);
        // static hoi time.addtime
    }
}
class Time{
    int hr,min;
    //Constructor, agar kaay value pass nay thay constructor vadi use thase
    Time(){
        hr = 12;
        min = 45;
    }
    //Scanner value and pela main method nu print thay che, flow of program
    Time(int h, int m){
        hr = h;
        min = m;
    }

    //not used as such, inputed value double hoi to
    Time(double h, double m){
        hr = 30;
        min = 21;
    }
    void addition(int h1, int h2, int m1, int m2){
        int h = h1+h2;
        int m = m1+m2;
        if(m>59){
            h++;
            m = m-60;
        }
        System.out.println(h+":"+m);
    }
}
