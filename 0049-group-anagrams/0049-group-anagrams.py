from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        #strs = ["eat","tea","tan","ate","nat","bat"]
        #.       sorted(eat)->aet # Sort the word to find its "signature"
        #        aet:[eat]
        #. anagram_freq[aet].append(eat) # Group the original word under its signature


        # Return all grouped anagrams as a list
        anagram_freq=defaultdict(list) # To group words by their sorted letters
        for current_word in strs:
            sorted_current_word=''.join(sorted(current_word))
            anagram_freq[sorted_current_word].append(current_word)
        return list(anagram_freq.values()) 


        