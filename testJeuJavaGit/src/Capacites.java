public class Capacites {
    String nom; 
    String element;
    int valeurAttaque;

    Capacites lanceFlamme = new Capacites("Lance flamme", "Feu", 5);

    public Capacites(String nom, String element, int valeurAttaque){
        this.nom = nom;
        this.element = element;
        this.valeurAttaque = valeurAttaque;
    }


}
