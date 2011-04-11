import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Poule data maintains a collection of teams and games.
 */
public class Poule 
{
	private Set<Game> games = new HashSet<Game>();
	private Set<TeamImpl> teams = new HashSet<TeamImpl>();

	/**
     * Add a game to the poule. The game is added to the games
     * collection.
     * <br>
     * Side effects: the teams that played the game are added
     * to the teams collection.
     * 
	 * @param game
	 */
	public void addGame(Game game)
	{
		addTeam(game.getTeam1());
		addTeam(game.getTeam2());

		this.games.add(game);
	}

	/**
     * Add a game to the poule.
     * <br>
     * Side effects: creates a Game instance.
     * 
	 * @param team1 the first team that played the game.
	 * @param team2 the second team that played the game.
	 * @param score1 the score of the first team.
	 * @param score2 the score of the second team.
	 */
	public void addGame(TeamImpl team1, TeamImpl team2, int score1, int score2)
	{
		addGame(new Game(team1, team2, score1, score2));
	}
	
	/**
     * Add a team to the teams collection.
     * 
	 * @param team the team to add.
	 */
	public void addTeam(TeamImpl team)
	{
		this.teams.add(team);
	}
	
	/**
     * Get the games collection.
     * 
	 * @return the set containing the games.
	 */
	public Set<Game> getGames()
	{
		return Collections.unmodifiableSet(this.games);
	}

	/**
     * Get the teams collection.
     * 
	 * @return the set containing the teams.
	 */
	public Set<TeamImpl> getTeams()
	{
		return Collections.unmodifiableSet(this.teams);
	}

	/**
     * Get the games played by the team.
     * 
	 * @param team the team who's games to get.
	 * @return the games of the team.
	 */
	public Set<Game> gamesPlayedByTeam(TeamImpl team)
	{
		Set<Game> teamGames = new HashSet<Game>();
		
		for (Game game : this.games)
		{
			if (game.playedBy(team))
			{
				teamGames.add(game);
			}
		}

		return teamGames;
	}
	
	/**
     * Get the number of goals scored by the team.
     * 
	 * @param team the team who's scored goals to get.
	 * @return the goals as an integer value.
	 */
	public int goalsScored(TeamImpl team)
	{
		int goals = 0;
		
		for(Game game : gamesPlayedByTeam(team))
		{
			goals += game.goalsScored(team);
		}

		return goals;
	}

	/**
     * Get the goals scored against this team.
     * 
	 * @param team the team who's scored against goals to get.
	 * @return the goals as an integer value.
	 */
	public int goalsOpponent(TeamImpl team)
	{
		int goals = 0;
		
		for(Game game : gamesPlayedByTeam(team))
		{
			goals += game.goalsOpponent(team);
		}

		return goals;
	}

	/**
     * Get the points won by the team.
     * 
	 * @param team the team who's points to get.
	 * @return the points as an integer value.
	 */
	public int pointsWon(TeamImpl team)
	{
		int points = 0;
	
		for(Game game : gamesPlayedByTeam(team))
		{
			points += game.pointsWon(team);
		}

		return points;
	}

	/**
     * Get the results of this poule, sorted by:
     * <ul>
     * <li>points scored</li>
     * <li>difference between points scored and points scored against a team.</li>
     * <li>points scored</li>
     * <li>number of matches played</li>
     * <li>alphabetically by name</li>
     * </ul>
     * 
	 * @return the results as a TeamImpl array.
	 */
	public TeamImpl[] getResult()
	{
		TeamImpl[] teamArray = getTeams().toArray(new TeamImpl[0]);

		Arrays.sort(teamArray);

		return teamArray;
	}
}
