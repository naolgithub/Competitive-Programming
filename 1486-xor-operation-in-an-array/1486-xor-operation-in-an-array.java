class Solution {
    public int xorOperation(int n, int start) {
        int bitwiseXOR=0;
        for(int i=0;i<n;i++){
            bitwiseXOR=bitwiseXOR^start+2*i;
        }
        return bitwiseXOR;
    }
}