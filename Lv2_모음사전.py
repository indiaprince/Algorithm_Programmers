dic = []
def dfs(vowel,cur_len, max_len, wd):
    dic.append(wd)
    if(cur_len ==max_len) : return
    
    for i in range(5):
        dfs(vowel, cur_len+1,max_len, wd+vowel[i])
def solution(word):
    answer = 0
    
    vowel = ['A', 'E', 'I', 'O', 'U']
    max_len = 5
    
    length = 0
    wd = ''
    dfs(vowel,length,max_len, wd)
    for idx,wd in enumerate(dic):
        if(wd==word): answer = idx
    return answer
