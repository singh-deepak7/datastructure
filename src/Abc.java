public class Abc {
    public static void main(String[] args) {
        int num = 123456789;
        int numberLength = (int) Math.log10(num) + 1;
        int reverseAnswer = 0;
        for (int i = 0; i < numberLength; i++) {
            int remainder = num % 10;
            reverseAnswer = (reverseAnswer * 10) + remainder;
            num = num / 10;
        }
        System.out.println(reverseAnswer);


        ///

        String input = "wwwwaaadexxxxxx";
        StringBuilder sb = new StringBuilder();
        sb.append(input.charAt(0));
        for (int i = 1; i < input.length(); i++) {
            char prev = input.charAt(i - 1);
            char curr = input.charAt(i);
            if (prev != curr) {
                sb.append(curr);
            }
        }
        System.out.println(sb.toString());

        StringBuilder sb1 = new StringBuilder();
        sb1.append(input.charAt(0));
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            char prev = input.charAt(i - 1);
            char curr = input.charAt(i);
            if (prev != curr) {
                sb1.append(counter != 1 ? counter : "");
                sb1.append(curr);
                counter = 1;
            } else {
                counter++;
            }
        }
        sb1.append(counter != 1 ? counter : "");
        System.out.println(sb1.toString());


    }
}
