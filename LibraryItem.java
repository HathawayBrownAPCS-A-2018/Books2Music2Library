
/**
 * Write a description of interface LibraryItem here.
 *
 * @author APCSA @ HB
 * @version 2019-04
 */
public interface LibraryItem
{
    public String getTitle();
    public String getCallNumber();
    public int getStatus();
    public void setStatus(int status);
    public String toString();
}
