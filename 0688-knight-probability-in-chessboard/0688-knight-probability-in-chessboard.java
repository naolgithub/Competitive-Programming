class Solution {
    public double knightProbability(int n, int K, int row, int column) {
        double[][][] dp = new double[K+1][n+1][n+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                dp[0][i][j] = 1.0;
            }
        }
        
        for(int k=1;k<=K;k++){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){                    
                    for(int x=-2;x<=2;x++){
                        for(int y=-2;y<=2;y++){
                            boolean validDelta = Math.abs(x) != Math.abs(y) && x !=0 && y != 0;
                            boolean insideBoundary = (i+x <= n && i+x>=1 && y+j >= 1 && y+j <=n);
                            if(validDelta && insideBoundary){
                                dp[k][i][j]+=dp[k-1][x+i][y+j];
                            }
                        }
                    }
                }
            }
        }

        double totalMoves = Math.pow(8.0,K);
        return dp[K][row+1][column+1]/totalMoves;
    }
}