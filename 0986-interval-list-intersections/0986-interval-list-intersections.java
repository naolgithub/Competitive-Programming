class Solution {
 public int[][] intervalIntersection(int[][] A, int[][] B) {
    List<int[]> list = new ArrayList();
    int aPointer = 0;
    int bPointer=0;
    while( aPointer < A.length && bPointer < B.length){
        //low is the startPoint of intersection
        //high is the endPoint of intersection
        int low = Math.max( A[aPointer][0], B[bPointer][0]);
        int high = Math.min(A[aPointer][1],B[bPointer][1]);
        if( low <= high){
            list.add( new int[]{low,high});
        }
        if( A[aPointer][1] < B[bPointer][1])
            aPointer++;
        else
            bPointer++;
            
    }
   
    return list.toArray(new int[list.size()][]);
}
}