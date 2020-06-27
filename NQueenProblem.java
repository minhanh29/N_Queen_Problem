import java.util.Scanner;

public class NQueenProblem {
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the chess's size: ");
		int size = scan.nextInt();
		
		NQueensSolution problem = new NQueensSolution(size);
		problem.solve();
	}
}
