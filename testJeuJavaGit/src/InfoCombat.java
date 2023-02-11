public class InfoCombat {
    
    public static void infoCombat(Player player, int userInputChoose, Capacites[] userCapacites, Monstres monster) {

        if(player.element == "Feu"){
            if(userInputChoose == 1){
                fonction.print("Vous attaquez : " + userCapacites[0].nom);
                if(monster.element == "Plante"){
                    fonction.print("C'est super efficace ! ");
                    monster.hp -= userCapacites[0].valeurAttaque * 2;
                }else if(monster.element == "Eau"){
                    fonction.print("C'est pas très efficace ! ");
                    monster.hp -= userCapacites[0].valeurAttaque / 2;
                }else{
                    monster.hp -= userCapacites[0].valeurAttaque;
                }
            }
        }

        if(player.element == "Eau"){
            if(userInputChoose == 1){
                fonction.print("Vous attaquez : " + userCapacites[0].nom);
                if(monster.element == "Feu"){
                    fonction.print("C'est super efficace ! ");
                    monster.hp -= userCapacites[0].valeurAttaque * 2;
                }else if(monster.element == "Plante"){
                    fonction.print("C'est pas très efficace ! ");
                    monster.hp -= userCapacites[0].valeurAttaque / 2;
                }else{
                    monster.hp -= userCapacites[0].valeurAttaque;
                }
            }
        }

        if(player.element == "Terre"){
            if(userInputChoose == 1){
                fonction.print("Vous attaquez : " + userCapacites[0].nom);
                 if(monster.element == "Plante"){
                    fonction.print("C'est pas très efficace ! ");
                    monster.hp -= userCapacites[0].valeurAttaque / 2;
                }else{
                    monster.hp -= userCapacites[0].valeurAttaque;
                }
            }
        }

        if(player.element == "Plante"){
            if(userInputChoose == 1){
                fonction.print("Vous attaquez : " + userCapacites[0].nom);
                if(monster.element == "Terre"){
                    fonction.print("C'est super efficace ! ");
                    monster.hp -= userCapacites[0].valeurAttaque * 2;
                }else if(monster.element == "Feu"){
                    fonction.print("C'est pas très efficace ! ");
                    monster.hp -= userCapacites[0].valeurAttaque / 2;
                }else{
                    monster.hp -= userCapacites[0].valeurAttaque;
                }
            }
        }
    }
}
