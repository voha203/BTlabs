package Labs5;

public class Task2_1 {
	    private static final char EMPTY = ' ';
	    private char[][] board;

	    public Task2_1() {
	        // Initialize the board with empty cells
	        board = new char[3][3];
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                board[i][j] = EMPTY;
	            }
	        }
	    }

	    public boolean checkRows() {
	        for (int row = 0; row < 3; row++) {
	            if (board[row][0] != EMPTY && board[row][0] == board[row][1] && board[row][0] == board[row][2]) {
	                return true;
	            }
	        }
	        return false;
	    }

	    public static void main(String[] args) {
	    	Task2_1 game = new Task2_1();
	        
	        // Simulating a winning scenario for player X
	        game.board[0][0] = 'X';
	        game.board[0][1] = 'X';
	        game.board[0][2] = 'X';
	        
	        boolean win = game.checkRows();
	        System.out.println("Did a player win? " + win);
	    }
	}
