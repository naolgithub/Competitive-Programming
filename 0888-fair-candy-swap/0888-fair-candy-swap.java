class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceCandies = 0;
        int bobCandies = 0;  
        for (int numberOfCandy: aliceSizes) aliceCandies += numberOfCandy;
        for (int numberOfCandy: bobSizes) bobCandies += numberOfCandy;
        int delta = (bobCandies - aliceCandies) / 2;
        // If Alice gives x, she expects to receive x + delta

        Set<Integer> setBob = new HashSet();
        for (int x: bobSizes) setBob.add(x);

        for (int x: aliceSizes)
            if (setBob.contains(x + delta))
                return new int[]{x, x + delta};

        return null;
    }
}