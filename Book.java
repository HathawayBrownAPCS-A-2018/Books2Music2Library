
/**
 * Implements a Book.
 * Modeled off of question 4.7, page 91, in Litvin & Litvin <i>Java Methods</i>
 *
 * @author Michael Buescher for APCS@HB - Unit 2
 * @version 2018-09
 */
import java.util.Scanner;

public class Book implements Comparable<Book>
{
    private String title;
    private String author;
    private int publicationYear;
    private int numPages;
    private int currentPage;
    
    // ---- Constuctor -------------------------------------------------------
    /**
     * Constucts a new Book object.
     * @param theTitle the title of the Book
     * @param theAuthor the author of the Book
     * @param thePages the number of pages in the Book
     * @param theYear the year that the Book was published
     */
    public Book (String theTitle, String theAuthor, int thePages, int theYear)
    {
        title = theTitle;
        author = theAuthor;
        numPages = thePages;
        publicationYear = theYear;
        currentPage = 0;
    }
    
    // ---- Accessors --------------------------------------------------------
    /** Returns the title of the Book
     *  @return the title of the Book      */
    public String getTitle ()
    {  return title;  }
    
    /** Returns the author of the Book
     *  @return the author of the Book      */
    public String getAuthor ()
    {  return author;  }
    
    /** Returns the year that the Book was published
     *  @return the year that the Book was published     */
    public int getPublicationYear ()
    {  return publicationYear;  }
    
    /** Returns the number of pages in the Book
     *  @return the number of pages in the Book      */
    public int getNumPages ()
    {  return numPages;  }
    
    /** Returns the title of the Book
     *  @return the title of the Book      */
    public int getCurrentPage ()
    {  return currentPage;  }
    
    // ---- Mutators ------------------------------------------------------
    /** Sets the current page of the Book
     *  @param n the new current page
     *  @return the new current page
     */
    public int setCurrentPage (int n)
    {
        if (n <= numPages)
        {
            currentPage = n;
        }
        return currentPage;
    }
    
    // ---- Other Methods -------------------------------------------------
    /** Returns a String representation of the Book
     *  in the form <i><b>Title</b></i> by <b>Author</b>, <b>n</b> pages (<b>Year</b>).
     *  @return a String representation of the Book
     */
    public String toString ()
    {
        return title + " by " + author + ", " + numPages + " pages (" + publicationYear + ")";
    }
    
    /**
     *   Compares one Book to another.
     *   This version uses Titles to compare.
     *   
     *   @param other the Book to compare this Book to
     *   @return  a positive integer if this Book comes after other
     *            a negative integer if this Book comes before other
     *            zero if this Book equals other
     */
    public int compareTo (Book other)
    {
        return this.getAuthor().compareTo(other.getAuthor());
    }
    
    /** Reads the basic information for a Book from the
     *  keyboard and returns a new Book.
     *  @return a new Book with the information read from the keyboard.
     */
    public static Book getBookFromKeyboard()
    {
        Scanner kbd = new Scanner (System.in);
        System.out.print("Enter Title:            ");
        String title = kbd.nextLine();
        System.out.print("Enter Author:           ");
        String author = kbd.nextLine();
        System.out.print("Enter publication year: ");
        int year = kbd.nextInt();
        System.out.print("Enter number of pages:  ");
        int pages = kbd.nextInt();
        kbd.close();
        Book b = new Book (title, author, pages, year);
        System.out.println(b);
        return b;
    }
}

