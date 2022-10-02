class Solution {
    
public int[][] kClosest(int[][] points, int k){
        Arrays.sort(points, (p1, p2) -> dist(p1) - dist(p2));
        return Arrays.copyOfRange(points, 0, k);
    }

    // Distance of a1 from origin. i.e. (a1[0] - 0)^2 + (a1[1] - 0)^2
    private int dist(int[] a1) {
        return a1[0] * a1[0] + a1[1] * a1[1];
    
    }
}