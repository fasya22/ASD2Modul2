package Modul2tugas;
public class Nomor2 {
    public static void main (String[] args) {
    int [][] A = {
        {4, 9},
        {5, 6},
        {10, 8}     
    };
    int [][] B = {
        {1, 4},
        {3, 5},
        {6, 2}
    };
    if ((A.length == B.length) && (A[0].length == B[0].length)) {
        int[][] C = new int [A.length][A[0].length];
        for (int i=0; i<A.length; i++) {
            for (int j=0; j<A[0].length; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }
            for (int[] c: C) {
                for (int q: c) {
                    System.out.print(q+" ");
                }
                System.out.println();
            }
    }
    else {
        System.out.println("Ukuran matrix tidak sama");
}
}
}
