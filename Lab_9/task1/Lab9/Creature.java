package Lab9;

abstract class Creature {
    String name = null;
    boolean isAlive = false;
    abstract void bear();
    abstract void die();
    void shoutName(){
        if (name != null){
            System.out.println("Name: " + name);
        }
        else{
            System.out.println("Error: Not have name");
        }
    }
    void get_name(String nm){
        name = nm;
    }
    String take_name(){
        return name;
    }
}
