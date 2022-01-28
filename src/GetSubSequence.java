import java.util.ArrayList;

public class GetSubSequence {
    public static void main(String[] args) {
        String str = "abcd";
        ArrayList<String> answer  = getSss(str);
        System.out.println(answer.toString());
    }

    private static ArrayList<String> getSss(String str) {
        //base
        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> faith = getSss(str.substring(1));
        ArrayList<String> ans = new ArrayList<>(faith);
        for (String s : faith) {
            ans.add(str.charAt(0) + s);
        }
        return ans;
    }
}
