
public interface VragenlijstVisitor {
	
	/**
	 * Stelt een vraag aan de bezoeker.
	 * @param vraag de vraag om te stellen.
	 * @return een van de 4 mogelijke antwoorden.
	 */
	Keuze stelVraag(String vraag);
	
	/**
	 * Geeft de bezoeker punten voor een bepaalde partij.
	 * @param p de partij
	 * @param punten de hoeveelheid punten.
	 */
	void kenPuntenToe(Partij p,int punten);
	
}
