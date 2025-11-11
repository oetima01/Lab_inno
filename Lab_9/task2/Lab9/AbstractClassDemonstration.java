package Lab9;
import java.util.Scanner;

public class AbstractClassDemonstration {
    public static void main (String args[]) {
        System.out.println("Write numbers of creatures");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        Creature[] creatures = new Creature[n];
        String tp = "", nm = "";
        boolean rab = true;
        for (int i = 0; i < n; i++){
            System.out.println("Write type of creature(Human, Dog, Alien)");
            tp = scan.nextLine();
            System.out.println("Write name of creature");
            nm = scan.nextLine();
            switch (tp) {
                case "Human" -> {
                    creatures[i] = new Human(nm);
                    break;
                }
                case "Dog" -> {
                    creatures[i] = new Dog(nm);
                    break;
                }
                case "Alien" -> {
                    creatures[i] = new Alien(nm);
                    break;
                }
                default -> {
                    System.out.println("Error: incorrect input");
                    rab = false;
                }
            }
            if (!rab){
                break;
            }
        }
        if (rab){
            System.out.println("Write number of commands");
            int nk = scan.nextInt(), k = 0;
            scan.nextLine();
            String com = "";
            for (int i = 0; i < nk; i++){
                System.out.println("Write name of creature");
                nm = scan.nextLine();
                k = -1;
                for (int j = 0; j < n; j++){
                    if (nm.equals(creatures[j].take_name())){
                        k = j;
                        break;
                    }
                }
                if (k != -1) {
                    System.out.println("Write command");
                    com = scan.nextLine();
                    switch (com) {
                        case "bear" -> {
                            creatures[k].bear();
                        }
                        case "die" -> {
                            creatures[k].die();
                        }
                        case "bark" -> {
                            ((Dog) creatures[k]).bark();
                        }
                        case "shoutName" -> {
                            creatures[k].shoutName();
                        }
                        default -> {
                            System.out.println("Error: incorrect input");
                        }
                    }
                }
                else {
                    System.out.println("Error: wrong name of creature");
                }
            }
        }
    }
}
