class Solution {
    public int calculate(String s) {
return evaluateExpression(s.replaceAll(" ", "").toCharArray(), new int[]{0});
    }
    private static int evaluateExpression(char[] chars, int[] index) {
        int result = 0;
        int number = 0;
        int sign = 1; 

        while (index[0] < chars.length) {
            char ch = chars[index[0]];

            if (Character.isDigit(ch)) {
               
                number = number * 10 + (ch - '0');
            } else if (ch == '+') {
                
                result += sign * number;
                number = 0;
                sign = 1;
            } else if (ch == '-') {
                
                result += sign * number;
                number = 0;
                sign = -1;
            } else if (ch == '(') {
                index[0]++;
                result += sign * evaluateExpression(chars, index);
                number = 0;
            } else if (ch == ')') {
                result += sign * number;
                return result;
            }

            index[0]++;
        }
        result += sign * number;
        return result;
    }
}