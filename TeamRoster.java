import java.util.ArrayList; 

/**
 * TeamRoster is designed to be a collection of Athletes for a Track Team
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TeamRoster
{
    private ArrayList<Athlete> roster;

    public TeamRoster()
    {
        roster = new ArrayList<Athlete>();
    }

    //add method here:
    public void addAthlete(Athlete member)
    {
        roster.add(member);
    }
    
    public int getNumberOfAthletes()
    {
        return roster.size();
    }
   
    /**
     * List a team member from the roster.
     * @param index The index of the file to be listed.
     */
    public void listRoster(int index)
    {
        if(index >= 0 && index < roster.size()) {
            Athlete member = roster.get(index);
            System.out.println(member.getEvent());
        }
    }
    
    /**
     * Remove a team member from the roster.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(index >= 0 && index < roster.size()) {
            roster.remove(index);
        }
    }
}
