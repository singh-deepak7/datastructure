import java.util.Scanner;

public class TwoD {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] [] arr = new int[2][3];
        for(int i = 0; i < arr.length; i++){
            for(int j =0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        wave(arr);
    }

    public static void wave(int[][] arr){
        int col = 0;
        while ( col < arr[0].length) {
            if (col % 2 == 0) {
                //up to down
                for(int r =0 ; r < arr.length; r++) System.out.print(arr[r][col] + " ");

            } else {
                //down to up
                for(int r = arr.length - 1; r >= 0; r--) System.out.print(arr[r][col] + " ");
            }
            System.out.println();
            col++;
        }
    }
}

