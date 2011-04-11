/**
* Calculator
*/
interface Calculator {
	/**
	* Calculates the formula designated in the text string
	* @param textLine contains the formula in text format
	* @return the result from the formula; only + and - calculations!
	* @throws CalculatorException when the textLine is invalid (null)
	*/
	int getTotal(String textLine) throws CalculatorException;
}
