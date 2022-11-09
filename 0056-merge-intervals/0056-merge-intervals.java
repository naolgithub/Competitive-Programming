class Solution {
    public int[][] merge(int[][] intervals) {
    java.util.Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> list=new ArrayList<>();
        for(int[] currentInterval : intervals){
            if(list.size()==0){
                list.add(currentInterval);
            }
            else{
                int[] previousInterval=list.get(list.size()-1);
                if(previousInterval[1]>=currentInterval[0]){
                    previousInterval[1]=Math.max(previousInterval[1],currentInterval[1]);
                }
                else{
                    list.add(currentInterval);
                }
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}