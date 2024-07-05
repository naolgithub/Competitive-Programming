class Solution:
    def openLock(self, deadends: List[str], target: str) -> int:
        
        deadends = set(deadends)
        
        if "0000" in deadends or target in deadends:
            return -1

        queue = deque([("0000", 0)])
        visited = set("0000")

        while queue:
            state, numberOfMoves = queue.popleft()

            if state == target:
                return numberOfMoves

            for i in range(4):
                digit = int(state[i])
                for move in (-1, 1):
                    nextDigit = (digit + move) % 10
                    nextState = state[:i] + str(nextDigit) + state[i+1:]

                    if nextState not in deadends and nextState not in visited:
                        visited.add(nextState)
                        queue.append((nextState, numberOfMoves + 1))

        return -1
