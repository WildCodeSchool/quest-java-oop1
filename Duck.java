public class Duck {

    // attributes
    private String name;
    private int age;
    private boolean swimming;

    // constructors
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

    // static method
    public static String quack() {
        return "Quack!";
    }

    // instance method
    public String nameAndAge() {
        return "My name is " + this.getName() + " and I'm " + String.valueOf(this.getAge());
    }
    
    // getters
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public boolean isSwimming() {
        return this.swimming;
    }
    
    // setters
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
