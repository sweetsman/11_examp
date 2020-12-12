package example;
//PolymorphismDemo
public class e5 {
    public static void main ( String [] args ) {
        displayObject ( new e2(1,"red",false));
        displayObject ( new e3(1,1,"black",true));
    }
    public static void displayObject (e1 object) {
        System.out.println("Created on "+object.getDateCreated()+
                ". Color is "+object.getColor());
    }
}
