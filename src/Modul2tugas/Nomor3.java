package Modul2tugas;
public class Nomor3 {
  public static void main (String[] args){
        int [][] A = {
            {2, 7, 4},
            {4, 3, 5},
        };
        int[][] B = {
            {3, 7},
            {2, 6},
            {4, 8}
        };
        if (A[0].length == B.length) {
            int[][] C = new int [A.length][B[0].length];
            for (int i=0; i<A.length; i++) {
                for (int j=0; j<B[0].length; j++){
                    for (int k=0; k<A[0].length; k++) {
                        C[i][j] += A[i][k]*B[k][j];
                    }
                }
            }
            for (int[] c: C){
                for (int i: c){
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Ukuran kolom A tidak sama dengan baris B");
        }
    }  
}
