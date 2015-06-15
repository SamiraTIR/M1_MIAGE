package miage.sudoku.test.performance;


import java.io.IOException;

/**
 * 
 */

/**
 * @author 
 *
 */
public class Sudoku {
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		int sudo[][];
		String nomfichier = "grille.txt";
		
        System.out.println("Debut execution des fonctions");
        long start = System.currentTimeMillis();		
		sudo = miage.sudoku.main.Sudoku.lecture(nomfichier);
		miage.sudoku.main.Sudoku.valideSudoku(sudo);
		miage.sudoku.main.Sudoku.grilleRemplie(sudo);
		miage.sudoku.main.Sudoku.ligneValide (sudo, 2);
		long end = System.currentTimeMillis();
		System.out.println("Fin execution des fonctions en " + (end - start) + "ms");

	}

}