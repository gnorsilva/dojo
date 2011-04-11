
public interface Vraag {

	/**
	 * geeft de aan de Bezoeker te stellen vraag. 
	 * @return de vraag.
	 */
	public String getVraag();
	
	/**
	 * geeft de score voor het gegeven anwoord passend bij de gegeven partij.
	 * @param p de partije waarvoor de punten bepaald moeten worden.
	 * @param k de keuze die gemaakt is.
	 * @return het aantal punten.
	 */
	public int getScoreVoor(Partij p,Keuze k);
	
}
