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

		while (quit.charAt(0) != 'Y') {
			System.out.print(introString); // Print introduction string
			choice = inp.nextLine();

			switch (choice) {
				case "1":
					System.out.print("\nEnter an integer to add: ");

					//Take in integer as string, cast to int and add to array list
					arrList.addFirst(Integer.parseInt(inp.nextLine()));
					break;

				case "2":
					System.out.print("\nEnter an integer to add: ");

					//Take in integer as string, cast to int and add to array list
					arrList.addLast(Integer.parseInt(inp.nextLine()));
					break;

				case "3":
					if (arrList.isEmpty()) {
						System.out.println("\nYou cannot delete data from an empty list!" + "\n");
					} else {
						System.out.print("\n" + arrList.getFirst() + " is removed from the list!" + "\n");
						arrList.removeFirst();
					}
					break;

				case "4":
					if (arrList.isEmpty()) {
						System.out.println("\nYou cannot delete data from an empty list!");
					} else {
						System.out.print("\n" + arrList.getLast() + " is removed from the list!" + "\n");
						arrList.removeLast();
					}
					break;


				case "5":
                    if(arrList.isEmpty())
                    {
                        System.out.println("The ArrayList is empty!");
                    }
                    else
                    {
                        System.out.println("The first element of the list is:" + arrList.getFirst() + "\n");
                    }
                    break;


				case "6":
                    if(arrList.isEmpty())
                    {
                        System.out.println("The ArrayList is empty!");
                    }
                    else
                    {
                        System.out.println("The last element of the list is:" + arrList.getLast() + "\n");
                    }
					break;

				case "7":
                    if(arrList.isEmpty())
                    {
                        System.out.println("The ArrayList is empty!");
                    }
                    else
                    {
                        System.out.println("The ArrayList is not empty!");
                    }
                    break;

                case "8":
                    System.out.print("There are " + arrList.size() + " elements in the list!");
                    break;

                case "9":
                    arrList.clear();
                    System.out.println("\n The ArrayList has been cleared!");
                    break;

                case "10":
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
                                System.out.print(arrList.get(i)+"\n");
                            }
                        }
                    }
                    break;

                case "11":
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

                default:
                    break;
			}

		}

	}

}