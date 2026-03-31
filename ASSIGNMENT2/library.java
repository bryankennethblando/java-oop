package ASSIGNMENT2;

import java.util.ArrayList;

public class library
{
    // creating an arrylist to store the books using the util.ArrayList
    private ArrayList <String> books = new ArrayList<>();

    public void addBooks(String bookname)
    {
        this.books.add(bookname); // adding values to books using addBooks fucntion
    }

    public void dispalyBooksInfo()
    {   
        
        int i = 1; // for counter

        System.out.println("\nBooks Stored in Library:");
        for (String book : books) // using for-each for displaying each of the contents of books
        {  

            if (books.size() == 0) // if the array size is empthy
            {
                System.out.println("Sorry your Library is empthy.");
                break;
            }

            // wiil print if the array contains elements and is not empthy
            System.out.printf("[%d] %s\n", i, book);
            i++;

        }
    }

}