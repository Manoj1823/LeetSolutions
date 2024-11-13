class Solution {
    int c = 0;
    public int numberOfSteps(int i) {
        if(i == 0){
            return c;
        }
        if(i % 2 == 0){
            c++;
            return numberOfSteps(i / 2);
        }
        else{
            c++;
            return numberOfSteps(i - 1);
        } 
    }
}