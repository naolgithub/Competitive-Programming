class Solution:
    def kItemsWithMaximumSum(self, numOnes: int, numZeros: int, numNegOnes: int, k: int) -> int:
        bagItems=[]
        sumOfItems=0
        for naol in range(numOnes):
            bagItems.append(1)
        for naol in range(numZeros):
            bagItems.append(0)
        for naol in range(numNegOnes):
            bagItems.append(-1)
        bagItems.sort(reverse=True)
        for naol in range(k):
            sumOfItems+=bagItems[naol]
        return sumOfItems
        