class Solution {
    public List<String> generateParenthesis(int n) {
        
        ArrayList<String> l = new ArrayList<String>();
        String op="";
        int open = n;
        int close = n;
        solve(open,close,op,l);
        return l;
    }
    
    static void solve(int o,int c, String op, List<String>l){
        if(o == 0 && c==0){
            l.add(op);
            return;
        }
        if(o!=0){
            String op1 = op;
            op1+='(';
            
            solve(o-1,c,op1,l);
        }
        if(c>o){
            String  op2 = op;
            op2+=')';
            
            solve(o,c-1,op2,l);
        }
        return;
    }
}
