class Solution {
    public int count =0 ;
    int[] oper = {1, -1};
    public void dfs(int[] numbers, int target,int idx, int curr,int N){
        if(idx==N) {
            if(target == curr) {
                count = count+1;
            }
            return;
        }

        for(int i =0 ;i < 2 ;i++){        
            int new_val = curr + oper[i] * numbers[idx];
            dfs(numbers, target, idx+1, new_val ,N);
        }
    }
    public int solution(int[] numbers, int target) {
        int answer = 0;
        int curr = 0 ;
        int idx =0;
        int N = numbers.length;
        for(int i =0 ;i < 2 ;i++){        
            int new_val = curr + oper[i] * numbers[idx];
            dfs(numbers, target, idx+1, new_val ,N);
        }
        answer = count;
        return answer;
    }
}
