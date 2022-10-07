/*
In this solution we are using two pointers one for the previos char and one for the current as we are going to check wether the previous one is same as this and if both are same it means we have to compress it

So here i am going to explain algo firstly we are going to take a example aabbccc so in this example 
firstly we will append a into a string or stringbuilder then we will make its count 1 as one of one is there now we will move to for loop  . In for loop we are using  two pointers one is current and another is prev 
prev stores previous character and current stores current character now as:-
we are iterating from 1 as the 1st charcter is already in string builder
now iterating 
1->prev = a , curr = a so count will be 2 . s = a
2->prev = a , curr = b so we will not increase rather will go to else part where we will check if count>1 then we will append it and will also append the char . and reset the count to 1 . a2->a2b
3->prev=b, curr =b count = 2 s=a2b
4->prev= b , curr = c count = 2 so will go in else part as prev!=curr count > 2 so s= a2b2-> a2b2c count =1
5->prev = c ,curr = c count =2 s =a2b2c
6->prev = c , curr = c count =3 s =a2b2c
Now here iteration will stop and our count is still remaing so at last outside the loop we will add the count if >1
so string will be a2b2c3.
So string is compressed now we will copy it to char array . and return its length
*/
class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int  n = chars.length;
        int count = 1;
        sb.append(chars[0]);
        for(int i=1;i<n;i++)
        {
           char curr = chars[i];
           char prev = chars[i-1];
           if(prev==curr)
           {
               count++;
           }
           if(prev!=curr)
           {   if(count>1)
               sb.append(count);
               sb.append(curr);
               count = 1;
           }
        }
        if(count>1)
        {
            sb.append(count);
        }
     
        for(int i=0;i<sb.length();i++)
        {
            chars[i]=sb.charAt(i);
        }
        return sb.length();
    }
}