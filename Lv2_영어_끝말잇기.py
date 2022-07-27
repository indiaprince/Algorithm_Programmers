def solution(n, words):
    answer = []

    dic = {}
    turn = 1
    player = 1
    flag = False
    prev = words[0][0]
    for wd in words:
        
        if(prev[-1]!=wd[0]) :
            flag = True
            break
        if(dic.get(wd)==None):
            dic[wd] = True
        else:
            flag = True
            break
        player+=1
        if(player==n+1):
            turn+=1
            player = 1
            
        prev = wd
            
    if(flag): answer =[player, turn]
    else: answer = [0,0]
    return answer
