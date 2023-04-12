class Solution {
    public String simplifyPath(String path) {
        String[] parts=path.split("/");
        Stack<String> stack=new Stack<>();
        for(String part:parts){
            if(part.isEmpty()||part.equals(".")){
                continue;
            }
            if(part.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(part);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(String dir:stack){
            sb.append("/").append(dir);
        }
        if(sb.length()==0){
            sb.append("/");
        }
        return sb.toString();
    }
}