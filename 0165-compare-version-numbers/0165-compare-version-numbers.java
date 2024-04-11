class Solution {
    public int compareVersion(String version1, String version2) {
        String[] arrayOne = version1.split("\\.");
        String[] arrayTwo = version2.split("\\.");

        int first = 0;
        int second = 0;

        while (first < arrayOne.length || second < arrayTwo.length) {
            int num1 = first < arrayOne.length ? Integer.parseInt(arrayOne[first]) : 0;
            int num2 = second < arrayTwo.length ? Integer.parseInt(arrayTwo[second]) : 0;

            if (num1 < num2) {
                return -1;
            } else if (num1 > num2) {
                return 1;
            }

            first++;
            second++;
        }

        return 0;
    }
}