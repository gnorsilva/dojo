package com.gnorsilva.moj._0_easypeasy.spotcountercase;

public class SPOTRadar implements Radar {

	private final Hit[] hits;
	
	public SPOTRadar(Hit ...hits){
		this.hits = hits;
	}
	
	@Override
	public Hit[] getHits() {
		return hits;
	}

}
