
import java.util.Collection;

/**
 * Recognize Patterns in seemingly innocent text. 
 * TODO : Implement or configure Decoder(s) for each message type 
 * @author berkmope
 */
public class PatternRecognition {

	//
	// Some useful regex constants
	//
	
	public static final String CAPITAL = "[A-Z]";
    public static final String NOT_CAPITAL = "[^A-Z]";
    public static final String SPACE = " ";
    public static final String VOWELS = "[aAeEiIuUoOyY]";
    public static final String NOT_VOWELS = "[^aAeEiIuUoOyY]";
    public static final String PUNCTUATION = "[ .!?;.,'\"()\\-]";
    public static final String NORMAL_LETTERS = "[a-zA-Z0-9']";
    public static final String NOT_NORMAL_LETTERS = "[^a-zA-Z0-9']";
    public static final String OR = "|";
    public static final String CHOICE_START = "[";
    public static final String CHOICE_END = "]";
    public static final String MULTIPLICITY = "*";
    public static final String TWO_OR_MORE = "{2,}";	
	
    /**
     * Initializes the PatternRecognition software by providing
     * a set of decoders.
     */
    public void getDecoders(Collection<Decoder> decoders) {
        //
    	// TODO : Configure or Implement decoders
    	//
    	// Capital Letters : Select all capital letters, discarding everything else.
    	//
    	decoders.add(new RegexDecoder("Capital","",true));
        //
        // Vowel prefixed words, without the vowel itself.
        //
    	decoders.add(new RegexDecoder("Vowel  ","",true));
        //
        // Single letter words : Words that consist of a single letter, for instance I.
        //
    	decoders.add(new RegexDecoder("Letter ","",true));
        //
        //
        //
    }
 
}
