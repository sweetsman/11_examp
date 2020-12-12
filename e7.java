package example;

public class e7 {
    public static void main ( String [] args ) {
        Object object1=new e2(1);
        Object object2=new e3(1,1);

        displayObject(object1);
        displayObject(object2);
    }

    public static void displayObject(Object object){
        if(object instanceof e2){
            System.out.println("The circle area is "+
                    ((e2)object).getArea());
            System.out.println("The circle diameter is "+
                    ((e2)object).getDiameter());
        }
        else if(object instanceof e3){
            System.out.println("The rectangle area is "+
                    ((e3)object).getArea());
        }
    }
}
