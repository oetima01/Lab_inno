package Lab9;

class Dog extends Animal{
    public Dog(String name) {
        super("dog");
        this.get_name(name);
    }
    void bark(){
        System.out.println("Bark");
    }
}
