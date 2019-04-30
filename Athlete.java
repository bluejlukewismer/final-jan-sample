
/**
 * Athlete is a class designed to represent data on a specific Athlete
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Athlete
{
    private String name;
    private String event;
    private boolean hasFieldEvent;
    private int age;
    
    public Athlete(String n, String e, boolean fieldEvent, int a)
    {
        name = n;
        event = e;
        hasFieldEvent = fieldEvent;
        age = a;
    }

    public String getName()
    {
        return name;
    }
    
    public String getEvent()
    {
        return event;
    }
    
    public Boolean getHasFieldEvent()
    {
        return hasFieldEvent;
    }
    
    public int getAge()
    {
        return age;
    }
}
