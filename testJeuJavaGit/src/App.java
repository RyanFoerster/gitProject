import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        String name = " ";
        char gender = ' ';
        String genderPlayer = " ";
        String classChoose = "-1";
        String element = " ";

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
            fonction.print("Choisir votre classe : \n1. Feu\n2. Eau\n3. Terre\n4. Electrique");
            classChoose = fonction.entry(classChoose);
        }
        element = elementPlayer.chooseElement(classChoose);

        Player player = new Player(name, genderPlayer, element);

        fonction.print(player.name + " - " + player.genderPlayer + " - " + player.element + " - " + (player.level));

    }

    

    
}


