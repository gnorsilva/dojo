import java.util.Set;

/**
 * Team data. The team has a name and a poule.
 */
public class TeamImpl implements Comparable<TeamImpl>
{
    private String name;
    private Poule poule;

    /**
     * Constructor: create a new TeamImpl.
     *
     * @param name
     * @param poule
     */
    public TeamImpl(String name, Poule poule)
    {
        this.name = name;
        this.poule = poule;
    }

    //------------------------------------------------------
    // Implementation....
    //------------------------------------------------------
    /**
     * Compare this team to another team.
     * Result should be:
     * -1 if this < other
     * 0  if this = other
     * +1 if this > other.
     * 
     * @param other The other team.
     * @return an integer value.
     * @see Comparable#compareTo(Object)
     */
    public int compareTo(TeamImpl other)
    {
        // This must be wrong!
        return 0;
    }
    
    //------------------------------------------------------
    // Support methods
    //------------------------------------------------------
    /**
     * Get the games played by the team.
     * 
     * @return the collection of games played by the team.
     */
    public Set<Game> getGames()
    {
        return getPoule().gamesPlayedByTeam(this);
    }

    /**
     * Get the score of the team.
     * 
     * @return the score of the team.
     */
    public int goalsScored()
    {
        return getPoule().goalsScored(this);
    }

    /**
     * Get the score of the opponents.
     * 
     * @return the score of the opponents.
     */
    public int goalsOpponent()
    {
        return getPoule().goalsOpponent(this);
    }

    /**
     * Get the points won by the team.
     * 
     * @return the points won.
     */
    public int pointsWon()
    {
        return getPoule().pointsWon(this);
    }

    @Override
    public String toString()
    {
        return getName();
    }
    
    //------------------------------------------------------
    // Getters
    //------------------------------------------------------
    /**
     * Get the name.
     * 
     * @return the name.
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Get the poule.
     * 
     * @return the poule.
     */
    public Poule getPoule()
    {
        return this.poule;
    }
}
