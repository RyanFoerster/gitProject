import java.util.ArrayList;
import java.util.List;

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

        List<Monstres> listMonster = new ArrayList<Monstres>();
        int max         = 0;
        int rand        = 0;


        if(randChoose == 1){
            Monstres feuFollet = new Monstres("FeuFollet", "Feu", 1, 20, 2);
            Monstres feuQuiBrule = new Monstres("FeuQuiBrule", "Feu", 1, 20, 2);
            listMonster.add(feuFollet);
            listMonster.add(feuQuiBrule);
            max = listMonster.size();
            rand = (int) (Math.random() * max);

            return listMonster.get(rand);
        }
        if(randChoose == 2){
            Monstres eauTacos = new Monstres("Eautacos", "Eau", 1, 20, 2);
            Monstres eauQuiDort = new Monstres("EauQuiDort", "Eau", 1, 20, 2);
            listMonster.add(eauTacos);
            listMonster.add(eauQuiDort);
            max = listMonster.size();
            rand = (int) (Math.random() * max);

            return listMonster.get(rand);
        }
        return null;
    }
}
