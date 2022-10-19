class Solution {
    public int[] findOriginalArray(int[] changed) {
         if(changed.length%2!=0) return new int[0];
        
        Arrays.sort(changed);
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int num: changed) map.put(num,map.getOrDefault(num,0)+1);
        int[] res = new int[changed.length/2];
        int pointer = 0;
        
        for(int num:changed){
            if(map.get(num)<1) continue;
            if(map.getOrDefault(num*2,0)<1) return new int[0];
            
            map.put(num,map.get(num)-1);            
            map.put(num*2,map.get(num*2)-1);
            res[pointer++]=num;
        }
        return res;
    }
}