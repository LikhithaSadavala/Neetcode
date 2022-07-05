class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer[]> stack = new Stack<>();

        for (int i = 0 ; i < n ; i++) {
            while (!stack.isEmpty() && stack.peek()[0] < temperatures[i]) {
                Integer[] temp = stack.pop();
                result[temp[1]] = i - temp[1];
            }
            stack.push(new Integer[]{temperatures[i], i});
        }
        return result;
    }
}
