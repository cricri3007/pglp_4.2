package chris_command.exc;


public class DivisionParZeroException extends ArithmeticException {

	/**
	 * Constructeur de l'exception
	 */
	public DivisionParZeroException() {
		super("Division par zéro");
	}

}
