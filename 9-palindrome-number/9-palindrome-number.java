class Solution {
    public boolean isPalindrome(int x) {
       String s = ""+x;
		StringBuilder sb = new StringBuilder(s);
		String s2 = sb.reverse().toString();
		return s.equals(s2);  
    }
}