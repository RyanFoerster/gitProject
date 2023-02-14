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
        if(Objects.equals(element, "Feu") && userCapacites[0] == null ){
            Capacites lanceFlamme = new Capacites("Lance flamme", "Feu", 5);
            return lanceFlamme;
        }else if(Objects.equals(element, "Feu") && userCapacites[0] != null){
            Capacites volcano = new Capacites("Volcano", "Feu", 5);
            return volcano;
        } else if(Objects.equals(element, "Eau") && userCapacites[0] == null ){
            Capacites hydrocanon = new Capacites("Hydrocanon", "Eau", 5);
            return hydrocanon;
        }else if(Objects.equals(element, "Eau") && userCapacites[0] != null){
            Capacites bulleDo = new Capacites("Bulle d'O", "Eau", 5);
            return bulleDo;
        } else if(Objects.equals(element, "Terre") && userCapacites[0] == null ){
            Capacites seisme = new Capacites("Seisme", "Terre", 5);
            return seisme;
        }else if(Objects.equals(element, "Terre") && userCapacites[0] != null){
            Capacites cailloux = new Capacites("Cailloux", "Terre", 5);
            return cailloux;
        } else if(Objects.equals(element, "Plante") && userCapacites[0] == null ){
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
        }else if(Objects.equals(element, "Feu") && monsterCapacites[0] != null){
            Capacites flammeche = new Capacites("Flammèche", "Feu", 5);
            return flammeche;
        }else if (Objects.equals(element, "Eau") && Objects.equals(monsterCapacites[0], null)){
            Capacites canonDeau = new Capacites("Canon d'eau", "Eau", 5);
            return canonDeau;
        }else if(Objects.equals(element, "Eau") && monsterCapacites[0] != null){
            Capacites piscine = new Capacites("Piscine", "Eau", 5);
            return piscine;
        } else if (Objects.equals(element, "Terre") && monsterCapacites[0] == null) {
            Capacites plaqueTecto = new Capacites("Plaque tectonique", "Terre", 5);
            return plaqueTecto;
        } else if (Objects.equals(element, "Terre") && monsterCapacites[0] != null) {
            Capacites tunnel = new Capacites("Tunnel", "Terre", 5);
            return tunnel;
        } else if (Objects.equals(element, "Plante") && monsterCapacites[0] == null) {
            Capacites graine = new Capacites("Graine", "Plante", 5);
            return graine;
        } else if (Objects.equals(element, "Plante") && monsterCapacites[0] != null) {
            Capacites lanceTerre = new Capacites("Lance terre", "Plante", 5);
            return lanceTerre;
        }
        return  null;
    }
}
