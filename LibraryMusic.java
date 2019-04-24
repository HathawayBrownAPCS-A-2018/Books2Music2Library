
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
        super(theArtist, theTitle, theYear);
        callNumber = theCallNum;
    }

    public String getTitle()
    {  return super.getTitle();   }
    
    public String getCallNumber()
    {  return callNumber;    }
    
    public int getStatus()
    {  return status;        }
    
    public void setStatus(int s)
    {   status = s;    }
    
    public String toString()
    {  
        return callNumber + "\t" + super.getArtist() + " : " +
              super.getTitle() + "\t" + super.getYear();
    }

}
