package checkers.Package;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

/**
 * The CheckerPanel class draws the GUI and manages piece location.
 * 
 * @author Jacob Kadluboski
 *
 */
public class CheckerPanel extends JPanel 
implements MouseMotionListener, MouseListener {

	private static final long serialVersionUID = 1L;
	/**
	 * Creates a new instance of the checker class.
	 */
	private Checker checker;
	/**
	 * Creates a new instance of the collision class.
	 */
	private Collision col;
	/**
	 * Boolean values determine which square the mouse is selecting. CHECKSTYLE:OFF
	 * Checkstle disable to avoid repetitive Javadoc
	 */
	boolean highlight11 = false;
	boolean highlight12 = false;
	boolean highlight13 = false;
	boolean highlight14 = false;

	boolean highlight21 = false;
	boolean highlight22 = false;
	boolean highlight23 = false;
	boolean highlight24 = false;

	boolean highlight31 = false;
	boolean highlight32 = false;
	boolean highlight33 = false;
	boolean highlight34 = false;

	boolean highlight41 = false;
	boolean highlight42 = false;
	boolean highlight43 = false;
	boolean highlight44 = false;

	boolean highlight51 = false;
	boolean highlight52 = false;
	boolean highlight53 = false;
	boolean highlight54 = false;

	boolean highlight61 = false;
	boolean highlight62 = false;
	boolean highlight63 = false;
	boolean highlight64 = false;

	boolean highlight71 = false;
	boolean highlight72 = false;
	boolean highlight73 = false;
	boolean highlight74 = false;

	boolean highlight81 = false;
	boolean highlight82 = false;
	boolean highlight83 = false;
	boolean highlight84 = false;

	boolean square11 = false;
	boolean square12 = false;
	boolean square13 = false;
	boolean square14 = false;

	boolean square21 = false;
	boolean square22 = false;
	boolean square23 = false;
	boolean square24 = false;

	boolean square31 = false;
	boolean square32 = false;
	boolean square33 = false;
	boolean square34 = false;

	boolean square61 = false;
	boolean square62 = false;
	boolean square63 = false;
	boolean square64 = false;

	boolean square71 = false;
	boolean square72 = false;
	boolean square73 = false;
	boolean square74 = false;

	boolean square81 = false;
	boolean square82 = false;
	boolean square83 = false;
	boolean square84 = false;
	// CHECKSTYLE:ON
	/**
	 * List of initial piece locations. CHECKSTYLE:OFF Checkstyle disabled to avoid
	 * repetitive Javadoc
	 */
	public int x11 = 87;
	public boolean moved11 = false;
	public int y11 = 33;
	public int x12 = 246;
	public int y12 = 33;
	public int x13 = 407;
	public int y13 = 33;
	public int x14 = 566;
	public int y14 = 33;

	public int x21 = 6;
	public int y21 = 110;
	public int x22 = 166;
	public int y22 = 110;
	public int x23 = 327;
	public int y23 = 110;
	public int x24 = 487;
	public int y24 = 110;

	public int x31 = 88;
	public int y31 = 190;
	public int x32 = 246;
	public int y32 = 190;
	public int x33 = 407;
	public int y33 = 190;
	public int x34 = 566;
	public int y34 = 190;

	public int x41 = 6;
	public int y41 = 270;
	public int x42 = 166;
	public int y42 = 270;
	public int x43 = 327;
	public int y43 = 270;
	public int x44 = 487;
	public int y44 = 270;

	public int x51 = 6;
	public int y51 = 350;
	public int x52 = 166;
	public int y52 = 350;
	public int x53 = 327;
	public int y53 = 350;
	public int x54 = 487;
	public int y54 = 350;

	public int x61 = 6;
	public int y61 = 430;
	public int x62 = 166;
	public int y62 = 430;
	public int x63 = 327;
	public int y63 = 430;
	static int x64 = 487;
	static int y64 = 430;

	public int x71 = 88;
	public int y71 = 510;
	public int x72 = 246;
	public int y72 = 510;
	public int x73 = 407;
	public int y73 = 510;
	public int x74 = 566;
	public int y74 = 510;

	public int x81 = 6;
	public int y81 = 590;
	public int x82 = 166;
	public int y82 = 590;
	public int x83 = 327;
	public int y83 = 590;
	public int x84 = 487;
	public int y84 = 590;

	// CHECKSTYLE:ON
	/**Default constructor for CheckerPanel.
	 * 
	 * 
	 */
	public CheckerPanel() {
		checker = new Checker();
		col = new Collision();
		checker.white11X = x11;
		checker.white11Y = y11;
		col.ball11X = x11;
		col.ball11Y = y11;
		checker.white12X = x12;
		checker.white12Y = y12;
		col.ball13X = x12;
		col.ball13Y = y12;
		checker.white13X = x13;
		checker.white13Y = y13;
		col.ball15X = x13;
		col.ball15Y = y13;
		checker.white14X = x14;
		checker.white14Y = y14;
		col.ball17X = x14;
		col.ball17Y = y14;

		checker.white21X = x21;
		checker.white21Y = y21;
		col.ball22X = x21;
		col.ball22Y = y21;
		checker.white22X = x22;
		checker.white22Y = y22;
		col.ball24X = x22;
		col.ball24Y = y22;
		checker.white23X = x23;
		checker.white23Y = y23;
		col.ball26X = x23;
		col.ball26Y = y23;
		checker.white24X = x24;
		checker.white24Y = y24;
		col.ball28X = x24;
		col.ball28Y = y24;

		checker.white31X = x31;
		checker.white31Y = y31;
		col.ball31X = x31;
		col.ball31Y = y31;
		checker.white32X = x32;
		checker.white32Y = y32;
		col.ball33X = x32;
		col.ball33Y = y32;
		checker.white33X = x33;
		checker.white33Y = y33;
		col.ball35X = x33;
		col.ball35Y = y33;
		checker.white34X = x34;
		checker.white34Y = y34;
		col.ball37X = x34;
		col.ball37Y = y34;

		checker.blue11X = x61;
		checker.blue11Y = y61;
		col.ball62X = x61;
		col.ball62Y = y61;
		checker.blue12X = x62;
		checker.blue12Y = y62;
		col.ball64X = x62;
		col.ball64Y = y62;
		checker.blue13X = x63;
		checker.blue13Y = y63;
		col.ball66X = x63;
		col.ball66Y = y63;
		checker.blue14X = x64;
		checker.blue14Y = y64;
//		col.ball68X = x64;
//		col.ball68Y = y64;

		checker.blue21X = x71;
		checker.blue21Y = y71;
		col.ball71X = x71;
		col.ball71Y = y71;
		checker.blue22X = x72;
		checker.blue22Y = y72;
		col.ball73X = x72;
		col.ball73Y = y72;
		checker.blue23X = x73;
		checker.blue23Y = y73;
		col.ball75X = x73;
		col.ball75Y = y73;
		checker.blue24X = x74;
		checker.blue24Y = y74;
		col.ball77X = x74;
		col.ball77Y = y74;

		checker.blue31X = x81;
		checker.blue31Y = y81;
		col.ball82X = x81;
		col.ball82Y = y81;
		checker.blue32X = x82;
		checker.blue32Y = y82;
		col.ball84X = x82;
		col.ball84Y = y82;
		checker.blue33X = x83;
		checker.blue33Y = y83;
		col.ball86X = x83;
		col.ball86Y = y83;
		checker.blue34X = x84;
		checker.blue34Y = y84;
		col.ball88X = x84;
		col.ball88Y = y84;

		addMouseMotionListener(this);
		addMouseListener(this);
	}

	/**
	 * Paints the board and pieces using Java Swing.
	 * 
	 * @param g g
	 */
	public void paint(final Graphics g) {

		g.setColor(Color.darkGray);
		g.fillRect(0, 0, 660, 700);
		g.setColor(Color.darkGray);
		g.fillRect(660, 0, 700, 700);
		g.setColor(Color.red);
		g.fillRect(2, 26, 80, 80);
		g.fillRect(162, 26, 80, 80);
		g.fillRect(322, 26, 80, 80);
		g.fillRect(482, 26, 80, 80);

		g.fillRect(82, 106, 80, 80);
		g.fillRect(242, 106, 80, 80);
		g.fillRect(402, 106, 80, 80);
		g.fillRect(562, 106, 80, 80);

		g.fillRect(2, 186, 80, 80);
		g.fillRect(162, 186, 80, 80);
		g.fillRect(322, 186, 80, 80);
		g.fillRect(482, 186, 80, 80);

		g.fillRect(82, 266, 80, 80);
		g.fillRect(242, 266, 80, 80);
		g.fillRect(402, 266, 80, 80);
		g.fillRect(562, 266, 80, 80);

		g.fillRect(2, 346, 80, 80);
		g.fillRect(162, 346, 80, 80);
		g.fillRect(322, 346, 80, 80);
		g.fillRect(482, 346, 80, 80);

		g.fillRect(82, 426, 80, 80);
		g.fillRect(242, 426, 80, 80);
		g.fillRect(402, 426, 80, 80);
		g.fillRect(562, 426, 80, 80);

		g.fillRect(2, 506, 80, 80);
		g.fillRect(162, 506, 80, 80);
		g.fillRect(322, 506, 80, 80);
		g.fillRect(482, 506, 80, 80);

		g.fillRect(82, 586, 80, 80);
		g.fillRect(242, 586, 80, 80);
		g.fillRect(402, 586, 80, 80);
		g.fillRect(562, 586, 80, 80);

		g.setColor(Color.black);
		checker.checkerBlue11(g);
		checker.checkerBlue12(g);
		checker.checkerBlue13(g);
		checker.checkerBlue14(g);
		checker.checkerBlue21(g);
		checker.checkerBlue22(g);
		checker.checkerBlue23(g);
		checker.checkerBlue24(g);
		checker.checkerBlue31(g);
		checker.checkerBlue32(g);
		checker.checkerBlue33(g);
		checker.checkerBlue34(g);

		g.setColor(Color.white);
		checker.checkerWhite11(g);
		checker.checkerWhite12(g);
		checker.checkerWhite13(g);
		checker.checkerWhite14(g);
		checker.checkerWhite21(g);
		checker.checkerWhite22(g);
		checker.checkerWhite23(g);
		checker.checkerWhite24(g);
		checker.checkerWhite31(g);
		checker.checkerWhite32(g);
		checker.checkerWhite33(g);
		checker.checkerWhite34(g);

		repaint();
		g.dispose();
		this.setSize(860, 680);

	}

	/*If mouse clicks on a square a boolean for the square turns true. 
	 * This allows the mouse drag to access the movement for that 
	 * square whilst the others squares are false. 
	 * Dragging the checker on that square around the board. 
	 * When the mouse is released the boolean turns false, 
	 * stopping the checker from
	 * moving and making it permanent, 
	 * if regal checks will be carried out. 
	 * If not regal checker returns to original square, 
	 * and play still has to make their move.
	 */
	@Override
	public void mouseDragged(final MouseEvent e) {
		// TODO Auto - generated method stub
		mouseDragged1(e);
		mouseDragged2(e);
	}
	
	/**Helper method to mouseDragged(), provides half the checks.
	 * @see mouseDragged()
	 * @see mouseDragged2()
	 * 	
	 * @param e e
	 */
	private void mouseDragged1(final MouseEvent e) {
		if (square11) {
			x11 = e.getX() - 34;
			y11 = e.getY() - 34;
			col.ball11X = x11;
			col.ball11Y = y11;
			checker.white11X = x11;
			checker.white11Y = y11;
		}

		if (square12) {
			x12 = e.getX() - 34;
			y12 = e.getY() - 34;
			col.ball13X = x12;
			col.ball13Y = y12;
			checker.white12X = x12;
			checker.white12Y = y12;
		}
		if (square13) {
			x13 = e.getX() - 34;
			y13 = e.getY() - 34;
			col.ball15X = x13;
			col.ball15Y = y13;
			checker.white13X = x13;
			checker.white13Y = y13;
		}
		if (square14) {
			x14 = e.getX() - 34;
			y14 = e.getY() - 34;
			col.ball17X = x14;
			col.ball17Y = y14;
			checker.white14X = x14;
			checker.white14Y = y14;
		}
		//
		if (square21) {
			x21 = e.getX() - 34;
			y21 = e.getY() - 34;
			col.ball22X = x21;
			col.ball22Y = y21;
			checker.white21X = x21;
			checker.white21Y = y21;
		}
		if (square22) {
			x22 = e.getX() - 34;
			y22 = e.getY() - 34;
			col.ball24X = x22;
			col.ball24Y = y22;
			checker.white22X = x22;
			checker.white22Y = y22;
		}
		if (square23) {
			x23 = e.getX() - 34;
			y23 = e.getY() - 34;
			col.ball26X = x23;
			col.ball26Y = y23;
			checker.white23X = x23;
			checker.white23Y = y23;
		}
		if (square24) {
			x24 = e.getX() - 34;
			y24 = e.getY() - 34;
			col.ball28X = x24;
			col.ball28Y = y24;
			checker.white24X = x24;
			checker.white24Y = y24;
		}
		//
		if (square31) {
			x31 = e.getX() - 34;
			y31 = e.getY() - 34;
			col.ball31X = x31;
			col.ball31Y = y31;
			checker.white31X = x31;
			checker.white31Y = y31;
		}
		if (square32) {
			x32 = e.getX() - 34;
			y32 = e.getY() - 34;
			col.ball33X = x32;
			col.ball33Y = y32;
			checker.white32X = x32;
			checker.white32Y = y32;
		}
		if (square33) {
			x33 = e.getX() - 34;
			y33 = e.getY() - 34;
			col.ball35X = x33;
			col.ball35Y = y33;
			checker.white33X = x33;
			checker.white33Y = y33;
		}
		if (square34) {
			x34 = e.getX() - 34;
			y34 = e.getY() - 34;
			col.ball37X = x34;
			col.ball37Y = y34;
			checker.white34X = x34;
			checker.white34Y = y34;
		}
	}
	/**Helper method to mouseDragged(), provides half the checks.
	 * @see mouseDragged()
	 * @see mouseDragged1()
	 * 	
	 * @param e e
	 */
private void mouseDragged2(final MouseEvent e) {

if (square61) {
	x61 = e.getX() - 34;
	y61 = e.getY() - 34;
	col.ball62X = x61;
	col.ball62Y = y61;
	checker.blue11X = x61;
	checker.blue11Y = y61;
}

if (square62) {
	x62 = e.getX() - 34;
	y62 = e.getY() - 34;
	col.ball64X = x62;
	col.ball64Y = y62;
	checker.blue12X = x62;
	checker.blue12Y = y62;
}
if (square63) {
	x63 = e.getX() - 34;
	y63 = e.getY() - 34;
	col.ball66X = x63;
	col.ball66Y = y63;
	checker.blue13X = x63;
	checker.blue13Y = y63;
}
if (square64) {
	x64 = e.getX() - 34;
	y64 = e.getY() - 34;
	col.ball68X = x64;
	col.ball68Y = y64;
	checker.blue14X = x64;
	checker.blue14Y = y64;
}
//
if (square71) {
	x71 = e.getX() - 34;
	y71 = e.getY() - 34;
	col.ball71X = x71;
	col.ball71Y = y71;
	checker.blue21X = x71;
	checker.blue21Y = y71;
}
if (square72) {
	x72 = e.getX() - 34;
	y72 = e.getY() - 34;
	col.ball73X = x72;
	col.ball73Y = y72;
	checker.blue22X = x72;
	checker.blue22Y = y72;
}
if (square73) {
	x73 = e.getX() - 34;
	y73 = e.getY() - 34;
	col.ball75X = x73;
	col.ball75Y = y73;
	checker.blue23X = x73;
	checker.blue23Y = y73;
}
if (square74) {
	x74 = e.getX() - 34;
	y74 = e.getY() - 34;
	col.ball77X = x74;
	col.ball77Y = y74;
	checker.blue24X = x74;
	checker.blue24Y = y74;
}

if (square81) {
	x81 = e.getX() - 34;
	y81 = e.getY() - 34;
	col.ball82X = x81;
	col.ball82Y = y81;
	checker.blue31X = x81;
	checker.blue31Y = y81;
}
if (square82) {
	x82 = e.getX() - 34;
	y82 = e.getY() - 34;
	col.ball84X = x82;
	col.ball84Y = y82;
	checker.blue32X = x82;
	checker.blue32Y = y82;
}
if (square83) {
	x83 = e.getX() - 34;
	y83 = e.getY() - 34;
	col.ball86X = x83;
	col.ball86Y = y83;
	checker.blue33X = x83;
	checker.blue33Y = y83;
}
if (square84) {
	x84 = e.getX() - 34;
	y84 = e.getY() - 34;
	col.ball88X = x84;
	col.ball88Y = y84;
	checker.blue34X = x84;
	checker.blue34Y = y84;
}	
	}
	

	@Override
	public void mouseMoved(final MouseEvent e) {
		// TODO Auto - generated method stub

	}

	@Override
	public void mouseClicked(final MouseEvent e) {
		// TODO Auto - generated method stub
		System.out.println("  mouse clicked white11X     " 
		+ checker.white11X);
		System.out.println("  mouse cliked white11Y      " 
		+ checker.white11Y);
		System.out.println("  mouse cliked ball11X       " 
		+ col.ball11X);
		System.out.println("  mouse cliked ball11Y       " 
		+ col.ball11Y);
	}

	@Override
	public void mouseEntered(final MouseEvent e) {
		// TODO Auto - generated method stub

	}

	@Override
	public void mouseExited(final MouseEvent e) {
		// TODO Auto - generated method stub

	}

	@Override
	public void mousePressed(final MouseEvent e) {
		mousePressed1(e);
		mousePressed2(e);
	}
	/**Helper method to mousePressed(), provides half the checks.
	 * @see mousePressed()
	 * @see mousePressed2()
	 * 	
	 * @param e e
	 */
	private void mousePressed1(final MouseEvent e) {
		if (e.getX() > col.ball11X && e.getX() < col.ball11X 
				+ col.ball11.width && e.getY() > col.ball11Y
				&& e.getY() < col.ball11Y + col.ball11.height) {
			square11 = true;
			highlight11 = true;
		}

		if (e.getX() > col.ball13X && e.getX() < col.ball13X 
				+ col.ball13.width && e.getY() > col.ball13Y
				&& e.getY() < col.ball13Y + col.ball13.height) {
			square12 = true;
			System.out.println(" pressed " + square12);
		}
		if (e.getX() > col.rect13.x && e.getX() < col.rect13.x 
				+ col.rect13.width && e.getY() > col.rect13.y
				&& e.getY() < col.rect13.y 
				+ col.rect13.height) {
			System.out.println("Out of bounds");
		}
		if (e.getX() > col.ball15X && e.getX() < col.ball15X 
				+ col.ball15.width && e.getY() > col.ball15Y
				&& e.getY() < col.ball15Y + col.ball15.height) {
			square13 = true;
			System.out.println(" pressed " + square13);
		}
		if (e.getX() > col.rect15.x && e.getX() < col.rect15.x 
				+ col.rect15.width && e.getY() > col.rect15.y
				&& e.getY() < col.rect15.y 
				+ col.rect15.height) {
			System.out.println("Out of bounds");
		}
		if (e.getX() > col.ball17X && e.getX() < col.ball17X 
				+ col.ball17.width && e.getY() > col.ball17Y
				&& e.getY() < col.ball17Y + col.ball17.height) {
			square14 = true;
			System.out.println(" pressed " + square14);
		}
		if (e.getX() > col.rect17.x && e.getX() < col.rect17.x 
				+ col.rect17.width && e.getY() > col.rect17.y
				&& e.getY() < col.rect17.y 
				+ col.rect17.height) {
			System.out.println("Out of bounds");
		}
	}
	/**Helper method to mousePressed(), provides half the checks.
	 * @see mousePressed()
	 * @see mousePressed1()
	 * 	
	 * @param e e
	 */
	private void mousePressed2(final MouseEvent e) {
		if (e.getX() > col.ball22X && e.getX() < col.ball22X 
				+ col.ball22.width && e.getY() > col.ball22Y
				&& e.getY() < col.ball22Y + col.ball22.height) {
			square21 = true;
			System.out.println(" pressed " + square21);
		}
		if (e.getX() > col.ball24X && e.getX() < col.ball24X 
				+ col.ball24.width && e.getY() > col.ball24Y
				&& e.getY() < col.ball24Y + col.ball24.height) {
			square22 = true;
			System.out.println(" pressed " + square22);
		}
		if (e.getX() > col.ball26X && e.getX() < col.ball26X 
				+ col.ball26.width && e.getY() > col.ball26Y
				&& e.getY() < col.ball26Y + col.ball26.height) {
			square23 = true;
			System.out.println(" pressed " + square23);
		}
		if (e.getX() > col.ball28X && e.getX() < col.ball28X 
				+ col.ball28.width && e.getY() > col.ball28Y
				&& e.getY() < col.ball28Y + col.ball28.height) {
			square24 = true;
			System.out.println(" pressed " + square24);
		}
		// = =
		if (e.getX() > col.ball31X && e.getX() < col.ball31X 
				+ col.ball31.width && e.getY() > col.ball31Y
				&& e.getY() < col.ball31Y + col.ball31.height) {
			square31 = true;
			System.out.println(" pressed " + square21);
		}
		if (e.getX() > col.ball33X && e.getX() < col.ball33X 
				+ col.ball33.width && e.getY() > col.ball33Y
				&& e.getY() < col.ball33Y + col.ball33.height) {
			square32 = true;
			System.out.println(" pressed " + square22);
		}
		if (e.getX() > col.ball35X && e.getX() < col.ball35X 
				+ col.ball35.width && e.getY() > col.ball35Y
				&& e.getY() < col.ball35Y + col.ball35.height) {
			square33 = true;
			System.out.println(" pressed " + square23);
		}
		if (e.getX() > col.ball37X && e.getX() < col.ball37X 
				+ col.ball37.width && e.getY() > col.ball37Y
				&& e.getY() < col.ball37Y + col.ball37.height) {
			square34 = true;
			System.out.println(" pressed " + square24);
		}
		// = row 7
		if (e.getX() > col.ball71X && e.getX() < col.ball71X 
				+ col.ball72.width && e.getY() > col.ball71Y
				&& e.getY() < col.ball71Y + col.ball72.height) {
			square71 = true;
			System.out.println(" pressed " + square11 
					+ " ball11 x  " + col.ball11.y);

		}
		if (e.getX() > col.ball73X && e.getX() < col.ball73X 
				+ col.ball74.width && e.getY() > col.ball73Y
				&& e.getY() < col.ball73Y + col.ball74.height) {
			square72 = true;
			System.out.println(" pressed " + square12);
		}
		if (e.getX() > col.ball75X && e.getX() < col.ball75X 
				+ col.ball76.width && e.getY() > col.ball75Y
				&& e.getY() < col.ball75Y + col.ball76.height) {
			square73 = true;
			System.out.println(" pressed " + square13);
		}
		if (e.getX() > col.ball77X && e.getX() < col.ball77X 
				+ col.ball78.width && e.getY() > col.ball77Y
				&& e.getY() < col.ball77Y + col.ball78.height) {
			square74 = true;
			System.out.println(" pressed " + square14);
		}
		// = = row 8
		if (e.getX() > col.ball82X && e.getX() < col.ball82X 
				+ col.ball81.width && e.getY() > col.ball82Y
				&& e.getY() < col.ball82Y + col.ball81.height) {
			square81 = true;
			System.out.println(" pressed " + square21);
		}
		if (e.getX() > col.ball84X && e.getX() < col.ball84X 
				+ col.ball83.width && e.getY() > col.ball84Y
				&& e.getY() < col.ball84Y + col.ball83.height) {
			square82 = true;
			System.out.println(" pressed " + square22);
		}
		if (e.getX() > col.ball86X && e.getX() < col.ball86X 
				+ col.ball85.width && e.getY() > col.ball86Y
				&& e.getY() < col.ball86Y + col.ball85.height) {
			square83 = true;
			System.out.println(" pressed " + square23);
		}
		if (e.getX() > col.ball88X && e.getX() < col.ball88X 
				+ col.ball87.width && e.getY() > col.ball88Y
				&& e.getY() < col.ball88Y + col.ball87.height) {
			square84 = true;
			System.out.println(" pressed " + square24);
		}
		// = = row 6
		if (e.getX() > col.ball62X && e.getX() < col.ball62X 
				+ col.ball61.width && e.getY() > col.ball62Y
				&& e.getY() < col.ball62Y + col.ball61.height) {
			square61 = true;
			System.out.println(" pressed " + square21);
		}
		if (e.getX() > col.ball64X && e.getX() < col.ball64X 
				+ col.ball63.width && e.getY() > col.ball64Y
				&& e.getY() < col.ball64Y + col.ball63.height) {
			square62 = true;
			System.out.println(" pressed " + square22);
		}
		if (e.getX() > col.ball66X && e.getX() < col.ball66X 
				+ col.ball65.width && e.getY() > col.ball66Y
				&& e.getY() < col.ball66Y + col.ball65.height) {
			square63 = true;
			System.out.println(" pressed " + square23);
		}
		if (e.getX() > col.ball68X && e.getX() < col.ball68X 
				+ col.ball87.width && e.getY() > col.ball68Y
				&& e.getY() < col.ball68Y + col.ball87.height) {
			square64 = true;
			System.out.println(" pressed " + square24);
		}
	}

	@Override
	public void mouseReleased(final MouseEvent e) {
		// TODO Auto - generated method stub

		highlight11 = false;

		square11 = false;
		square12 = false;
		square13 = false;
		square14 = false;

		square21 = false;
		square22 = false;
		square23 = false;
		square24 = false;

		square31 = false;
		square32 = false;
		square33 = false;
		square34 = false;

		square61 = false;
		square62 = false;
		square63 = false;
		square64 = false;

		square71 = false;
		square72 = false;
		square73 = false;
		square74 = false;

		square81 = false;
		square82 = false;
		square83 = false;
		square84 = false;
		System.out.println(" released " + square11);
	}

}
