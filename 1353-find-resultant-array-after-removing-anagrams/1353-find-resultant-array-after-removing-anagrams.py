class Solution:
    def removeAnagrams(self, words: List[str]) -> List[str]:
        # Brute force

        # resultant_array=[words[0]]
        # for i in range(1,len(words)):
        #     if sorted(words[i])!=sorted(words[i-1]):
        #         resultant_array.append(words[i])
        # return resultant_array

        # Optimized approach
        def count_chars(word):
            freq=[0]*26
            for char in word:
                freq[ord(char)-ord('a')]+=1
            return freq
        resultant_array=[words[0]]
        previous_count=count_chars(words[0])
        for i in range(1,len(words)):
            current_count=count_chars(words[i])
            if current_count!=previous_count:
                resultant_array.append(words[i])
                previous_count=current_count
        return resultant_array


        