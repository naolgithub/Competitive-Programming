// class Solution {
//     private char shiftLetter(char c, int shift) {
//         int newChar = (c - 'a' + shift) % 26 + 'a';
//         return (char) newChar;
//     }    
//     public String shiftingLetters(String s, int[] shifts) {
//         //brute force approach(TLE)
//         char[] result = s.toCharArray();
        
//         for (int i = 0; i < shifts.length; i++) {
//             for (int j = 0; j <= i; j++) {
//                 result[j] = shiftLetter(result[j], shifts[i]);
//             }
//         }
        
//         return new String(result);
//     }
// }



class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        //optimized approach
        StringBuilder sb=new StringBuilder();
        int totalShiftSum=0;
        for(int i=0;i<shifts.length;i++){
            totalShiftSum+=shifts[i]%26;
        }
        for(int i=0;i<s.length();i++){
            char c = (char) ((s.charAt(i) - 'a' + totalShiftSum) % 26 + 'a');
            sb.append(c);
            totalShiftSum -= shifts[i] % 26; 
        }
        return sb.toString();
    }
}