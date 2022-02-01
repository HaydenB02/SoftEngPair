package levelPieces;

import java.util.ArrayList;

import gameEngine.Drawable;
import gameEngine.Moveable;

public class LevelSetup {
	private String currentLevel;
	private Drawable[] gameBoard;
	private ArrayList<Moveable> movingPieces;
	private ArrayList<GamePiece> interactingPieces;
	private int playerLoc;
	
	public LevelSetup(){
		
	}
	public void createLevel(int levelNum) {
		
	}
	public Drawable[] getBoard(){
		return gameBoard;
	}
	public ArrayList<Moveable> getMovingPieces() {
		return movingPieces;
	}
	
	public ArrayList<GamePiece> getInteractingPieces(){
		return interactingPieces;
	}
	public int getPlayerStartLoc() {
		return playerLoc;
	}
}
