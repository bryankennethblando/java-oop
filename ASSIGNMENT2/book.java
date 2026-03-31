package ASSIGNMENT2; // I'm using a package of the file

import java.util.Scanner;

public class book
{
    public static void main (String[] args)
    {
        // creating an object from the library class and scanner class from util.scanner
        Scanner scanner = new Scanner(System.in);
        library myOwnLibrary = new library();

        System.out.print("How many books do you want to store: ");
        int numberOfBooks = scanner.nextInt();
        scanner.nextLine(); // to remove the input buffer onto the next use of scanner

        for (int i = 1; i <= numberOfBooks; i++)
        {
            System.out.printf("[%s] the Book title: ", i);
            String bookName = scanner.nextLine();
            myOwnLibrary.addBooks(bookName); // appending the bookname to the array inside the library class
        }

        // displaying the books that stored onto the library class
        myOwnLibrary.dispalyBooksInfo();

        scanner.close();
    }
}