
/**
 * Write a description of class LibraryMusic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LibraryMusic extends Music implements LibraryItem
{
    private String callNumber;
    private int status;
    
    public LibraryMusic (String theArtist, String theTitle, int theYear, String theCallNum)
    {
         /* your code here */ 
         /* You will need to call the superclass constructor
          *    and then update the particular LibraryMusic
          *    private instance variables.
          */
    }

    public String getTitle()
    {  return "";   /* your code here */   }
    
    public String getCallNumber()
    {  return "";    /* your code here */   }
    
    public int getStatus()
    {  return 0;     /* your code here */      }
    
    public void setStatus(int s)
    {    /* your code here */      }
    
    public String toString()
    {  
        return callNumber + "\t" + super.getArtist() + " : " +
              super.getTitle() + "\t(" + super.getYear() + ")";
    }

}
