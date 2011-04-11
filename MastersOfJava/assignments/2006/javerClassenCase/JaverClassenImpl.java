
public class JaverClassenImpl {
	
	/** waarde volgorde van Troef kaarten */  
	public enum Troef {
		
		ZEVEN(Plaatje.ZEVEN),
		ACHT(Plaatje.ACHT),
		VROUW(Plaatje.VROUW),
		HEER(Plaatje.HEER),
		TIEN(Plaatje.TIEN),
		AAS(Plaatje.AAS),
		NEGEN(Plaatje.NEGEN),
		BOER(Plaatje.BOER);
		
		private Plaatje p;		
		Troef(Plaatje p) { this.p=p; }	
		public Plaatje plaatje() { return p; }

	}

	/** waarde volgorde van Gevraagde kaarten */
	public enum Gevraagd {
		
		ZEVEN(Plaatje.ZEVEN),
		ACHT(Plaatje.ACHT),
		NEGEN(Plaatje.NEGEN),
		BOER(Plaatje.BOER),
		VROUW(Plaatje.VROUW),
		HEER(Plaatje.HEER),
		TIEN(Plaatje.TIEN),
		AAS(Plaatje.AAS);
		
		private Plaatje p;		
		Gevraagd(Plaatje p) { this.p=p; }	
		public Plaatje plaatje() { return p; }
		
	}

	/**
	 * Bepaalt of de ene kaart hoger is dan de andere op basis van de regels
	 * van KlaverJassen. Dwz Troef kleur wint van niet troef. Gevraagd kleur 
	 * wint van andere kleuren. De kaarten hebben een verschillende waarde 
	 * afhankelijk van of ze troef of gevraagd zijn. Niet gevraagde en niet
	 * troef kaarten hebben geen waarde. 
	 * @param troef geeft de troef kleur
	 * @param gevraagd de gevraagde kleur.
	 * @param ene de ene kaart
	 * @param andere de andere kaart
	 * @return true wanneer de ene kaart hoger is dan de andere.
	 */
    public boolean isHoger(Kleur troef,Kleur gevraagd,Kaart ene,Kaart andere) {
    	//
    	// TODO : Implement
    	//
    	return false;
    }


}
