class Solution {
    public double average(int[] salary) {
        // METHOD ONE TC:O(N)
        //            SC:O(1)
        int minSalary = Integer.MAX_VALUE;
        int maxSalary = Integer.MIN_VALUE;
        int sumSalary = 0;
        for(int i = 0; i < salary.length; i++) {
            minSalary = Math.min(minSalary, salary[i]);
            maxSalary = Math.max(maxSalary, salary[i]);
            sumSalary += salary[i];
        }
        return (double) (sumSalary - minSalary - maxSalary) / (salary.length - 2);
    }
}