package materials.src.main.java.org.example.books.grokking_algorithms.main;

import java.util.Arrays;

//Longest Common Subsequence
public class DynamicProgramming {

    private static String wordA;
    private static String wordB;
    private static int [][] cell;

    public void showDynamicProgrammingResult(String wordA, String wordB){
        this.wordA = wordA;
        this.wordB = wordB;
        this.cell = new int[wordA.length()][wordB.length()];

        getResult();

        for (int[] row : cell) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static void getResult(){
        for (int i = 0; i < wordA.length(); i++) {
            for (int j = 0; j < wordB.length(); j++) {
                // The letters match
                if (wordA.charAt(i) == wordB.charAt(j)) {
                    if (i > 0 && j > 0) {
                        cell[i][j] = cell[i - 1][j - 1] + 1;
                    } else {
                        cell[i][j] = 1;
                    }
                } else {
                    // The letters don't match.
                    if (i == 0 && j > 0) {
                        cell[i][j] = cell[i][j - 1];
                    } else if (i > 0 && j == 0) {
                        cell[i][j] = cell[i - 1][j];
                    } else if (i > 0 && j > 0) {
                        cell[i][j] = Math.max(cell[i - 1][j], cell[i][j - 1]);
                    } else {
                        cell[i][j] = 0;
                    }
                }
            }
        }
    }
}
