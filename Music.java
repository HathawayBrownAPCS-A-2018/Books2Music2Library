
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
    {    return title;   }
    
    public String getArtist()
    {    return artist;   }
    
    public int getYear ()
    {    return year;     }
        
    
    // ------------------------------------------------
    //    Prints the Music in a nice String
    // ------------------------------------------------
    public String toString()
    {
        return artist + " : " + title + "  (" + year + ")";
    }
}
