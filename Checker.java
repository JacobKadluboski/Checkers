package checkers.Package;
import java.awt.Graphics;

/**
 * 
 * @author tough
 * Creates the spaces for the checkers and the checkers themselves
 */
public class Checker { //JAVADOC Comment
//CHECKSTYLE:OFF
	public int white11X;
	public int white11Y;
	public int white12X;
	public int white12Y;
	public int white13X;
	public int white13Y;
	public int white14X;
	public int white14Y;
	
	public int white21X;
	public int white21Y;
	public int white22X;
	public int white22Y;
	public int white23X;
	public int white23Y;
	public int white24X;
	public int white24Y;
	
	public int white31X;
	public int white31Y;
	public int white32X;
	public int white32Y;
	public int white33X;
	public int white33Y;
	public int white34X;
	public int white34Y;
	
	public int blue11X;
	public int blue11Y;
	public int blue12X;
	public int blue12Y;
	public int blue13X;
	public int blue13Y;
	public int blue14X;
	public int blue14Y;
	
	public int blue21X;
	public int blue21Y;
	public int blue22X;
	public int blue22Y;
	public int blue23X;
	public int blue23Y;
	public int blue24X;
	public int blue24Y;
	
	public int blue31X;
	public int blue31Y;
	public int blue32X;
	public int blue32Y;
	public int blue33X;
	public int blue33Y;
	public int blue34X;
	public int blue34Y;
//CHECKSTYLE:ON	
	/**Default constructor for the Checker class.
	 * 
	 */
	public Checker() {
		
	}
	/** Default white checker.
	 * 
	 * @param g g
	 */
	
	public void whiteChecker(final Graphics g) {
		
	}
	/**Default black checker.
	 * NOTE: THIS IS A BLACK CHECKER, NOT BLUE
	 * @param g g
	 */
	public void blueChecker(final Graphics g) {
		
	}
	/**Creates each individual checker piece.
	 * CHECKSTYLE:OFF
	 * Checkstyle disabled to avoid repetitive code
	 * @param g
	 */
	public void checkerWhite11(final Graphics g) {
		
		g.fillOval(white11X, white11Y, 69, 69);
	}
	public void checkerWhite12(final Graphics g) {
	
		g.fillOval(white12X, white12Y, 69, 69);
	}
	public void checkerWhite13(final Graphics g) {
		
		g.fillOval(white13X, white13Y, 69, 69);
	}
	public void checkerWhite14(final Graphics g) {
		
		g.fillOval(white14X, white14Y, 69, 69);
	}
	public void checkerWhite21(final Graphics g) {
	
		g.fillOval(white21X, white21Y, 69, 69);
	}
	public void checkerWhite22(final Graphics g) {
		g.fillOval(white22X, white22Y, 69, 69);
	}
	public void checkerWhite23(final Graphics g) {
		g.fillOval(white23X, white23Y, 69, 69);
	}
	public void checkerWhite24(final Graphics g) {
		g.fillOval(white24X, white24Y, 69, 69);
	}
	public void checkerWhite31(final Graphics g) {
		g.fillOval(white31X, white31Y, 69, 69);
	}
	public void checkerWhite32(final Graphics g) {
		g.fillOval(white32X, white32Y, 69, 69);
	}
	public void checkerWhite33(final Graphics g) {
		g.fillOval(white33X, white33Y, 69, 69);
	}
	public void checkerWhite34(final Graphics g) {
		g.fillOval(white34X, white34Y, 69, 69);
	}
	
	public void checkerBlue11(final Graphics g) {
		
		g.fillOval(blue11X, blue11Y, 69, 69);
	}
	public void checkerBlue12(final Graphics g) {
		g.fillOval(blue12X, blue12Y, 69, 69);
	}
	public void checkerBlue13(final Graphics g) {
		g.fillOval(blue13X, blue13Y, 69, 69);
	}
	public void checkerBlue14(final Graphics g) {
		g.fillOval(blue14X, blue14Y, 69, 69);
	}
	public void checkerBlue21(final Graphics g) {
		g.fillOval(blue21X, blue21Y, 69, 69);
	}
	public void checkerBlue22(final Graphics g) {
		g.fillOval(blue22X, blue22Y, 69, 69);
	}
	public void checkerBlue23(final Graphics g) {
		g.fillOval(blue23X, blue23Y, 69, 69);
	}
	public void checkerBlue24(final Graphics g) {
		g.fillOval(blue24X, blue24Y, 69, 69);
	}
	public void checkerBlue31(final Graphics g) {
		g.fillOval(blue31X, blue31Y, 69, 69);
	}
	public void checkerBlue32(final Graphics g) {
		g.fillOval(blue32X, blue32Y, 69, 69);
	}
	public void checkerBlue33(final Graphics g) {
		g.fillOval(blue33X, blue33Y, 69, 69);
	}
	public void checkerBlue34(final Graphics g) {
		g.fillOval(blue34X, blue34Y, 69, 69);
	}
}
