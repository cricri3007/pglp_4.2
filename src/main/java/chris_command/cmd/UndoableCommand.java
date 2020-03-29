package chris_command.cmd;

/**
 * @author Maxime
 * Interface ajoutée puisqu'on a pas besoin d'annuler Undo et Exit
 * Permet de respecter ISP (segregation des interfaces)
 * # COMMANDE
 */
public interface UndoableCommand extends Command {

	public void undo();
	
}
