public class NQueensSolution {
	private int[][] board;
	
	public NQueensSolution (int size)
	{
		board = new int[size][size];
		
		for (int row = 0; row < board.length; row++)
			for (int col = 0; col < board[row].length; col++)
				board[row][col] = 0;
	}
	
	public void solve()
	{
		if (solution(0))
		{
			System.out.println("Solution found!");
			
			for (int row = 0; row < board.length; row++)
			{
				for (int col = 0; col < board[row].length; col++)
					System.out.print(board[row][col] + "\t");
				System.out.println("\n");
			}
		} else
		{
			System.out.println("Solution not found! Try again!");
		}
	}
	
	private boolean isValid(int row, int col)
	{
		int i;
		int j;
		
		// check on the left
		for (i = 0; i < col; i++)
			if (board[row][i] == 1)
				return false;
		
		//check the left diagonal
		for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
				if (board[i][j] == 1)
					return false;
		
		//check the right diagonal
		for (i = row, j = col; i < board.length && j >= 0; i++, j--)
				if (board[i][j] == 1)
					return false;
		
		return true;
	}
	
	private boolean solution(int col)
	{	
		for (int i = 0; i < board.length; i++)
		{
			if (isValid(i, col))
			{
				board[i][col] = 1;
				
				if (col == board.length - 1)
					return true;
			
				if (solution(col + 1))
					return true;
			
				board[i][col] = 0;
			}
		}
		
		return false;
	}
}
