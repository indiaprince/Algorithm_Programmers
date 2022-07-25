class Solution {
    public String solution(String new_id) {
        String answer = "";
        String tmp ="";
        String tmp2="";
        // 1단계
        for(int i=0;i<new_id.length();i++){
            if(Character.isUpperCase(new_id.charAt(i))){
                tmp +=(char)((int)new_id.charAt(i) + 32);
            }
            else{
                tmp+=new_id.charAt(i);
            }
        }
        for(int i=0;i<tmp.length();i++){
            if(tmp.charAt(i)=='-' || tmp.charAt(i)=='_' || tmp.charAt(i)=='.' || 
               ('a'<=tmp.charAt(i) && 'z'>=tmp.charAt(i)) || ('0'<=tmp.charAt(i) && '9'>=tmp.charAt(i))){
                tmp2+=tmp.charAt(i);
            }
        }
        tmp="";
        int cnt = 0;
        for(int i=0;i<tmp2.length();i++){
            if(tmp2.charAt(i)=='.'){
                cnt++;
            }
            else{
                if(cnt>=1){
                    tmp+='.';
                    tmp+=tmp2.charAt(i);
                }
                else{
                    tmp+=tmp2.charAt(i);
                }
                cnt=0;
            }
        }
        
        tmp2 = "";
        for(int i=0;i<tmp.length();i++){
            if(i==0 || i==tmp.length()-1){
                if(tmp.charAt(i)=='.'){
                    continue;
                }
            }
            tmp2+=tmp.charAt(i);
        }
        
        if(tmp2.length()==0){
            tmp2+='a';
        }
        tmp="";
        for(int i =0 ;i<tmp2.length();i++){
            tmp+=tmp2.charAt(i);
            if(i>=14){
                break;    
            }
        }
        tmp2="";
        for(int i = 0 ;i<tmp.length();i++){
            if(i==tmp.length()-1){
                if(tmp.charAt(i)=='.'){
                    break;
                }
            }
            tmp2+=tmp.charAt(i);
        }
        tmp="";
        tmp = tmp2;
        if(tmp2.length()<=2){
            while(true){
               tmp+=tmp2.charAt(tmp2.length()-1);
                if(tmp.length()==3){
                    break;
                }
            }
        }
        answer = tmp;
        
        return answer;
    }
}
