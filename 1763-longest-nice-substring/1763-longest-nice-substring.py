class Solution:
    def longestNiceSubstring(self, s: str) -> str:
        if not s or len(s) < 2:
            return ""

        def isNice(substring) -> bool:
            lower = [False] * 26
            upper = [False] * 26
            
            for char in substring:
                
                if char.islower():
                    lower[ord(char) - ord('a')] = True
                elif char.isupper():
                    upper[ord(char) - ord('A')] = True
                    
            for i in range(26):
                if lower[i] != upper[i]:
                    return False
            return True
        
        result = ""
        n = len(s)
        for i in range(n):
            for j in range(i + 1, n + 1):
                substring = s[i:j]
                if isNice(substring) and len(substring) > len(result):
                    result = substring

        return result

