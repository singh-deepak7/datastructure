import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stack_1 {

    static class MinMaxStack{

        List<Map<String, Integer>> minmaxStack = new ArrayList<Map<String, Integer>>();
        List<Integer> stack = new ArrayList<Integer>();

        public int  peek() {
            return stack.get(stack.size() -1);
        }

        public int pop() {
            minmaxStack.remove(minmaxStack.size() -1);
            return stack.remove(stack.size() -1);
        }

        public void push(int number) {
            Map<String, Integer> newMinMaxStack = new HashMap<String, Integer>();
            newMinMaxStack.put("min", number);
            newMinMaxStack.put("max", number);

            if(minmaxStack.size() > 0) {
                Map<String, Integer> lastMinMaxStack = new HashMap<String, Integer>(minmaxStack.get(minmaxStack.size()-1));
                newMinMaxStack.replace("min", Math.min(lastMinMaxStack.get("min"), number));
                newMinMaxStack.replace("max", Math.max(lastMinMaxStack.get("max"), number));

            }
            minmaxStack.add(newMinMaxStack);
            stack.add(number);

        }

        public int getMin() {
            return minmaxStack.get(minmaxStack.size() -1).get("min");
        }

        public int getMax() {
            return minmaxStack.get(minmaxStack.size() -1).get("max");
        }

    }

}
