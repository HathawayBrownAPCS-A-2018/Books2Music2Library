
/**
 * Write a description of class Music here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Music
{
    private String artist;
    private String title;
    private int year;
    
    public Music (String theArtist, String theTitle, int theYear)
    {
        artist = theArtist;
        title  = theTitle;
        year  = theYear;
    }
    
    // ------------------------------------------------
    //    Accessor Methods
    // ------------------------------------------------
    public String getTitle()
    {    return ""; /* your code here */   }
    
    public String getArtist()
    {    return "";   /* your code here */   }
    
    public int getYear ()
    {    return 0;   /* your code here */     }
        
    
    // ------------------------------------------------
    //    Prints the Music in a nice String
    // ------------------------------------------------
    public String toString()
    {
        return artist + " : " + title + "  (" + year + ")";
    }
}
