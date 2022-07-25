class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length>1){
            answer = new int[arr.length-1];
            int tmp = 1000000;
            for(int i =0;i<arr.length;i++){
                if(arr[i]<tmp){
                    tmp = arr[i];
                }
            }
            int idx = 0;
            for(int i = 0 ;i<arr.length;i++){
                if(arr[i]==tmp){
                    continue;
                }
                answer[idx] = arr[i];
                idx++;
            }
        }
        else{
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}
