
/**
 * Game data containing the teams and their scores.
 */
public class Game 
{
	private TeamImpl team1;
	private TeamImpl team2;
	private int score1;
	private int score2;
	
	/**
	 * Constructor: create a new Game.
	 *
	 * @param team1
	 * @param team2
	 * @param score1
	 * @param score2
	 */
	public Game(TeamImpl team1, TeamImpl team2, int score1, int score2)
	{
		this.team1 = team1;
		this.team2 = team2;
		this.score1 = score1;
		this.score2 = score2;
	}

	/**
     * Get the first team.
     * 
	 * @return the TeamImpl.
	 */
	public TeamImpl getTeam1()
	{
		return this.team1;
	}

	/**
     * Get the second team.
     * 
	 * @return the TeamImpl.
	 */
	public TeamImpl getTeam2()
	{
		return this.team2;
	}

	/**
     * Get the score of the first team.
     * 
	 * @return the score as an integer value.
	 */
	public int getScore1()
	{
		return this.score1;
	}

	/**
     * Get the score of the second team.
     * 
	 * @return the score as an integer value.
	 */
	public int getScore2()
	{
		return this.score2;
	}

	/**
     * Check if the game was played by the team.
     * 
	 * @param team the team to check.
	 * @return <code>true</code> if the team played in this game.
	 */
	public boolean playedBy(TeamImpl team)
	{
		return (getTeam1().equals(team) || getTeam2().equals(team)); 
	}

	/**
     * Get the goals scored by the team. If the team did not play
     * in the game, <code>0</code> is returned.
     * 
	 * @param team the team to check.
	 * @return the number of goals scored by the team.
	 */
	public int goalsScored(TeamImpl team)
	{
		int goals = 0;
		
		if (getTeam1().equals(team))
		{
			goals = getScore1();
		}
		else if (getTeam2().equals(team))
		{
			goals = getScore2();
		}

		return goals;
	}

    /**
     * Get the goals scored by the opponents team. If the team did not play
     * in the game, <code>0</code> is returned.
     * 
     * @param team the team to check.
     * @return the number of goals scored by the team.
     */
	public int goalsOpponent(TeamImpl team)
	{
		int goals = 0;
		
		if (getTeam1().equals(team))
		{
			goals = getScore2();
		}
		else if (getTeam2().equals(team))
		{
			goals = getScore1();
		}

		return goals;
	}

    /**
     * Get the points won by the team. If the team did not play
     * in the game, <code>0</code> is returned.
     * 
     * @param team the team to check.
     * @return the number of goals scored by the team.
     */
	public int pointsWon(TeamImpl team)
	{
		int points = 0;
		
		if (getTeam1().equals(team))
		{
			if (getScore1() > getScore2())
			{
				points = 3;
			}
			else if (getScore1() == getScore2())
			{
				points = 1;
			}
		}
		else if (getTeam2().equals(team))
		{
			if (getScore2() > getScore1())
			{
				points = 3;
			}
			else if (getScore2() == getScore1())
			{
				points = 1;
			}
		}

		return points;
	}
}
