import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Generic implementation of a decoder using a Regular Expression. 
 */
public class RegexDecoder implements Decoder {

    private Pattern pattern;
    private boolean invert;
    private String  name;
    
    /** 
     * constructs a new RegexDecoder using the given pattern
     * @param regex the regex pattern
     * @param invert if true the characters that did not match
     *        against the pattern are returned. 
     */
    public RegexDecoder(String name,String regex,boolean invert) {
        // create a pattern out of the given regex string 
        this.pattern=Pattern.compile(regex);
        this.invert=invert;
        this.name=name;
    }
    
    public String getName() { return name; }

    /**
     * decodes the message using the regex Pattern.
     */
    public String decode(String message) {
        if (message==null) return null;
        StringBuilder result=new StringBuilder();
        Matcher m=pattern.matcher(message);
        if (invert) {
        	// Return only those chars that did not match. 
        	result.append(m.replaceAll(""));        
        } else {
        	// Return only the chars that did match.
        	while (m.find()) result.append(m.group());
        }
        return result.toString().toLowerCase();
    }
    
}
