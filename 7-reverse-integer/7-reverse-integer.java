class Solution {
    public int reverse(int x) {
        int c=0;
        int a=0;
        if(x<0)
        {
            c=1;
            x=-x;
        }
        if(x%10==0)
        {
            x=x/10;
        }
        while(x!=0)
        {
            int r=x%10;
            a=(a*10)+r;
            x=x/10;
           if(a%10!=r) //exceed int range
            {
                return 0;
            }
        }
        if(c==1)
            a=-a;
        return a;
        
    }
}