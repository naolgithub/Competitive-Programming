class Solution:
    def canVisitAllRooms(self, rooms: List[List[int]]) -> bool:
        queue=deque()
        queue.append(0)
        visitedRoom=set()
        while queue:
            currentRoom=queue.popleft()
            if currentRoom not in visitedRoom:
                visitedRoom.add(currentRoom)
            
            for currentRoomKey in rooms[currentRoom]:
                if currentRoomKey not in visitedRoom:
                    queue.append(currentRoomKey)
        return len(visitedRoom)==len(rooms)