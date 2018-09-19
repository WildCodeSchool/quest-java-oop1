public class Duck {

	private String name;
	private int age;
	private boolean swimming;

	Duck(String name) {
		this.name = name;
		this.age = 0;
		this.swimming = false;
	}

	Duck(String name, int age) {
		this.name = name;
		this.age = age;
		this.swimming = false;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public boolean isSwimming() {
        return this.swimming;
    }
    
    public void setSwimming(boolean swimming) {
        this.swimming = swimming;
    }
}