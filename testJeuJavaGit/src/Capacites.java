import java.util.Objects;

public class Capacites {
    String nom; 
    String element;
    int valeurAttaque;

    

    public Capacites(String nom, String element, int valeurAttaque){
        this.nom            = nom;
        this.element        = element;
        this.valeurAttaque  = valeurAttaque;

    }

    public static Capacites newCapacites(String element, Capacites[] userCapacites){
        if(element == "Feu" && userCapacites[0] == null ){
            Capacites lanceFlamme = new Capacites("Lance flamme", "Feu", 5);
            return lanceFlamme;
        }else if(element == "Feu" && userCapacites[0] != null){
            Capacites volcano = new Capacites("Volcano", "Feu", 5);
            return volcano;
        } else if(element == "Eau" && userCapacites[0] == null ){
            Capacites hydrocanon = new Capacites("Hydrocanon", "Eau", 5);
            return hydrocanon;
        }else if(element == "Eau" && userCapacites[0] != null){
            Capacites bulleDo = new Capacites("Bulle d'O", "Eau", 5);
            return bulleDo;
        } else if(element == "Terre" && userCapacites[0] == null ){
            Capacites seisme = new Capacites("Seisme", "Terre", 5);
            return seisme;
        }else if(element == "Terre" && userCapacites[0] != null){
            Capacites cailloux = new Capacites("Cailloux", "Terre", 5);
            return cailloux;
        } else if(element == "Plante" && userCapacites[0] == null ){
            Capacites graine = new Capacites("Graine", "Plante", 5);
            return graine;
        }else if(element == "Plante" && userCapacites[0] != null){
            Capacites rayonDeSoleil = new Capacites("Rayon de soleil", "Plante", 5);
            return rayonDeSoleil;
        }

        return null;
    }

    public static Capacites newCapacitesMonster(String element, Capacites[] monsterCapacites){
        if(Objects.equals(element, "Feu") && monsterCapacites[0] == null){
            Capacites braise = new Capacites("Braise", "Feu", 5);
            return braise;
        }else if(Objects.equals(element, "Feu") && monsterCapacites[0] == null){
            Capacites flammeche = new Capacites("Flammèche", "Feu", 5);
            return flammeche;
        }
        return  null;
    }
}
