import java.util.Scanner;

public class fonction {
    public static void print(String str){
        System.out.println(str);
    }

    public static int entry(int entry){
        entry = new Scanner(System.in).nextInt();
        return entry;
    }

    public static String entry(String entry){
        entry = new Scanner(System.in).nextLine();
        return entry;
    }

    public static char entry(char entry){
        entry = new Scanner(System.in).nextLine().toUpperCase().charAt(0);
        return entry;
    }

}
