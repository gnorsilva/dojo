
public class VragenLijst {

	private Vraag[]   vragen;

	public VragenLijst(Vraag[] vragen) {
		this.vragen=vragen;
	}
	
	/**
	 * stelt 1 voor 1 de vragen aan de vragenlijst visitor en kent punten toe 
	 * voor iedere partij op basis van het gegeven antwoord. 
	 * @param vv de bezoeker.
	 */	
	public void visit(VragenlijstVisitor vv) {
		//
		// Implement here.
		//
	}
		
}
