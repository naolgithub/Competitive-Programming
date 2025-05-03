class Solution:
    def removeAnagrams(self, words: List[str]) -> List[str]:
        resultant_array=[words[0]]
        for i in range(1,len(words)):
            if sorted(words[i])!=sorted(words[i-1]):
                resultant_array.append(words[i])
        return resultant_array

        