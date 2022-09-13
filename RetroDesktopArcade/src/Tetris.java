
import java.util.Random;

/**
 * Tetris is a class used to control a game of Tetris. It is given that the user will have already gone through
 * the necessary menus in order to define the parameters of the game, such as difficulty.
 * 
 * @author Xander
 */
public class Tetris {
	
	//TODO: Decide on naming convention for these (colors vs pieces)
	private enum Colors{
		
        EMPTY,
        RED,     //Z-Piece
        ORANGE,  //L-Piece
        YELLOW,  //O-Piece
        GREEN,   //S-Piece
        CYAN,    //I-Piece
        BLUE,    //J-Piece
        PURPLE   //T-Piece
        
    }
	
	private int difficulty = 48; // Number of frames between each movement of the current piece. 
	private int[][] grid; //2D integer array representing each cell on the game board. 0 = empty, 1-7 are the colors of each piece.
	
	public Tetris(int difficulty) {
		
		this.difficulty = difficulty;
		
	}

	public Piece makePiece() {
		
		Random rand = new Random();
		
		Piece piece = new Piece(rand.nextInt() % 7);
		return piece;
		
	}
}
