import java.util.*;
public class LessonEight {

	/**
	 * @param args
	 */
	static char[][] battleBoard = new char[10][10];
	
	public static void buildBattleBoard(){
		for(char[] row : battleBoard){
			Arrays.fill(row, '|');
		}
	}
	
	public static void redrawBoard(){
		int k = 1;
		while(k <= 30){ System.out.print('-'); k++; }
		System.out.println();
		
		for(int i = 0; i < battleBoard.length; i++){
			for(int j = 0; j < battleBoard[i].length; j++){
				System.out.print("|" + battleBoard[i][j] + "|");
			}
			System.out.println();
		}
		k = 1;
		while(k <= 30){ System.out.print('-'); k++; }
		System.out.println(); 
		
	}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxXBoardSpace = battleBoard.length - 1;
		int maxYBoardSpace = battleBoard[0].length - 1;
		
		int randNumX, randNumY;
		do{
			randNumX = (int) (Math.random() * maxXBoardSpace);
			randNumY = (int) (Math.random() * maxYBoardSpace);
		}while(battleBoard[randNumX][randNumY] != '*');
		
		this.xPosition = randNumX;
		this.yPosition = randNumY;
		
		this.nameChar1 = this.name.charAt(0);
		battleBoard[this.yPosition][this.xPosition] = this.nameChar1;
	}

}
