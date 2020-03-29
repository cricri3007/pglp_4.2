package chris_command.exc;


public class ArgumentPileException extends IllegalArgumentException {

	/**
	 * Constructeur de l'exception
	 */
	public ArgumentPileException() {
		super("Pas assez d'éléments dans la pile pour cette opération");
	}

}
