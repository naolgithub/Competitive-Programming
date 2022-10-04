class Solution {
    public String firstPalindrome(String[] words) {
        // two pointers and string
        for(String word : words) {
            if(isPalindrome(word)) return word;
        }
        return "";
    }
    
public boolean isPalindrome(String word) {
	int left = 0;
	int right = word.length() - 1;
	while(left < right) {
		if(word.charAt(left) != word.charAt(right)) return false;
		left++;
		right--;
	}
	return true;
}
}