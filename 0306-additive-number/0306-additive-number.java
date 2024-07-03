import java.math.BigInteger;
class Solution {
    private boolean dfs(String number, int index, List<BigInteger> sequence) {
        if (index >= number.length()) {
            return sequence.size() >= 3;
        }

        for (int i = index; i < number.length(); i++) {
            String valString = number.substring(index, i + 1);

            // Handling leading zeros
            if (valString.length() > 1 && valString.charAt(0) == '0') {
                return false;
            }

            BigInteger val = new BigInteger(valString);

            // If the sequence has less than 2 numbers or if the split is valid, append to sequence
            if (sequence.size() < 2 || sequence.get(sequence.size() - 2).add(sequence.get(sequence.size() - 1)).equals(val)) {
                sequence.add(val);
                if (dfs(number, i + 1, sequence)) {
                    return true;
                }
                sequence.remove(sequence.size() - 1);
            }
        }
        return false;
    }

    public boolean isAdditiveNumber(String num) {
        return dfs(num, 0, new ArrayList<>());
    }
}