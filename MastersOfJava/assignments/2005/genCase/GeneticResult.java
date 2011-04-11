

/**
 * 
 */
public class GeneticResult {

	public static final int RANDOM=0;
	
	public static final int REPEAT=1;
	
	public static final GeneticResult createRandom(String data) {
		return new GeneticResult(RANDOM,1,data);
	}

	public static final GeneticResult createRepeat(int repeats,String data) {
		return new GeneticResult(REPEAT,repeats,data);
	}
	
	//
	//
	//
	
	private int what;
	private int count;
	private String data; 

	private GeneticResult(int what,int count,String sequence) {
		this.what=what;
		this.count=count;
		this.data=sequence;
	}
	
	public int getWhat() { return what; }
	public int getCount(){ return count;}
	public String getData() { return data; }

	public String toString() {
		return "GeneticResult("+(what==0?"RANDOM":"REPEAT")+","+data+","+count+")";
	}

}
