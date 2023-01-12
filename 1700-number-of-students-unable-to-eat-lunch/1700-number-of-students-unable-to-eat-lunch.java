class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> preferences = new LinkedList<>();
        for (int student: students) {
            preferences.offer(student);
        }
        int countRefused = 0;
        int current = 0;
        while (countRefused != preferences.size() && !preferences.isEmpty()) {
            if (preferences.peek() == sandwiches[current]) {
                current++;
                countRefused = 0;
                preferences.remove();
            } else {
                preferences.offer(preferences.remove());
                countRefused++;
            }
        }
        return preferences.size();

    }
}