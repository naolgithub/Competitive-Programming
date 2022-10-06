/*Since we know every chalk is consumed fully we can cancel the iterations that the teacher makes from begining to end by assiging them to students. Lets see how.

So we know when the teacher starts distributing chalks and does that till the end of array she has distributed

= chalk[0] + chalk[1] + chalk[2] + .... + chalk[n-2] + chalk[n-1]

and she again starts from index 0.

Now lets say , chalk[0] + chalk[1] + chalk[2] + .... + chalk[n-2] + chalk[n-1] = SUM

So, if teacher peforms the cycle of distribution of chalks from begining to end Y times ,
the total chalks distributed = SUM * Y

after all cycles she is left with how many chalks ?

remaining = ( k - (SUM * Y) ) = k % SUM

thus we can simply compute this remainder
and then iterate over the chalks array and check which student cannot get the chalk now.
*/
class Solution {
    public int chalkReplacer(int[] chalk, int k) {
		long sum = 0;
		for (int eachChalk : chalk) sum+=eachChalk;
		long remainder = k%sum;

		for (int i= 0 ; i<chalk.length ; i++) {
			if (remainder>=chalk[i] )
				remainder-=chalk[i];
			else
				return i;
		}
		return -1;
	}
}