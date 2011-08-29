public class HelloWorldCase {

	public static String sayIt(String string) {
		StringBuilder builder = new StringBuilder("Hello");
		if(string != null){
			builder.append(' ').append(string);
		}
		return builder.toString();
	}

}
