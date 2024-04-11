class MinStack:

    def __init__(self):
        self.firstStack=[]
        self.secondStack=[]
        self.minElement=float("inf")
        

    def push(self, val: int) -> None:
        self.firstStack.append(val)
        self.minElement = min(self.minElement, val)
        

    def pop(self) -> None:
        if self.firstStack:
            self.firstStack.pop()
            currentElement=float("inf")
            while self.firstStack:
                element=self.firstStack.pop()
                self.secondStack.append(element)
                currentElement=min(currentElement,element)
            self.minElement=currentElement
            while self.secondStack:
                self.firstStack.append(self.secondStack.pop())
                

    def top(self) -> int:
        return self.firstStack[-1]
        

    def getMin(self) -> int:
        return self.minElement
        


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()