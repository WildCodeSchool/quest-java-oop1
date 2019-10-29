public class Pond {

    public static void main(String[] args) {

        // the riri reference receives a new instance of the Duck class
        Duck riri = new Duck("Riri", 8); 
        // use of getters        
        System.out.println("1. Duck name is : " + riri.getName());
        System.out.println("2. He was " + String.valueOf(riri.getAge()));
        
        // use of setter
        riri.setAge(9);
        System.out.println("3. Now he is " + String.valueOf(riri.getAge()));

        Duck fifi = new Duck("Fifi", 8);  
        System.out.println("4. Fifi swimming state was : " + String.valueOf(fifi.isSwimming()));
        fifi.setSwimming(true);
        System.out.println("5. Now his swimming state is : " + String.valueOf(fifi.isSwimming()));

        // instantiated method
        Duck loulou = new Duck("Loulou", 8);   
        System.out.println("6. " + loulou.nameAndAge());

        // static method
        System.out.println("7. What the duck says : " + Duck.quack());

        // two references to the same object
        Duck mysterMask = new Duck("Myster Mask");
        Duck albertColvert = mysterMask;

        // both point to the same memory space:
        albertColvert.setName("Albert Colvert");
        System.out.println("8. Myster Mask is : " + mysterMask.getName());
    }
}
