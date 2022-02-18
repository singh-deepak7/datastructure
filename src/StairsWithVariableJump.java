import java.util.Scanner;

public class StairsWithVariableJump {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i =0; i < n; i ++){
            arr[i] = scn.nextInt();
        }
        System.out.println(climb(arr, n, 0));

    }

    public static int climb(int[] arr, int n, int idx){
        if(arr[idx] == 0) return 0;
        if(arr[idx] == n) return 1;
        int ans = 0;
        for(int i =0; i < n; i++){

        }
        return 0;
    }
}
