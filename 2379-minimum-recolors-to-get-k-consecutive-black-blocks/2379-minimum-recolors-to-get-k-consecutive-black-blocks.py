class Solution:
    def minimumRecolors(self, blocks: str, k: int) -> int:
        left=0
        right=len(blocks)
        minOperations=float("inf")
        countWhiteBlocks=0
        for right in range(len(blocks)):
            if blocks[right]=="W":
                countWhiteBlocks+=1
            if right-left+1>=k:
                minOperations=min(minOperations,countWhiteBlocks)
                if blocks[left]=="W":
                    countWhiteBlocks-=1
                left+=1
        return minOperations
        