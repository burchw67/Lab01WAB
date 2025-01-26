import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        int indexInt = 0;
        int altInt = 0;

        String choice = "x";
        String introString = "Welcome to the Arraylist Menu System\n" +
                "Author: William A. Burch\n" +
                "A Basic Menu System\n" +
                "1. Add an item\n" +
                "2. Change an item\n" +
                "3. Delete an item\n" +
                "4. Print the list\n" +
                "5. Quit\n";


        System.out.println(introString); // Print introduction string

        Scanner inp = new Scanner(System.in); // Create scanner

        System.out.print("Enter your choice:");
        choice = inp.nextLine();
        System.out.println(choice);
    }
}