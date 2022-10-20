class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int count = 0;
    for(int i = 0; i <= s.length()-k; i++){
	// Integer.parseInt --> change any string or any other datatype into int.
	// String.substring(start,end) --> will give string part from main string 
	// in range of (start) to (end-1).
        String subString=s.substring(i,i+k);
        int contiguousNumber = Integer.parseInt(subString);
        if(contiguousNumber > 0 && num%contiguousNumber==0){
            count++;
        }
    }
        return count;
    }
}