class Solution:
    def minSteps(self, s: str, t: str) -> int:
        minimum_count=0
        freq_s={}
        freq_t={}
        for char in s:
            freq_s[char]=freq_s.get(char,0)+1
        for char in t:
            freq_t[char]=freq_t.get(char,0)+1
        for char in freq_s:
            if freq_s[char]>freq_t.get(char,0):
                minimum_count+=freq_s[char]-freq_t.get(char,0)
        for char in freq_t:
            if freq_t[char]>freq_s.get(char,0):
                minimum_count+=freq_t[char]-freq_s.get(char,0)
        return minimum_count