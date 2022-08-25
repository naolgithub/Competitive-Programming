class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> setOne=new HashSet<>();
        List<Integer> intersectedNums=new ArrayList<>();
        
        for(int numOne:nums1){
        setOne.add(numOne);
        }
        
        for(int numTwo:nums2){
            if(setOne.contains(numTwo)){
             intersectedNums.add(numTwo);
             setOne.remove(numTwo);
                }
        }
        
        int[] answer=new int[intersectedNums.size()];
        for(int i=0;i<intersectedNums.size();i++){
            answer[i]=intersectedNums.get(i);
        }
        return answer;
    }
}