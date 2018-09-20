public class Pond {

    public static void main(String[] args) {

        // la référence riri reçoit une nouvelle instance de la classe Duck
        Duck riri = new Duck("Riri", 8); 
        // utilisation de getters      
        System.out.println("1. Duck name is : " + riri.getName());
        System.out.println("2. He was " + String.valueOf(riri.getAge()));
        
        // utilisation d'un setter
        riri.setAge(9);
        System.out.println("3. Now he is " + String.valueOf(riri.getAge()));

        Duck fifi = new Duck("Fifi", 8);  
        System.out.println("4. Fifi swimming state was : " + String.valueOf(fifi.isSwimming()));
        fifi.setSwimming(true);
        System.out.println("5. Now his swimming state is : " + String.valueOf(fifi.isSwimming()));

        // méthode instanciée
        Duck loulou = new Duck("Loulou", 8);   
        System.out.println("6. " + loulou.nameAndAge());

        // méthode statique
        System.out.println("7. What the duck says : " + Duck.quack());

        // deux références vers un même objet
        Duck mysterMask = new Duck("Myster Mask");
        Duck albertColvert = mysterMask;

        // les deux pointent vers le même espace mémoire :
        albertColvert.setName("Albert Colvert");
        System.out.println("8. Myster Mask is : " + mysterMask.getName());
    }
}