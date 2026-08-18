class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int d,c;
        int sum = 0;
        for(String s: operations){
            if(s.equals("C")){
                stack.pop();
            }
           else if(s.equals("D")){
                d = stack.peek();
                stack.push(d*2);
            }
            else if(s.equals("+")){
                d = stack.peek();
                c = stack.get(stack.size()-2);
                stack.push(d+c);
            }
            else{
                int x = Integer.parseInt(s);
                stack.push(x);
            }

        } 
        for(int nums : stack){
           sum+=nums;
        }
        return sum;
    }
}
