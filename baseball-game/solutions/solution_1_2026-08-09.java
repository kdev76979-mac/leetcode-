class Solution {
    public int calPoints(String[] ops) {
        java.util.Stack<Integer> s = new java.util.Stack<>();
        for (String op : ops)
            if (op.equals("C")) s.pop();
            else if (op.equals("D")) s.push(2 * s.peek());
            else if (op.equals("+")) s.push(s.peek() + s.get(s.size() - 2));
            else s.push(Integer.parseInt(op));
        int sum = 0;
        for (int x : s) sum += x;
        return sum;
    }
}