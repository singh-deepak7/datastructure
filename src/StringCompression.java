public class StringCompression {
    public static void main(String[] args) {
        String input = "wwwwaaadexxxxxx";
        StringBuilder sb = new StringBuilder();
        sb.append(input.charAt(0));
        for (int i = 1; i < input.length(); i++) {
            char previous = input.charAt(i - 1);
            char current = input.charAt(i);
            if (previous != current) {
                sb.append(current);
            }
        }
        System.out.println(sb.toString());

        StringBuilder sb1 = new StringBuilder();
        sb1.append(input.charAt(0));
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            char previous = input.charAt(i - 1);
            char current = input.charAt(i);
            if (previous != current) {
                sb1.append(counter != 1 ? counter : "");
                counter = 1;
                sb1.append(current);
            } else {
                counter++;
            }
        }
        sb1.append(counter != 1 ? counter : "");
        System.out.println(sb1.toString());
    }
}
