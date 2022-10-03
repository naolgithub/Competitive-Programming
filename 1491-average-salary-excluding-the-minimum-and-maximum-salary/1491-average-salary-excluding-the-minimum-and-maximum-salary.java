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
        
        
        //METHOD TWO TC:O(NlogN)
        //           SC:O(1)
        /*
        Arrays.sort(salary);
        int sumSalary=0;
        for(int i=0;i<salary.length;i++){
            sumSalary+=salary[i];
        }
        return (double)(sumSalary-salary[salary.length-1]-salary[0])/(salary.length-2);
        */
    }
}