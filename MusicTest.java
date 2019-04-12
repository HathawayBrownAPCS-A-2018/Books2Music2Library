
/**
 * Testing code for the Music and LibraryMusic classes
 *
 * @author MB for APCSA @ HB
 * @version 2019-04
 */

import java.util.List;
import java.util.ArrayList;

public class MusicTest
{

    public static void main (String[] args)
    {
        // This code tests the Music class.
        // Comment it out if you don't want to test that yet.
        ArrayList<Music> myMusic = new ArrayList<Music>();
        myMusic.add ("Bill Haley", "Rock Around the Clock", 1955);
        myMusic.add ("The Beatles", "Sgt. Pepper's Lonely Hearts Club Band", 1967);
        myMusic.add ("Pink Floyd", "Dark Side of the Moon", 1973);
        myMusic.add ("Michael Jackson", "Thriller", 1982);
        myMusic.add ("Alanis Morissette", "Jagged Little Pill", 1995);
        myMusic.add ("Eminem", "The Marshall Mathers LP", 2000);
        myMusic.add ("Adele", "21", 2011);
        
        System.out.println ("Best selling albums by in each decade:");
        for (Music m : myMusic)
        {
            System.out.println (m);
        }
        
        // This code tests the LibraryMusic class
        // It copies the same information as above, but then adds a call number.
        // Comment it out if you have only done Music so far
        ArrayList<LibraryMusic> myLibrary = newArrayList<LibraryMusic>();
        for (Music m : myMusic)
        {
            String callNum = m.getArtist().substring(0,2) +
                             m.getTitle().substring(0,2) + 
                             m.getYesr().substring(2,4);
            myLibrary.add (m.getArtist(), m.getTitle, m.getYear, callNum);
        }
        
        System.out.println ("My music library has popular albums!");
        for (LibraryMusic lm : myLibrary)
        {
            System.out.println (lm);
        }
        
    }
}
