class Solution {
            /*
            1.If the length of the word is 1 or 2 letters, change all letters to lowercase.
            2.Otherwise, change the first letter to uppercase and the remaining letters to lowercase.
            */
    public String capitalizeTitle(String title) {
        String[] strArr = title.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String currentStr : strArr) {
            if (currentStr.length() > 2) {
                String firstChar = currentStr.substring(0, 1);
                String remainingChars = currentStr.substring(1, currentStr.length());
                
                firstChar = firstChar.toUpperCase();
                remainingChars = remainingChars.toLowerCase();
                
                currentStr = firstChar + remainingChars;
            } else {
                currentStr = currentStr.toLowerCase();
            }
            result.append(currentStr).append(" ");
        }
        return result.toString().trim();
    }
}
  