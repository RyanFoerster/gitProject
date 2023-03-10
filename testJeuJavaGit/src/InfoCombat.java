import java.util.Objects;

public class InfoCombat {
    
    public static void infoCombat(Player player, int userInputChoose, Capacites[] userCapacites, Monstres monster) {

        if(Objects.equals(player.element, "Feu")){
            if(userInputChoose == 1){
                fonction.print("Vous attaquez : " + userCapacites[0].nom);
                if(Objects.equals(monster.element, "Plante")){
                    fonction.print("C'est super efficace ! ");
                    monster.hp -= ((userCapacites[0].valeurAttaque * player.force)/8) * 2;
                }else if(Objects.equals(monster.element, "Eau")){
                    fonction.print("C'est pas très efficace ! ");
                    monster.hp -= ((userCapacites[0].valeurAttaque * player.force)/8) / 2;
                }else{
                    monster.hp -= (userCapacites[0].valeurAttaque * player.force)/8;
                }
            }
            if(userInputChoose == 2){
                fonction.print("Vous attaquez : " + userCapacites[1].nom);
                if(Objects.equals(monster.element, "Plante")){
                    fonction.print("C'est super efficace ! ");
                    monster.hp -= ((userCapacites[1].valeurAttaque * player.force)/8) * 2;
                }else if(Objects.equals(monster.element, "Eau")){
                    fonction.print("C'est pas très efficace ! ");
                    monster.hp -=((userCapacites[1].valeurAttaque * player.force)/8) / 2;
                }else{
                    monster.hp -= ((userCapacites[1].valeurAttaque * player.force)/8);
                }
            }
        }

        if(Objects.equals(player.element, "Eau")){
            if(userInputChoose == 1){
                fonction.print("Vous attaquez : " + userCapacites[0].nom);
                if(Objects.equals(monster.element, "Feu")){
                    fonction.print("C'est super efficace ! ");
                    monster.hp -= ((userCapacites[0].valeurAttaque * player.force)/8) * 2;
                }else if(Objects.equals(monster.element, "Plante")){
                    fonction.print("C'est pas très efficace ! ");
                    monster.hp -= ((userCapacites[0].valeurAttaque * player.force)/8) / 2;
                }else{
                    monster.hp -= (userCapacites[0].valeurAttaque * player.force) / 8;
                }
            }
            if(userInputChoose == 2){
                fonction.print("Vous attaquez : " + userCapacites[1].nom);
                if(Objects.equals(monster.element, "Feu")){
                    fonction.print("C'est super efficace ! ");
                    monster.hp -= ((userCapacites[1].valeurAttaque * player.force)/8) * 2;
                }else if(Objects.equals(monster.element, "Plante")){
                    fonction.print("C'est pas très efficace ! ");
                    monster.hp -= ((userCapacites[1].valeurAttaque * player.force)/8) / 2;
                }else{
                    monster.hp -= (userCapacites[1].valeurAttaque * player.force)/8;
                }
            }
        }

        if(Objects.equals(player.element, "Terre")){
            if(userInputChoose == 1){
                fonction.print("Vous attaquez : " + userCapacites[0].nom);
                 if(Objects.equals(monster.element, "Plante")){
                    fonction.print("C'est pas très efficace ! ");
                    monster.hp -= ((userCapacites[0].valeurAttaque * player.force)/8) / 2;
                }else{
                    monster.hp -= (userCapacites[0].valeurAttaque * player.force)/8;
                }
            }
            if(userInputChoose == 2){
                fonction.print("Vous attaquez : " + userCapacites[1].nom);
                if(Objects.equals(monster.element, "Plante")){
                    fonction.print("C'est pas très efficace ! ");
                    monster.hp -= ((userCapacites[1].valeurAttaque * player.force)/8) / 2;
                }else{
                    monster.hp -= (userCapacites[1].valeurAttaque * player.force)/8;
                }
            }
        }

        if(Objects.equals(player.element, "Plante")){
            if(userInputChoose == 1){
                fonction.print("Vous attaquez : " + userCapacites[0].nom);
                if(Objects.equals(monster.element, "Terre")){
                    fonction.print("C'est super efficace ! ");
                    monster.hp -= ((userCapacites[0].valeurAttaque * player.force)/8) * 2;
                }else if(Objects.equals(monster.element, "Feu")){
                    fonction.print("C'est pas très efficace ! ");
                    monster.hp -= ((userCapacites[0].valeurAttaque * player.force)/8) / 2;
                }else{
                    monster.hp -= (userCapacites[0].valeurAttaque * player.force)/8;
                }
            }
            if(userInputChoose == 2){
                fonction.print("Vous attaquez : " + userCapacites[1].nom);
                if(Objects.equals(monster.element, "Terre")){
                    fonction.print("C'est super efficace ! ");
                    monster.hp -= ((userCapacites[1].valeurAttaque * player.force)/8) * 2;
                }else if(Objects.equals(monster.element, "Feu")){
                    fonction.print("C'est pas très efficace ! ");
                    monster.hp -= ((userCapacites[1].valeurAttaque * player.force)/8) / 2;
                }else{
                    monster.hp -= (userCapacites[1].valeurAttaque * player.force)/8;
                }
            }
        }
    }

    public static void infoCombatMonster(Monstres monstres, Capacites[] monsterCapacites, Player player){

        int range                = 2;
        int min                  = 1;
        int rand;
        rand = (int) (Math.random() * range) + min;

        if(Objects.equals(monstres.element, "Feu")){
            if(rand == 1){
                fonction.print(monstres.nom + " attaque : " + monsterCapacites[0].nom);
                if(Objects.equals(player.element, "Plante")){
                    fonction.print("C'est super efficace ! ");
                    player.hp -= ((monsterCapacites[0].valeurAttaque * monstres.force) /5) * 2;
                }else if(Objects.equals(player.element, "Eau")){
                    fonction.print("C'est pas très efficace ! ");
                    player.hp -= ((monsterCapacites[0].valeurAttaque * monstres.force) /5) / 2;
                }else{
                    player.hp -= monsterCapacites[0].valeurAttaque * monstres.force /5;
                }
            }
            if(rand == 2){
                fonction.print(monstres.nom + " attaque : " + monsterCapacites[1].nom);
                if(Objects.equals(player.element, "Plante")){
                    fonction.print("C'est super efficace ! ");
                    player.hp -= ((monsterCapacites[1].valeurAttaque * monstres.force) /5) * 2;
                }else if(Objects.equals(player.element, "Eau")){
                    fonction.print("C'est pas très efficace ! ");
                    player.hp -= ((monsterCapacites[1].valeurAttaque * monstres.force) /5) / 2;
                }else{
                    player.hp -= (monsterCapacites[1].valeurAttaque * monstres.force) /5;
                }
            }
        }

        if(Objects.equals(monstres.element, "Eau")){
            if(rand == 1){
                fonction.print(monstres.nom + " attaque : " + monsterCapacites[0].nom);
                if(Objects.equals(player.element, "Feu")){
                    fonction.print("C'est super efficace ! ");
                    player.hp -= ((monsterCapacites[0].valeurAttaque * monstres.force) /5) * 2;
                }else if(Objects.equals(player.element, "Plante")){
                    fonction.print("C'est pas très efficace ! ");
                    player.hp -= ((monsterCapacites[0].valeurAttaque * monstres.force) /5) / 2;
                }else{
                    player.hp -= monsterCapacites[0].valeurAttaque * monstres.force /5;
                }
            }
            if(rand == 2){
                fonction.print(monstres.nom + " attaque : " + monsterCapacites[1].nom);
                if(Objects.equals(player.element, "Feu")){
                    fonction.print("C'est super efficace ! ");
                    player.hp -= ((monsterCapacites[1].valeurAttaque * monstres.force) /5) * 2;
                }else if(Objects.equals(player.element, "Plante")){
                    fonction.print("C'est pas très efficace ! ");
                    player.hp -= ((monsterCapacites[1].valeurAttaque * monstres.force) /5) / 2;
                }else{
                    player.hp -= (monsterCapacites[1].valeurAttaque * monstres.force) /5;
                }
            }
        }
    }
}
