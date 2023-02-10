public class Combat{

    public static boolean combat(Monstres monster, Player player, Capacites userCapacites){

        boolean isAlive          = true;
        int userInputChoose      = -1;

        do{
            
            fonction.print("Nouveau combat contre : " + monster.nom + " - " + monster.level + " - " + monster.hp);
            fonction.print("Que voulez vous faire ?\n1. Attaquer\n2. Info sur le monstre\n3. Se soigner\n4. Fuir ");
            userInputChoose = fonction.entry(userInputChoose);

            while(userInputChoose != 1 && userInputChoose != 2 && userInputChoose != 3 && userInputChoose != 4){
                fonction.print("Choix inconnu");
                fonction.print("Que voulez vous faire ?\n1. Attaquer\n2. Info sur le monstre\n3. Se soigner\n4. Fuir ");
                userInputChoose = fonction.entry(userInputChoose);
            }

            if(userInputChoose == 1){
                fonction.print("Choisisser votre attaque : \n1. " + userCapacites.nom);
                    if(userCapacites.nom == "Lance flamme"){
                        monster.hp -= userCapacites.valeurAttaque;
                        userInputChoose = fonction.entry(userInputChoose);
                    }
                    if(monster.hp <= 0){
                        isAlive = false;
                        player.exp += (monster.level * 100) / 5;
                    }
            }
        }while (isAlive);

        fonction.print("Vous avez battu : " + monster.nom);
        fonction.print("Vous avez gagner : " + (monster.level * 100) / 5 + " expériences");

        return isAlive;
    }
}
