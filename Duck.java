public class Duck {

    // attributs
    private String name;
    private int age;
    private boolean swimming;

    // constructeurs
    public Duck(String name) {
        this.name = name;
        this.age = 0;
        this.swimming = false;
    }

    public Duck(String name, int age) {
        this.name = name;
        this.age = age;
        this.swimming = false;
    }

    // méthode statique
    public static String quack() {
        return "Quack!";
    }

    // méthode instanciée
    public String nameAndAge() {
        return "My name is " + this.getName() + " and I'm " + String.valueOf(this.getAge());
    }
    
    // accesseurs (getters)
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public boolean isSwimming() {
        return this.swimming;
    }
    
    // mutateurs (setters)
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setSwimming(boolean swimming) {
        this.swimming = swimming;
    }
}