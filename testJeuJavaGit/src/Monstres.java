public class Monstres {
    String nom;
    String element;
    int level;
    int hp;
    int force;

    public Monstres(String nom, String element, int level, int hp, int force){
        this.nom        = nom;
        this.element    = element;
        this.level      = level;
        this.hp         = hp;
        this.force      = force;
    }

    public static Monstres newMonstres(int randChoose){
        if(randChoose == 1){
            Monstres monster = new Monstres("EauKiPik", "Feu", 1, 20, 2);
            return monster;
        }

        return null;
    }
}
