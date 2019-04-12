
/**
 *  LibraryBook makes a Book that can be checked in or out
 *
 * @author APCSA @ HB
 * @version 2019-04
 */
public class LibraryBook extends Book implements LibraryItem 
{
    public String callNumber;
    
    private int status;
    public static final int ON_SHELF = 0;
    public static final int CHECKED_OUT = 1;
    
    public LibraryBook 
        (String theTitle, String theAuthor, int thePages, int theYear, String callNum)
    {
        super(theTitle, theAuthor, thePages, theYear);
        callNumber = callNum;
        status = ON_SHELF;
    }
    
    public String getTitle()
    {  return super.getTitle();  }
    
    public String getCallNumber ()
    {  return callNumber;  }
    
    public int getStatus ()
    {  return status;  }
    
    public void setStatus (int s)
    {  status = s;   }
    
    public String toString()
    {
        String ans = callNumber + "\t" + super.toString() + "\t";
        if (status == ON_SHELF)
        { 
            ans += "On Shelf";
        }
        else
        {
            ans += "Checked Out";
        }
        return ans;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
