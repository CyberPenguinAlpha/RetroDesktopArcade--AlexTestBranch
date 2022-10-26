
/**
 * Piece is an abstract parent class of each of the 7 standard Tetris pieces. It exists to provide a foundational
 * structure for a specific Tetris piece (i.e., S-piece, I-piece, Square-piece) to extend.
 * 
 * @author btj926 testing comment
 */
public class Piece {
	
	private int x,y; //The coordinate position of the piece, where (0,0) is the bottom left unit of the 10x20 game board.
	private int orientation; //The orientation of the piece as an integer representing 90 degree increments.
	private int type; //The type of the piece as an integer, ranging from 0-6 (Z-, L-, O-, S-, I-, J-, and T-Pieces respectively; Ordered by color).
	
	/**
	 * Constructor for the Piece class. Initializes orientation to 0, type to the given value, and (x,y) to (4,20), where (0,0) is the bottom left unit of the
	 * game board. (4,20) corresponds to the left-center column (the game board is 10x20, so there is no true center tile) and the first row above the game board.
	 * 
	 * @param type The type of Piece to create (Z-, L-, O-, S-, I-, J-, or T-Piece)
	 */
	public Piece(int type) {
		this.x = 4;
		this.y = 20;
		this.orientation = 0;
		this.type = type;
	}
	
	/**
	 * Returns the current x-value of the piece.
	 * 
	 * @return the current x-value of the piece.
	 */
	public int getX() {
		return this.x;
	}
	
	/**
	 * Returns the current y-value of the piece.
	 * 
	 * @return the current y-value of the piece.
	 */
	public int getY() {
		return this.y;
	}
	
	/**
	 * Returns the orientation of the piece.
	 * 
	 * @return the orientation of the piece as an integer representing 90 degree increments.
	 */
	public int getOrientation() {
		return this.orientation;
	}
	
	/**
	 * Returns the type of the piece.
	 * 
	 * @return the type of the piece as an integer ranging from 0-6 (Z-, L-, O-, S-, I-, J-, and T-Pieces respectively)
	 */
	public int getType() {
		return this.type;
	}
	
	/**
	 * Moves the piece once in the given horizontal direction.
	 * 
	 * @param direction The direction in which to move the piece, given as a character ('L' or 'R', for Left or Right).
	 */
	public void slide(char direction) {
		if (direction == 'L') this.x -= 1;
		else if (direction == 'R') this.x += 1;
	}
	
	/**
	 * Rotates the piece clockwise around its origin by 90 degrees.
	 */
	public void rotate() {
		this.orientation += 1;
		if (this.orientation > 3) this.orientation = 0;
	}
	
	/**
	 * Drops the piece by 1 line.
	 */
	public void advance() {
		this.y -= 1;
	}
}