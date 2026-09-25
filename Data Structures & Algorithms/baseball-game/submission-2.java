class Solution {
    public int calPoints(String[] operations) {
       Stack<Integer> s=new Stack();
       int i=0;
       while(i<operations.length){
         if(operations[i].equals("+")){
            int value1=s.pop();
            int value2=s.peek();
            s.push(value1); 
            s.push(value1+value2); 
         }else if(operations[i].equals("D")){
           s.push(s.peek()*2);
         }else if(operations[i].equals("C")){
            if(!s.isEmpty()){
               s.pop(); 
            }
         }else{
            s.push(Integer.parseInt(operations[i]));
         }
         i++;
       }
       int sum=0;
       while(!s.isEmpty()){
        sum+=s.pop();
       }
       return sum; 
    }
}