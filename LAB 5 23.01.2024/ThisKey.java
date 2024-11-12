public class ThisKey {
    int variable;
    static int variable2 = 5;
    public ThisKey(int variable){    //constructor 
        this.variable = variable;    //this keyword
    }
    public void printInstanceVariable(){    //method to print instance
        System.out.println("Instance variable j this ni madad thi aavyo a = "+this.variable);
    }
    public static void printStaticVariable(){   //static print karavava
        System.out.println("Static Variable = "+ThisKey.variable2);
    }

    public static void main(String[] args){

        ThisKey obj = new ThisKey(23);     //Thiskey no instance banavyo
        obj.printInstanceVariable();       //instance method 
        
        ThisKey.printStaticVariable();     //static method call
    }

}

