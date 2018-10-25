package checkers.Package;

import java.awt.Rectangle;

/**
 * Manages when two pieces collide, and deletes the non-selected piece.
 * 
 * @author Jacob Kadluboski
 *
 */
public class Collision {
	/**
	 * Collision logic for the squares [32 squares]. CHECKSTYLE:OFF Checkstyle
	 * disabled to avoid repetitive Javadoc
	 */

	public int ball11X;
	public int ball11Y;
	public int ball13X = 246;
	public int ball13Y = 33;
	public int ball15X = 407;
	public int ball15Y = 33;
	public int ball17X = 560;
	public int ball17Y = 33;

	public int ball22X = 6;
	public int ball22Y = 110;
	public int ball24X = 166;
	public int ball24Y = 110;
	public int ball26X = 326;
	public int ball26Y = 110;
	public int ball28X = 486;
	public int ball28Y = 110;

	public int ball31X = 88;
	public int ball31Y = 190;
	public int ball33X = 246;
	public int ball33Y = 190;
	public int ball35X = 407;
	public int ball35Y = 190;
	public int ball37X = 560;
	public int ball37Y = 190;

	public int ball62X = 88;
	public int ball62Y = 88;
	public int ball64X = 88;
	public int ball64Y = 88;
	public int ball66X = 88;
	public int ball66Y = 88;
	public int ball68X = CheckerPanel.x64;
	public int ball68Y = CheckerPanel.y64;

	public int ball71X = 88;
	public int ball71Y = 88;
	public int ball73X = 88;
	public int ball73Y = 88;
	public int ball75X = 88;
	public int ball75Y = 88;
	public int ball77X = 88;
	public int ball77Y = 88;

	public int ball82X = 88;
	public int ball82Y = 88;
	public int ball84X = 88;
	public int ball84Y = 88;
	public int ball86X = 88;
	public int ball86Y = 88;
	public int ball88X = 88;
	public int ball88Y = 88;

	public Rectangle rect13;
	public Rectangle rect15;
	public Rectangle rect17;

	// CHECKSTYLE:ON

	/**
	 * Rectangles for the checkers [24 checkers]. CHECKSTYLE:OFF Checkstyle disable
	 * to avoid repetitive Javadoc
	 */
	public Rectangle ball11;
	public Rectangle ball13;
	public Rectangle ball15;
	public Rectangle ball17;

	public Rectangle ball22;
	public Rectangle ball24;
	public Rectangle ball26;
	public Rectangle ball28;

	public Rectangle ball31;
	public Rectangle ball33;
	public Rectangle ball35;
	public Rectangle ball37;

	public Rectangle ball61;
	public Rectangle ball63;
	public Rectangle ball65;

	public Rectangle ball72;
	public Rectangle ball74;
	public Rectangle ball76;
	public Rectangle ball78;

	public Rectangle ball81;
	public Rectangle ball83;
	public Rectangle ball85;
	public Rectangle ball87;

	// CHECKSTYLE:ON
	/**
	 * Default constructor for the collision class.
	 * 
	 */
	Collision() {
		ball11X = 88;
		ball11Y = 33;
		// squares
		rect13 = new Rectangle(242, 26, 80, 80);
		rect15 = new Rectangle(402, 26, 80, 80);
		rect17 = new Rectangle(562, 26, 80, 80);

		// all the squares are now covered.

		ball11 = new Rectangle(ball11X, ball11Y, 69, 69);
		ball13 = new Rectangle(ball13X, ball13Y, 69, 69);
		ball15 = new Rectangle(ball15X, ball15Y, 69, 69);
		ball17 = new Rectangle(ball17X, ball17Y, 69, 69);

		ball22 = new Rectangle(ball22X, ball22Y, 69, 69);
		ball24 = new Rectangle(ball24X, ball24Y, 69, 69);
		ball26 = new Rectangle(ball26X, ball26Y, 69, 69);
		ball28 = new Rectangle(ball28X, ball28Y, 69, 69);

		ball31 = new Rectangle(ball31X, ball31Y, 69, 69);
		ball33 = new Rectangle(ball33X, ball33Y, 69, 69);
		ball35 = new Rectangle(ball35X, ball35Y, 69, 69);
		ball37 = new Rectangle(ball37X, ball37Y, 69, 69);

		ball61 = new Rectangle(ball62X, ball62Y, 69, 69);
		ball63 = new Rectangle(ball64X, ball64Y, 69, 69);
		ball65 = new Rectangle(ball66X, ball66Y, 69, 69);

		ball72 = new Rectangle(ball71X, ball71Y, 69, 69);
		ball74 = new Rectangle(ball73X, ball73Y, 69, 69);
		ball76 = new Rectangle(ball75X, ball75Y, 69, 69);
		ball78 = new Rectangle(ball77X, ball77Y, 69, 69);

		ball81 = new Rectangle(ball82X, ball82Y, 69, 69);
		ball83 = new Rectangle(ball84X, ball84Y, 69, 69);
		ball85 = new Rectangle(ball86X, ball86Y, 69, 69);
		ball87 = new Rectangle(ball88X, ball88Y, 69, 69);
	}

}
