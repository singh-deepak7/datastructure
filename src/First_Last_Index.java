public class First_Last_Index {
    public static void main(String[] args) {
        int arr[] = new int[]{2, 3, 4, 2, 3, 6};
        int matchingDigit = 3;
        for (int i = 0; i < arr.length; i++) {
            if (matching(arr[i], matchingDigit)) {
                System.out.println(i);
                break;
            } else {
                System.out.println(" not matching");
            }
        }
        System.out.println(firstIndex(arr, 3, 0));
        System.out.println(LastIndex(arr, 3, arr.length - 1));

    }

    // For
    private static boolean matching(int arr, int matchingDigit) {
        return arr == matchingDigit;
    }

    // recursion
    private static int firstIndex(int[] arr, int digit, int index) {
        if (arr.length == index) {
            return -1;
        }
        return arr[index] == digit ? index : firstIndex(arr, digit, index + 1);
    }

    //recursion
    private static int LastIndex(int[] arr, int digit, int index) {
        if (arr.length == index) {
            return -1;
        }
        return arr[index] == digit ? index : LastIndex(arr, digit, index - 1);
    }

}
