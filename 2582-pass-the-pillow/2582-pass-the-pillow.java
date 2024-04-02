class Solution {
    public int passThePillow(int n, int time) {
        int direction = 1; // 1 for passing right, -1 for passing left
        int currentPerson = 1; // Start from the first person
        for (int i = 1; i <= time; i++) {
            if (currentPerson == 1) {
                direction = 1; // Start passing to the right
            } else if (currentPerson == n) {
                direction = -1; // Start passing to the left
            }
            currentPerson += direction; // Move to the next person
        }
        return currentPerson;
    }
}