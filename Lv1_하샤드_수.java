class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int tmp = 0;
        String str = Integer.toString(x);
        for(int i=0;i<str.length();i++){
            tmp +=(int)(str.charAt(i)-'0');
        }
        System.out.print(tmp);
        if(x%tmp ==0) {
            answer= true;
        }
        else{
            answer=false;
        }
        return answer;
    }
}
