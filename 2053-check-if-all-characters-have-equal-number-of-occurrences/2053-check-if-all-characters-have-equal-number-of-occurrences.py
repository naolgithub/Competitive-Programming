class Solution:
    def areOccurrencesEqual(self, s: str) -> bool:
        freq={}
        for char in s:
            freq[char]=freq.get(char,0)+1
        first_value=freq[s[0]]
        for char in freq:
            if freq[char]!=first_value:
                return False
        return True
        