/*
Here what we are actually doing is as we calculate prefix sum of an array
here we calculate prefix xor of the given array

we also take advantage of the fact that xor of two same element is zero

let us take an example
arr = {1,2,3,4,5,6,7,8,9}
let assume the xorArray is = {x1,x2,x3,x,x5,x6,x7,x8,x9} 
(xi -> xor till element i)

now to calculate xor between x=3 to x=6
what we can do is 
xor[3-6] = xor[till 6] ^ xor[till 3-1]
or in other words
xor[left - right] = xor[till right] ^ xor[till left-1];

now why would this work
see
xor till 6 is xor of all element from 1 to 6
and xor till 2 is xor of all element till 1 to 2
to calculate 3 to 6 , we can simply xor till 6 ^ xor till 2 
this will nullify the xor till 2 and remaining xor will be of 3 to 6

I hope it is clear :) :)
*/
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] xorArray = new int[arr.length];
        xorArray[0] = arr[0];
        for(int i = 1 ; i<arr.length ; i++) {
            xorArray[i] = arr[i] ^ xorArray[i-1];
        }
        int ans[] = new int[queries.length];
        for(int i = 0; i < queries.length ; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            if(l == 0) ans[i] = xorArray[r];
            else ans[i] = xorArray[r] ^ xorArray[l-1];
        }
        return ans;
    }
}
