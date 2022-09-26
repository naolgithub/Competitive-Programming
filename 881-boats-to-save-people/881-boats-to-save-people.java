class Solution {
    public int numRescueBoats(int[] people, int limit) {
        //sum of the weight of those people is at most equal to limit 
        //people[i] is the weight of the ith person
        //Each boat carries at most two people at the same time
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        int minimumNumberOfBoats=0;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                i++;
                j--;
            minimumNumberOfBoats++;
            }
            else{
                j--;
            minimumNumberOfBoats++;
            }
         
        }
        return minimumNumberOfBoats;
    }
}