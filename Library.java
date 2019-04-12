/**
 * Creates a big list of Books (like for a library) using an array
 *
 * @author APCS-A @ HB
 * @version 2019-04
 */
import java.util.Scanner;
import java.io.*;

public class Library
{
    private LibraryBook[] bookList;
    private int numBooks;
    public static final int MAX_BOOKS = 100;

    /**
     * Constructor initializes the array to 0 Books
     */
    public Library()
    {
        bookList = new LibraryBook[MAX_BOOKS];
        numBooks = 0;
    }

    /**
     * Writes the BookList to standard output.
     */
    public void printList()
    {
        for (int i = 0; i < numBooks; i++)
        {
            System.out.println(bookList[i]);
        }
        System.out.println (numBooks + " books.");
    }
    
    /**
     * Adds a book to end of the list.  Updates the total number of Books.
     * @param b the Book to add to the list
     */
    public void addBook (LibraryBook b)
    {
        bookList[numBooks] = b;
        numBooks++;
    }
    
    
    /**
     * Fills the list of books from the keyboard.
     *
    public void fillFromKeyboard()
    {
        String resp = "Y";
        Scanner kbd = new Scanner (System.in);
        while (resp.charAt(0) == 'Y' || resp.charAt(0) == 'y')
        {
            addBook(Book.getBookFromKeyboard());
            System.out.print("Add another book? ");
            resp = kbd.nextLine();
        }
        kbd.close();
    }
    */
   
    /**
     * Fills the Library from a data file.
     * Precondition:  file BookList.tsv exists and is formatted as a 
     *    tab-separated value file (.tsv).  
     *    Fields: timestamp, title, author, date, pages
     *    BookList.tsv contains at most MAX_BOOKS books
     * Postcondition:  array bookList holds all of the Books in the file.
     */
    private void fillFromFile ()
    {
      // open the file
      File file = new File("LibraryBookList.tsv");
      Scanner input = null;
      try
      {
          input = new Scanner(file);
      }
      catch (FileNotFoundException ex)
      {
          System.out.println("*** Cannot open LibraryBookList.tsv ***");
          System.exit(1);        // quit the program
      } 

      // read the Books from the file, one per line
      input.nextLine();   // Read and ignore the header line
      while (input.hasNext())
      {
          String nextBook = input.nextLine();
          if (nextBook != null)
          {
            //System.out.println (nextBook);            
            LibraryBook newBook = getBookFromString(nextBook);
            //int location = findIndex(newBook);
            addBook(newBook);
          }
      }      
      input.close();
    }

    public LibraryBook getBookFromString(String s)
    {
        String temp = s;
        temp = temp.substring(temp.indexOf("\t")+1);
        String theCallNum = temp.substring(0,temp.indexOf("\t"));
        temp = temp.substring(temp.indexOf("\t")+1);
        String theTitle = temp.substring(0,temp.indexOf("\t"));
        temp = temp.substring(temp.indexOf("\t")+1);
        String theAuthor = temp.substring(0,temp.indexOf("\t"));
        temp = temp.substring(temp.indexOf("\t")+1);
        int thePublicationYear;
        try {
            thePublicationYear = Integer.parseInt(temp.substring(0, temp.indexOf("\t")));
 
            }
        catch (NumberFormatException e)
           {
              return null;
           }
        temp = temp.substring(temp.indexOf("\t")+1);
        int theNumPages;
        try {
            theNumPages = Integer.parseInt(temp);
 
             }
         catch (NumberFormatException e)
            {
             return null;
             }
       
        LibraryBook b = 
            new LibraryBook(theTitle, theAuthor, theNumPages, thePublicationYear, theCallNum);
        return b;
    }
    /**
     *   Adds the Book b to index n in the array.
     *   Moves all subsequent Books down.
     *   
     *   Precondition:  0 <= n <= numBooks
     *   
     *   @param  b  The Book to add to the Library
     *   @param  n  The index at which to add the Book
     *
    public void add (int n, Book b)
    {
      if (numBooks + 1 < MAX_BOOKS)
      {
        for (int i = bookList.length - 1; i > n; i--)
        {
            bookList[i] = bookList[i-1];
        }
        bookList[n] = b;
        numBooks++;
      }
      else
      {
          System.out.println ("There is not enough room to add another book");
      }
    }
  */
/**
     *   Finds the location for a given Book to maintain the Library 
     *   in order.
     *   PRECONDITION: The Library is in a sorted order already
     *   
     *   @param b   The Book to add to the Library
     *   @return    The index where the Book belongs in the Library
     *
    public int findIndex (Book b)
    {
        int index = 0;
        for (int i = 0; i < numBooks; i++)
        {
            if (b.compareTo(bookList[i]) > 0)
            {
                index++;
            }
        }
        return index;
    }  
    */
   
    public static void main (String[] args)
    {
        Library myBooks = new Library();
        //myBooks.fillFromKeyboard();
        myBooks.fillFromFile();
        myBooks.printList();
    }
}
