package Lab9;

class Animal extends Creature{
    String type = null;
    public Animal(String type) {
        this.type = type;
    }
    void bear() {
        System.out.println("The " + type + " " + name + " was born!");
    }
    void die() {
        System.out.println("The " + type + " " + name + " has died");
    }
}
