import java.util.ArrayList;
import java.util.Objects;

public class Player {
    int level           = 1;
    int exp             = 0;
    int hp              = 100;
    int force           = 10;
    String name;
    String genderPlayer;
    String element;

    public Player(String name, String genderPlayer, String element){
        this.name           = name;
        this.genderPlayer   = genderPlayer;
        this.element        = element;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenderPlayer() {
        return this.genderPlayer;
    }

    public void setGenderPlayer(String genderPlayer) {
        this.genderPlayer = genderPlayer;
    }
    public String getElement() {
        return this.element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public static ArrayList<String> attack(String element){
        ArrayList<String> attack = new ArrayList<String>();

        if(Objects.equals(element, "Feu")){
            attack.add("Lance flamme");
            attack.add("Flammèche");
        }else if(Objects.equals(element, "Eau")){
            attack.add("Hydrocanon");
            attack.add("Bulle d'O");
        }else if(Objects.equals(element, "Terre")){
            attack.add("Seisme");
            attack.add("Cailloux");
        }else if (Objects.equals(element, "Plante")){
            attack.add("Graine");
            attack.add("Rayon de soleil");
        }

        return attack;
    }

    public static boolean lvlUp(Player player){
        boolean lvlUp = false;
        if(player.exp >= 100){
            lvlUp = true;
            fonction.print("Vous êtes montés de lvl ! ");
            player.force *= 1.2;
            player.level++;
        }
        return  lvlUp;
    }
}
