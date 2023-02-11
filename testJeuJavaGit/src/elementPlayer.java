import java.util.function.IntFunction;
import java.lang.*;

public class elementPlayer{
    public static String chooseElement(String classChoose){
        String element = " ";
        if(Integer.parseInt(classChoose) == 1){
            element = "Feu";
        }else if(Integer.parseInt(classChoose) == 2){
            element = "Eau";
        }else if (Integer.parseInt(classChoose) == 3){
            element = "Terre";
        }else if (Integer.parseInt(classChoose) == 4){
            element = "Plante";
        }
        return element;
    }
}