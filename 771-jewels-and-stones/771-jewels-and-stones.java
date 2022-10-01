class Solution {
    public int numJewelsInStones(String jewels, String stones) {
     HashSet<Character> set=new HashSet<>();
        int counter=0;
        for(char jewel:jewels.toCharArray()){
            set.add(jewel);
        }
        for(char stone:stones.toCharArray()){
            if(set.contains(stone)) counter++;
        }
        return counter;
    }
}