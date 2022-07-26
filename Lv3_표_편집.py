from collections import deque
def solution(n, k, cmd):
    answer = ''
    curr = k 
    prev_del = deque([])
    ls = [True for _ in range(n)]
    idx = 0 
    for c in cmd:
        command = c.split()
        N = len(command)
        if(N==2):
            cc, step = command[0], int(command[1])
            if(cc=='D'): 
                cnt = 0 
                while(cnt<step):
                    curr+=1
                    if(ls[curr]) : cnt+=1
            elif(cc=='U') :
                cnt = 0 
                while(cnt<step):
                    curr-=1
                    if(ls[curr]) : cnt+=1
        elif(N==1):
            cc = command[0]
            if(cc=='C'): 
                cnt,step =0, 1
                ls[curr] = False
                prev_del.append(curr)
                flag = False
                while((not flag) and (cnt<step)):
                    curr+=1
                    if(curr==n) : 
                        flag = True
                        break
                    if(ls[curr]) : cnt+=1
                cnt,step =0, 1
                while(flag and (cnt<step)):
                    curr-=1
                    if(ls[curr]) : cnt+=1
                
            elif(cc=='Z'): 
                val = prev_del.pop()
                ls[val] = True
            
    for i in range(n):
        if(ls[i]) : answer+='O'
        else: answer+='X'
    return answer
