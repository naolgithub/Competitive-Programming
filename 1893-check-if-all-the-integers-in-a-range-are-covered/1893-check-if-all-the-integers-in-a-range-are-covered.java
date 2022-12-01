class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        HashSet<Integer> rangeSet = new HashSet<>();
      for(int i = 0 ; i < ranges.length; i++) {
        for(int j = ranges[i][0]; j <= ranges[i][1]; j++)
          rangeSet.add(j);  
      }
      for(int x = left; x <= right; x++){
        if(!rangeSet.contains(x)) return false;
      }
      return true;
    }
}

