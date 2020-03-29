package chris_command.exc;


public class MinMaxException extends ArithmeticException {

	/**
	 * Constructeur de l'exception
	 */
	public MinMaxException() {
		super("Valeur absolue trop grande pour être gérée");
	}
}
