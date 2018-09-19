public class Pond {

    public static void main(String[] args) {
        Duck loulou = new Duck("Loulou", 8);
        
        System.out.println("Duck name is : " + loulou.getName());
        System.out.println("He was " + String.valueOf(loulou.getAge()));
        loulou.setAge(9);
        System.out.println("Now he is " + String.valueOf(loulou.getAge()));

        System.out.println("Swimming state was : " + String.valueOf(loulou.isSwimming()));
        loulou.setSwimming(true);
        System.out.println("Now swimming state is : " + String.valueOf(loulou.isSwimming()));
    }
}