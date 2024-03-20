class Solution {
    public int countKeyChanges(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.append(Character.toLowerCase(s.charAt(i)));
        }
        s=sb.toString();
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)) count++;
        }
        return count;
    }
}