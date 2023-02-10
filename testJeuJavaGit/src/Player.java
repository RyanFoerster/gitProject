import java.util.ArrayList;

public class Player {
    String name;
    String genderPlayer;
    int classChoose;
    int level = 1;
    int exp = 0;
    String element;

    public Player(String name, String genderPlayer, String element){
        this.name = name;
        this.genderPlayer = genderPlayer;
        this.element = element;
    }

    public static ArrayList<String> attack(String element){
        ArrayList<String> attack = new ArrayList<String>();

        if(element == "Feu"){
            attack.add("Lance flamme");
            attack.add("Flammèche");
        }else if(element == "Eau"){
            attack.add("Hydrocanon");
            attack.add("Bulle d'O");
        }else if(element == "Terre"){
            attack.add("Seisme");
            attack.add("Cailloux");
        }else if (element == "Electrique"){
            attack.add("Tonnerre");
            attack.add("Câble électrique");
        }

        return attack;
    }
    
}
