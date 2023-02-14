import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class App {
    public static void main(String[] args) throws Exception {

        char gender                     = ' ';
        String name                     = " ";
        String genderPlayer             = " ";
        String classChoose              = "-1";
        String element                  = " ";
        int choix                       = -1;
        int min                         = 1;
        int max                         = 5;
        int range                       = max - min + 1;
        int rand                        = 0;
        Capacites[] userCapacites       = new Capacites[2];
        Capacites[] monsterCapacites    = new Capacites[2];
        List<String> plateau            = new ArrayList<String>();
        boolean isFinish;




        fonction.print("Saisir votre nom");
        name = fonction.entry(name);

        while(gender != 'H' && gender != 'F'){
            fonction.print("Saississez votre genre (H) ou (F)");
            gender = fonction.entry(gender);
            if(gender == 'H'){
                genderPlayer = "Homme";
            }else{
                genderPlayer = "Femme";
            }
        }

        while(Integer.parseInt(classChoose) != 1 && Integer.parseInt(classChoose) != 2 && Integer.parseInt(classChoose) != 3 && Integer.parseInt(classChoose) != 4){
            fonction.print("Choisir votre classe : \n1. Feu\n2. Eau\n3. Terre\n4. Plante");
            classChoose = fonction.entry(classChoose);
        }
        element = elementPlayer.chooseElement(classChoose);
        

        Player player = new Player(name, genderPlayer, element);
        userCapacites[0] = Capacites.newCapacites(element, userCapacites);
        userCapacites[1] = Capacites.newCapacites(element, userCapacites);
        try {
            for(int i = 0; i < 10; i++){
                rand = (int) ((Math.random() * range) + min);
                if(rand == 5 && i != 0){
                    plateau.add("C");
                }else if (i == 0){
                    plateau.add("Y");
                }else{
                    plateau.add("_");
                }
            }
        }catch (NoClassDefFoundError e){
            fonction.print("Probleme");
        }

        do {
            if(plateau.get(plateau.indexOf("Y") + 1) == "_"){
                plateau.forEach(e -> System.out.print(e + "\t"));
                do{
                    fonction.print("Souhaitez vous avancer ? 1.Oui 2.Non");
                    choix = (int) fonction.entry(choix);
                }while (choix < 1 || choix > 1);

                fonction.print("Vous avez avancer sur une case vide ! ");
                plateau.set(plateau.indexOf("Y") + 1, "Y");
                plateau.set(plateau.indexOf("Y"), "_");

            }else if(plateau.get(plateau.indexOf("Y") + 1) == "C"){
                do {
                    System.out.println("\n");
                    fonction.print("Nom : " + player.name);
                    fonction.print("Element : " + player.element);
                    fonction.print("Niveau : " + player.level);
                    fonction.print("Hp : " + player.hp);
                    fonction.print("Force : " + player.force + "\n");
                    plateau.forEach(e -> System.out.print(e + "\t"));
                    fonction.print("\n");

                    Monstres monster = Monstres.newMonstres(2);
                    monsterCapacites[0] = Capacites.newCapacitesMonster(element, monsterCapacites, monster);
                    monsterCapacites[1] = Capacites.newCapacitesMonster(element, monsterCapacites, monster);


                    isFinish = Combat.combat(monster, player,userCapacites, monsterCapacites);
                    Player.lvlUp(player);
                    if(!isFinish){
                        plateau.set(plateau.indexOf("Y") + 1, "_");
                        break;
                    }
                }while(!isFinish);
            }
        }while(plateau.indexOf("Y") != plateau.size() - 1);

        plateau.forEach(e -> System.out.print(e + "\t"));

    }
}


