class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        java.util.Arrays.sort(arr);
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=arr.length-1;i++){
            min=Math.min(min,(arr[i]-arr[i-1]));
        }
        for(int i=1;i<=arr.length-1;i++){
            if((arr[i]-arr[i-1])==min){
                list.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }
        return list;
    }
}