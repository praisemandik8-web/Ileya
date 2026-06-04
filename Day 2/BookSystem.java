import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class BookSystem {

    static ArrayList<String> books = new ArrayList<>();

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        books.add("The Four Agreements");
        books.add("Mastery");
        books.add("The Alchemist");
        books.add("Richest Man in Babylon");
        books.add("1984");

        int choice = 0;

        while (choice != 6) {

            System.out.println("\n=== Book Suggestion System APP! ====");
        //  System.out.println("1. Get Suggestions");
            System.out.println("2. Add Book");
            System.out.println("3. Remove Book");
            System.out.println("4. Update Book");
            System.out.println("5. Show All Books");
            System.out.println("6. Exit");

            System.out.print("Press a number, boss: ");
            choice = inputCollector.nextInt();
            inputCollector.nextLine();

            switch (choice) {

  //              case 1:
  //                  suggestBooks(inputCollector);
 //                   break;

                case 2:
                    addBook(inputCollector);
                    break;

                case 3:
                    removeBook(inputCollector);
                    break;

                case 4:
                    updateBook(inputCollector);
                    break;

                case 5:
                    showBooks();
                    break;

                case 6:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        }
    }



    
    public static void addBook(Scanner inputCollector) {
        System.out.print("Enter book title: ");
        String newBook = inputCollector.nextLine();

        if (books.contains(newBook)) {
            System.out.println("Book already exists..");
        } else {
            books.add(newBook);
            System.out.println("Book added..");
        }
    }

   
    public static void removeBook(Scanner inputCollector) {
        System.out.print("Enter book title to remove: ");
        String removeBook = inputCollector.nextLine();

        if (books.contains(removeBook)) {
            books.remove(removeBook);
            System.out.println("Book removed.. ");
        } else {
            System.out.println("Book not found..");
        }
    }

    
    public static void updateBook(Scanner inputCollector) {
        System.out.print("Enter old title: ");
        String oldBook = inputCollector.nextLine();

        if (books.contains(oldBook)) {

            System.out.print("Enter new title: ");
            String newBook = inputCollector.nextLine();

            int index = books.indexOf(oldBook);
            books.set(index, newBook);

            System.out.println("Book updated..");

        } else {
            System.out.println("Book not found..");
        }
    }

    
    public static void showBooks() {

        System.out.println("Books:");

        for (int count = 0; count < books.size(); count++) {
            System.out.println((count + 1) + ". " + books.get(count));
        }
    }
}
