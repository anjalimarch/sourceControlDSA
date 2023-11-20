package BackTracking;

import java.util.Scanner;

public class testNqueenProblem {

    public static void main(String args [] )throws Exception{

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] [] chess = new int [n][n];

        printQueens(chess, "",0);


    }


    public static void printQueens(int [][] chess, String qsf, int row){
     if(row==chess.length){
       System.out.println(qsf);
         return;


     }

        for(int col= 0; col<chess.length; col++) {
            if (isItaSafePlaceForqueen(chess, row , col)==true) {
                chess[row][col] = 1;
                printQueens(chess, qsf + row + "-" + col + ",", row + 1);
                 chess[row][col] = 0;


            }
        }

    }

    public static boolean isItaSafePlaceForqueen(int [][]chess, int row , int col){
//vertical up
        for(int i =row-1, j=col;i>=0; i--){

            if(chess[i][j]==1){
                return  false;
            }

        }

//diagonally left
        for(int i =row-1, j=col-1;i>=0&&j>=0; i--,j--){

            if(chess[i][j]==1){
                return  false;
            }

        }
//diagonally right
        for(int i =row-1, j=col+1;i>=0&&j<chess.length; i--,j++){

            if(chess[i][j]==1){
                return  false;
            }

        }


        return  true;


    }
}
