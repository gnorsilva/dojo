public class SpotCounter {

	/**
	 * scans the surroundings and counts the number of SPOTs.
	 * @param r the radar to scan with
	 * @return the number of SPOTs in the area.
	 */
	public int scan(Radar r) {
		int result = 0;
		for( Hit hit : r.getHits()){
			if(hit.isSpot()){
				result++;
			}
		}
		return result;
	}

}
