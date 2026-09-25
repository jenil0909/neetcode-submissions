
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        int sum = 0;

        for (String op : operations) {
            if (op.equals("+")) {
                int value1 = s.pop();
                int value2 = s.peek();
                int newScore = value1 + value2;
                s.push(value1);
                s.push(newScore);
                sum += newScore;
            } else if (op.equals("D")) {
                int newScore = s.peek() * 2;
                s.push(newScore);
                sum += newScore;
            } else if (op.equals("C")) {
                sum -= s.pop(); // Directly subtract the cancelled score
            } else {
                int newScore = Integer.parseInt(op);
                s.push(newScore);
                sum += newScore;
            }
        }
        return sum; 
    }
}
