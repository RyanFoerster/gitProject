import java.util.Objects;

public class InfoMonster {
    public static void infoMonster(Monstres monster) {
        fonction.print("\nSon nom : " + monster.nom);
        fonction.print("Son élément : " + monster.element);
        fonction.print("Son niveau : " + monster.level);
        fonction.print("Nombres d'hp : " + monster.hp);
        fonction.print("Stats en force : " + monster.force);

        if(Objects.equals(monster.element, "Feu")){
            fonction.print("Sa faiblesse est le type eau\n");
        }else if (Objects.equals(monster.element, "Eau")){
            fonction.print("Sa faiblesse est le type plante\n");
        }else if (Objects.equals(monster.element, "Terre")){
            fonction.print("Sa faiblesse est le type plante\n");
        } else{
            fonction.print("Sa faiblesse est le type feu\n");
        }
    }
}
