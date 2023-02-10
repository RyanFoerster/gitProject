public class Capacites {
    String nom; 
    String element;
    int valeurAttaque;

    

    public Capacites(String nom, String element, int valeurAttaque){
        this.nom = nom;
        this.element = element;
        this.valeurAttaque = valeurAttaque;

    }

    public static Capacites newCapacites(String element){
        if(element == "Feu"){
            Capacites lanceFlamme = new Capacites("Lance flamme", "Feu", 100);
            //Capacites volcano = new Capacites("Volcano", "Feu", 5);
            return lanceFlamme;
        }

        return null;
    }


}
