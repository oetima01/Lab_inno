package Lab9;

class Alien extends Creature{
    public Alien(String name) {
        this.get_name(name);
    }
    void bear() {
        System.out.println("The Alien " + name + " was born!");
    }
    void die() {
        System.out.println("The Alien " + name + " has died");
    }
}
