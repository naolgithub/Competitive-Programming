class Solution:
    def romanToInt(self, s: str) -> int:
        roman_freq={'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}
        value=roman_freq[s[len(s)-1]]
        for i in range(len(s)-2,-1,-1):
            if roman_freq[s[i]] < roman_freq[s[i+1]]:
                value-= roman_freq[s[i]]
            else:
                value+=roman_freq[s[i]]
        return value