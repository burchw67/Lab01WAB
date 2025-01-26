import java.util.ArrayList;
import java.util.Scanner;

public class Lab01MenuWAB {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        int indexInt = 0;
        int altInt = 0;

        //Strings for choice selection, quit confirmation, and introduction
        String choice = "x";
        String quit = "N";
        String introString = "Welcome to the Arraylist Menu System\n" +
                "Author: William A. Burch\n" +
                "Using ArrayLists\n" +
                "1. Place an element at the beginning of the ArrayList\n" +
                "2. Place an element at the end of the ArrayList\n" +
                "3. Remove an element from the beginning of the ArrayList\n" +
                "4. Remove an element from the end of the ArrayList\n" +
                "5. Examine the element at the beginning of the ArrayList\n" +
                "6. Examine the element at the end of the ArrayList\n" +
                "7. Check if the ArrayList is empty\n" +
                "8. Get the current size of the ArrayList\n" +
                "9. Clear the ArrayList\n" +
                "10. Print the contents of the ArrayList\n" +
                "11. Quit\n" +
                "\nEnter your choice:";


        Scanner inp = new Scanner(System.in); // Create scanner

        while(quit.charAt(0) != 'Y')
        {
            System.out.print(introString); // Print introduction string
            choice = inp.nextLine();

            switch(choice)
            {
                case "1":
                    System.out.print("Enter an integer to add: ");

                    //Take in integer as string, cast to int and add to array list
                    arrList.add(Integer.parseInt(inp.nextLine()));
                    break;

                case "2":
                    if(arrList.size() == 0)
                    {
                        System.out.println("You cannot change data in an empty list!");
                    }
                    else
                    {
                        System.out.print("Enter a position to change: ");
                        indexInt = Integer.parseInt(inp.nextLine());

                        if(indexInt < 0 || indexInt > arrList.size() - 1)
                        {

                            System.out.println("Invalid position! Try again");
                        }
                        else
                        {
                            System.out.print("Enter the new data: ");
                            altInt = Integer.parseInt(inp.nextLine());

                            System.out.println(arrList.get(indexInt) + " becomes " + altInt);
                            arrList.set(indexInt, altInt);
                        }
                    }
                    break;

                case "3":
                    if(arrList.size() == 0)
                    {
                        System.out.println("You cannot delete data from an empty list!");
                    }
                    else
                    {
                        System.out.print("Enter a position to delete:");
                        indexInt = Integer.parseInt(inp.nextLine());

                        if(indexInt < 0 || indexInt > arrList.size() - 1)
                        {

                            System.out.println("Invalid position! Try again");
                        }
                        else
                        {
                            System.out.println(arrList.get(indexInt) + " has been eliminated!");
                            arrList.remove(indexInt);
                        }
                    }
                    break;

                case "4":
                    if(arrList.size() == 0)
                    {
                        System.out.println("The list is empty!");
                    }
                    else
                    {
                        System.out.println("The current list is: ");
                        for(int i = 0; i <= arrList.size()-1; i++)
                        {
                            if(i<arrList.size()-1)
                            {
                                System.out.print(arrList.get(i) + " -> ");
                            }
                            else if(i == arrList.size()-1)
                            {
                                System.out.print(arrList.get(i)+"\n\n");
                            }
                        }
                    }
                    break;

                case "5":
                    System.out.print("Are you sure you want to quit? [Y/N] ");
                    quit = inp.nextLine();

                    if(quit.charAt(0) == 'N')
                    {
                        break;
                    }
                    else if(quit.charAt(0) == 'Y')
                    {
                        break;
                    }
                    else
                    {
                        quit = "N";
                        break;
                    }


            }

        }

    }

}