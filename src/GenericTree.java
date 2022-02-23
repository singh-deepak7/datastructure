import java.io.*;
import java.util.*;

public class GenericTree {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for (Node child : node.children) {
            display(child);
        }
    }

    public static Node construct(int[] arr) {
        Node root = null;

        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if (st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }

                st.push(t);
            }
        }

        return root;
    }

    public static int size(Node node){
        // write your code here
        int s = 1;
        for( Node child: node.children){
            s += size(child);
        }
        return s;
    }

    public static int height(Node node) {
        // write your code here
        int height = -1;
        for( Node child: node.children){
            height = Math.max(height, height(child));
        }
        return height + 1;
    }

    public static int max(Node node) {
        // write your code here
        int maxS = 0;
        for (Node child : node.children) {
            maxS =  Math.max(maxS, max(child));
        }
        return Math.max(maxS, node.data);
    }

    public static void traversals(Node node){
        // write your code here
        System.out.println("Node Pre "+ node.data);
        for (Node child : node.children) {
            System.out.println("Edge Pre "+ node.data + "--" + child.data);
            traversals(child);
            System.out.println("Edge Post "+ node.data + "--" + child.data);
        }
        System.out.println("Node Post "+ node.data);

    }

    public static void levelOrder(Node node){
        // write your code here
        Queue<Node> que =  new LinkedList<>();
        que.add(node);
        while(!que.isEmpty()){
            Node out = que.remove();
            System.out.print(out.data + " ");
            for(Node child: out.children) que.add(child);

        }
        System.out.println(".");

    }

    public static void levelOrderLinewise(Node node){
        // write your code here
        Queue<Node> que =  new LinkedList<>();
        que.add(node);
        while(!que.isEmpty()){
            int s = que.size();

            for(int i=0; i < s ; i ++){
                Node out = que.remove();
                System.out.print(out.data + " ");
                for(Node child: out.children) que.add(child);

            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        Node root = construct(arr);
        int sz = size(root);
        System.out.println(sz);

        int h = height(root);
        System.out.println(h);

        int m = max(root);
        System.out.println(m);

        traversals(root);

        levelOrder(root);
        levelOrderLinewise(root);

        // display(root);
        // input :  12
        //10 20 -1 30 50 -1 60 -1 -1 40 -1 -1
    }

}