class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        long place = 1;
        while (place <= n) {
            long high = n / (place * 10);
            long current = (n / place) % 10;
            long low = n % place;
            if (current == 0) {
                count += high * place;
            } else if (current == 1) {
                count += high * place + (low + 1);
            } else {
                count += (high + 1) * place;
            }
            place *= 10;
        }
        return count;
    }
}
