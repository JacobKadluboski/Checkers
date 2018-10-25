package checkers.Package;

import javax.swing.JFrame;

/**The game board itself, creates the game.
 * 
 * @author Jacob Kadluboski
 *
 */
public class CheckerBoard extends JFrame {
	
	private static final long serialVersionUID = 1L;
	/**The game that will be used to play.
	 * 
	 */
	
	private CheckerPanel pan;

	/**The board to be played on.
	 * 
	 */
	public void start() {
		
		this.setSize(866, 720);
		pan = new CheckerPanel();
		this.add(pan);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);		
		
	}
	/**Creates the Checkerboard to start the GUI.
	 * 
	 * @param args args
	 */
	public static void main(final String[] args) {
		@SuppressWarnings("unused")
		CheckerBoard cb = new CheckerBoard();
		
		cb.start();

	}
	
}
