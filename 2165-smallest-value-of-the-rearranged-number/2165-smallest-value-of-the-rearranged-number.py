class Solution:
    def smallestNumber(self, num: int) -> int:
        #For negative number
        if num < 0:
            num = num * -1
            stringifiedNumber = sorted(str(num))
            stringifiedNumber.sort(reverse = True)
            return int("".join(['-'] + stringifiedNumber))
        
        
        #For positive number
        else:
            stringifiedNumber = sorted(str(num))

        for i in range(len(stringifiedNumber)):
            if stringifiedNumber[i] !=  '0':
                temp=stringifiedNumber[0]
                stringifiedNumber[0]=stringifiedNumber[i]
                stringifiedNumber[i]=temp
                break

        return int("".join(stringifiedNumber))
