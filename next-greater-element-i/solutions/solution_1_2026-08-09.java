import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] a, int[] b) {
        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : b) {
            while (!st.isEmpty() && st.peek() < num)
                map.put(st.pop(), num);
            st.push(num);
        }

        int[] res = new int[a.length];
        for (int i = 0; i < a.length; i++)
            res[i] = map.getOrDefault(a[i], -1);

        return res;
    }
}