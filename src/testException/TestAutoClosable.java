package testException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestAutoClosable {

    public static void main(String[] args) {
        avant();
        maintenant();
    }

    public static void avant() {
        File file = new File("coucou.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("TestAutoClosable.main");
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    private static void maintenant() {                                          //Gère automatiquement le finally qui ferme le scanner et le fichier coucou.txt
        File file = new File("coucou.txt");
        try(Scanner scanner = new Scanner(file))
        {
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
