import java.util.ArrayList;

public class Combat{

    public static boolean combat(Monstres monster, Player player, Capacites[] userCapacites, Capacites[] monsterCapacites){

        boolean isAlive          = true;
        boolean userAlive        = true;
        int userInputChoose      = -1;
        int userHeal             = 3;
        int min                  = 1;
        int max                  = 5;
        int range                = max -min + 1; 
        int rand                 = 0;

        fonction.print("Nouveau combat contre : " + monster.nom + " - Lvl " + monster.level + " - Hp " + monster.hp);
        do{
            
            fonction.print(monster.nom + " - Lvl " + monster.level + " - Hp " + monster.hp);
            fonction.print(player.name + " - Lvl " + player.level + " - Hp " + player.hp);
            fonction.print("Que voulez vous faire ?\n1. Attaquer\n2. Info sur le monstre\n3. Se soigner\n4. Fuir ");
            userInputChoose = fonction.entry(userInputChoose);

            while(userInputChoose != 1 && userInputChoose != 2 && userInputChoose != 3 && userInputChoose != 4){
                fonction.print("Choix inconnu");
                fonction.print("Que voulez vous faire ?\n1. Attaquer\n2. Info sur le monstre\n3. Se soigner\n4. Fuir ");
                userInputChoose = fonction.entry(userInputChoose);
            }

            if(userInputChoose == 1){
                fonction.print("Choisisser votre attaque : \n1. " + userCapacites[0].nom + "\n2. " + userCapacites[1].nom);
                userInputChoose = fonction.entry(userInputChoose);

                InfoCombat.infoCombat(player, userInputChoose, userCapacites, monster);
                InfoCombat.infoCombatMonster(monster, monsterCapacites, player );
                userInputChoose = 0;
                if(monster.hp <= 0){
                    isAlive = false;
                    player.exp += (monster.level * 100) / 5;
                }
            }

            if(userInputChoose == 2){
                InfoMonster.infoMonster(monster);
                userInputChoose = 0;
            }

            if(userInputChoose == 3){
                if(userHeal > 0){
                    player.hp += 50;
                    if(player.hp > 100){
                        player.hp = 100;
                    }
                }else{
                    fonction.print("Vous n'avez plus de quoi vous soigner ! ");
                }
                userHeal--;
                userInputChoose = 0;
            }

            if(userInputChoose == 4){
                rand = (int) (Math.random() * range) + min;
                if(rand == 5){
                    fonction.print("Vous n'avez pas réussi à fuir ! ");
                }else{
                    break;
                }
                userInputChoose = 0;
            }

            if(userInputChoose == 1){

            }

        }while (isAlive || userAlive);

        if(isAlive == false){
            fonction.print("Vous avez battu : " + monster.nom);
            fonction.print("Vous avez gagner : " + (monster.level * 100) / 5 + " expériences");
        }else if(userAlive == false){
            fonction.print("Vous avez été battu par : " + monster.nom);
        }else if(rand != 5){
            fonction.print("Vous avez fui !");
        }
       

        return isAlive;
    }
}
