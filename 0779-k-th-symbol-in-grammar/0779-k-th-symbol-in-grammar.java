class Solution {
    public int kthGrammar(int n, int k) {
        if(n==1) return 0;
        int prevK=kthGrammar(n-1,(k+1)/2);
        if(prevK==0){
            return k%2==1? 0 : 1;
        }
        else{
            return k%2==1? 1 : 0;
        }
    }
}