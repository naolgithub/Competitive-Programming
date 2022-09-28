public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums1.length; i++)
        {
            /*
         if nums1=[1,2,2,1,3,3] and nums2=[2,2,3,3]
         hashmap make the ff: [1(key),2(value)]
                              [2(key),2(value)]
                              [3(key),2(value)]
                              
            so arraylist became list.add(2) and list.add(3)                          i.e list=[2,3]
        */
            if(map.containsKey(nums1[i])) map.put(nums1[i], map.get(nums1[i])+1);
            else map.put(nums1[i], 1);
        }
    
        for(int i = 0; i < nums2.length; i++)
        {
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0)
            {
                list.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i])-1);
            }
        }
    
       int[] result = new int[list.size()];
       for(int i = 0; i < list.size(); i++)
       {
           result[i] = list.get(i);
       }
    
       return result;
    }
}