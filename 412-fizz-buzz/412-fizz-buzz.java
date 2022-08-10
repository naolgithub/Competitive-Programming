class Solution {
    public List<String> fizzBuzz(int n) {
     List<String> answer=new ArrayList<>();

   for(int i=1;i<=n;i++){
        boolean divisibleByThree=i%3==0;
        boolean divisibleByFive=i%5==0;
 if(divisibleByThree&&divisibleByFive){
        answer.add("FizzBuzz");
          }
    else if(divisibleByThree){
        answer.add("Fizz");
    }
    else if(divisibleByFive){
        answer.add("Buzz");
    }
 else{
     answer.add(Integer.toString(i));
     }
   }
return answer;
    }
}