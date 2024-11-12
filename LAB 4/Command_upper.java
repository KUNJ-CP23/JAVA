//Write an application that searches through its command-line argument. If an argument 
//is found that does not begin with and upper case letter, display error message and terminate

public class Command_upper{
    public static void main(String[]args){
        String str = args[0];
        System.out.println("String = "+str);
        if(str.length()>0){
            char firstChar = str.charAt(0);
            if(str.charAt(0)=='A' || str.charAt(0)=='K'){
            //if(str.length() > 0 && !Character.isUpperCase(str.charAt(0))){
                System.out.println("Perfect");
            }
            else{
                System.out.println("Error");
            }
            System.out.println(str.toCharArray());
        }
    }
}