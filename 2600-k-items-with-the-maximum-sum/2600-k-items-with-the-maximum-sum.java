public class Solution {

    public  int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        ArrayList<Integer> bagItems = new ArrayList();
        for (int i = 0; i < numOnes; i++) {
            bagItems.add(1);
        }
        for (int i = 0; i < numZeros; i++) {
            bagItems.add(0);
        }
        for (int i = 0; i < numNegOnes; i++) {
            bagItems.add(-1);
        }
        
        Collections.sort(bagItems, Collections.reverseOrder());
        int sumOfKItems = 0;
        for (int i = 0; i < k; i++) {
            sumOfKItems += bagItems.get(i);
        }

        return sumOfKItems;
    }
}
