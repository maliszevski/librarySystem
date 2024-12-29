package AppLogic;

import java.util.Scanner;

public class AppLogic {
    private final Scanner scanner;

    public AppLogic(Scanner scanner) {
        this.scanner = scanner;
    }

     public void run(boolean isRunning) {
        while (isRunning){
            showMenu();
            int userChoice = getUserChoice();
            switch (userChoice) {
                case 1:
                    System.out.println("Enter book title: ");
                    String title = scanner.nextLine();

                    System.out.println("Enter book author: ");
                    String author = scanner.nextLine();

                    Book newBook = new Book(title, author);
                    //library.addBookToLibrary(newBook);

                    System.out.println("Book added successfully!");
                    break;
                case 2:
                    System.out.println("********************** LIBRARY ******************************");
                    //library.getBooksList();
                    System.out.println("*************************************************************");
                    break;
                case 5:
                    isRunning = false;
                    System.out.println("Goodbye..");
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
}




    private void showMenu(){
        System.out.println("*** LIBRARY MANAGEMENT SYSTEM ***");
        System.out.println("1. Add new book to library");
        System.out.println("2. Show library");
        System.out.println("5. Exit");
        System.out.println("Your choice: ");
    }


    private int getUserChoice(){
        return scanner.nextInt();
    }

}
