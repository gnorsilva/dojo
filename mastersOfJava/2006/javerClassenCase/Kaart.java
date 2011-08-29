
/**
 * SpeelKaart, dwz de combinatie van een kleur (klaver,ruiten,schoppen of harten) en
 * een plaatje (aas,twee,drie,vier,vijf,zes,zeven,acht,negen,tien,boer,vrouw,heer)
 */

public class Kaart {

	private Kleur kleur;
	private Plaatje plaatje;
	
	public Kaart(Kleur kleur,Plaatje kaart) {
		this.kleur=kleur;
		this.plaatje=kaart;
	}
	
	/** geeft het plaatje van de kaart */
    public Plaatje plaatje() { return plaatje; }
    /** geeft de kleur van de kaart */
    public Kleur kleur() { return kleur; }
    
    public String toString() { return kleur +" "+ plaatje; }
	
}
