public class ObjectCount {
    static int objectCount = 0; // ek Static variable object count karva 

    public ObjectCount(){
        objectCount++;

    }

    //ek Static method , total ketla object create thya a return karva maate
    public static int getObjectCount() {
        return objectCount;
    }
     
    public static void main(String[] args) {
        // aaya objs banavya
        ObjectCount obj1 = new ObjectCount();
        ObjectCount obj2 = new ObjectCount();
        ObjectCount obj3 = new ObjectCount();
        ObjectCount obj4 = new ObjectCount();

        System.out.println("Total number of objects created: " + ObjectCount.getObjectCount());
    }
}








        // public ObjectCount() {     //constructor
        // // Increment objectCount jyare jyare object create thay tyare
        // objectCount++;
        //  }