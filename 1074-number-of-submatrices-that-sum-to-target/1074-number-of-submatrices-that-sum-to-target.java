class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
        int count = 0;
        for(int i=0;i<matrix[0].length;i++){
            for(int j=i;j<matrix[0].length;j++){
                Map<Integer, Integer> mp = new HashMap<>();
                mp.put(0, 1);
                int sum = 0;
                for(int r=0;r<matrix.length;r++){
                    if(i==0) sum += matrix[r][j];
                    else
                        sum += matrix[r][j]-matrix[r][i-1];
                    count += mp.getOrDefault(sum-target, 0);
                    mp.put(sum, mp.getOrDefault(sum, 0)+1);
                }
            }
        }
        return count;
    }
}