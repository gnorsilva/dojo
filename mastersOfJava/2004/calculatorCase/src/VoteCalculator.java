public class VoteCalculator implements Calculator {

	@Override
	public int getTotal(String textLine) throws CalculatorException {
		if (textLine == null) {
			throw new CalculatorException("Vote line is empty");
		} else if (textLine.isEmpty()) {
			return 0;
		}
		return extractResult(textLine);
	}

	private int extractResult(String s) {
		s = removePluses(s);
		s = removeExtraSpacesAfterMinus(s);
		String[] digits = s.split("\\s");
		return totalSum(digits);
	}

	private int totalSum(String[] digits) {
		int total = 0;
		for (String s: digits)
			total += Integer.parseInt(s);
		return total;
	}

	private String removePluses(String s) {
		return s.replaceAll("\\s*\\+\\s*", " ");
	}

	private String removeExtraSpacesAfterMinus(String s) {
		return s.replaceAll("\\s*-\\s*", " -");
	}
}
