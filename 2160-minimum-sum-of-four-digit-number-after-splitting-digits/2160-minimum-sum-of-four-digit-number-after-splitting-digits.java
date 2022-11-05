class Solution {
    public int minimumSum(int num) {
     int[] digit = new int[4]; // For each digit
        int current = 0;
        while(num > 0) // Getting each digit
        {
            digit[current] = num % 10;
            num /= 10;
            current++;
        }
        Arrays.sort(digit); // Ascending order
        int num1 = digit[0] * 10 + digit[2]; // 1st and 3rd digit
        int num2 = digit[1] * 10 + digit[3]; // 2nd and 4th digit
        return num1 + num2;   
    }
}