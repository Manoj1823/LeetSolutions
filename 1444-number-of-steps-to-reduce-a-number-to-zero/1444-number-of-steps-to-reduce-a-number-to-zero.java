class Solution {
    int c = 0;
    public int numberOfSteps(int i) {
        return helper(i, c);
    }
    static int helper(int n, int c){
        if(n==0) {
            return c;
        }
        if(n%2 == 0){
            return helper(n/2, c+1);
        }
            return helper(n-1, c+1);
        }
    }
