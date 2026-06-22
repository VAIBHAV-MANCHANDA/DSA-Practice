public class OutermostParenthesis{
    public static void main(String[] args){
        result("((()))"); 
    }
    public static void result(String s){
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        int depth = 0;
        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);
            
            if(ch == '('){
                if(depth > 0){
                    ans.append(ch);
                }
                depth++;
            }
            else{
                depth--;
                if(depth > 0){
                    ans.append(ch);
                }
                
            }
                     
        }
        System.out.println(ans);
        
    }
}