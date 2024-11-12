
    public class TriStarPyramid{
        public static void main(String[] args){
            for(int i=0; i<5;i++){
                
                    int star = (i<=2)?i:(i*2)-i;
                    for(int j=0;j<=star;j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
    }
}