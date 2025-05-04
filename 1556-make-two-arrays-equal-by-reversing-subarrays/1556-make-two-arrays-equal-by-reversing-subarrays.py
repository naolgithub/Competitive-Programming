class Solution:
    def canBeEqual(self, target: List[int], arr: List[int]) -> bool:
        freq_target={}
        freq_arr={}
        for char in target:
            freq_target[char]=freq_target.get(char,0)+1
        for char in arr:
            freq_arr[char]=freq_arr.get(char,0)+1
        for char in freq_target:
            if freq_target[char]!=freq_arr.get(char,0):
                return False
        return True
        