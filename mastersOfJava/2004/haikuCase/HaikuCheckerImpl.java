import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Actual implementation class for the HaikuChecker. 
 */

public class HaikuCheckerImpl implements HaikuChecker {


	/** cuts a string into words */
	private static String[] cut(String s) {
		List l=new ArrayList();
		//
		StringTokenizer st=new StringTokenizer(s," ,.;!?");
		while (st.hasMoreTokens()) {
			l.add(st.nextToken());
		}
		//
		return (String[])l.toArray(new String[l.size()]);
	}
	
	/** counts the number of syllables in the string array */
	public int count(String[] words) {
		int r=0;
		for (int t=0;t<words.length;t++) {
			r+=count(words[t]);
		}
		return r;
	}

	/** counts the number of syllables in the string */
	public int count(String word) {
		word=word.toLowerCase();
		String syl="aeiou";
		boolean in=false;
		int cnt=0;
		for (int t=0;t<word.length();t++) {
			if (syl.indexOf(word.charAt(t))>=0) {
				if (!in) {
					in=true;
					cnt++;
				}
			} else {
				in=false;
			}
		}
		//
		if ((cnt==0)&&(word.length()>0)) cnt=1;
		//
		return cnt;
	}
	
	/** checks if any of the SEASONS constatnts is used somewhere. */
	public boolean isSeason(String[] words) {
		for (int t=0;t<words.length;t++) {
			for (int s=0;s<SEASONS.length;s++) {
				if (words[t].toLowerCase().indexOf(SEASONS[s])>=0) return true;
			}
		}
		return false;
	}

	/**
	 * performs the actual haiku check. 
	 * @throws InvalidHaikuException if its incorrect.
	 */
	public void check(String[] haiku) throws InvalidHaikuException {
		//
		// Implement Here
		//
	}
	
	
}
