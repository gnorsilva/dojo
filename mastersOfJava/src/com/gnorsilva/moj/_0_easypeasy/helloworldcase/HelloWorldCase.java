package com.gnorsilva.moj._0_easypeasy.helloworldcase;

public class HelloWorldCase {

	public static String sayIt(String string) {
		StringBuilder builder = new StringBuilder("Hello");
		if(string != null){
			builder.append(" ").append(string);
		}
		return builder.toString();
	}

}
