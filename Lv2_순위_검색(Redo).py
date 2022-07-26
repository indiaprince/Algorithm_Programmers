from collections import deque
def solution(info, query):
    answer = []
    
    table = []
    for inf in info:
        row = inf.split()
        table.append(row)
    table.sort()
    
    que = deque(query)
    while(que):
        num = 0
        q = que.popleft()
        q = q.split()
        l,f,c,sf,s = q[0],q[2],q[4], q[6], q[7]
        tmp1 = deque([])
        tmp2 = deque([])
        if(l=='-'): tmp1 = deque([idx for idx in range(len(table))])
        else: 
            for idx,t in enumerate(table):
                if(l==t[0]) : tmp1.append(idx)
                
                
        if(f!='-'):
            while(tmp1):
                pp = tmp1.pop()
                if(f==table[pp][1]) : tmp2.append(pp)
        else:
            while(tmp1):
                pp = tmp1.pop() 
                tmp2.append(pp)
        if(c!='-'):
            while(tmp2):
                pp = tmp2.pop()
                if(c==table[pp][2]) : tmp1.append(pp) 
        else:
            while(tmp2):
                pp = tmp2.pop() 
                tmp1.append(pp)
        if(sf!='-'):
            while(tmp1):
                pp = tmp1.pop()
                if(sf==table[pp][3]) : tmp2.append(pp)      
        else:
            while(tmp1):
                pp = tmp1.pop() 
                tmp2.append(pp)
            
        while(tmp2):
            pp = tmp2.pop()
            if(int(table[pp][4])>=int(s)): 
                num+=1
        
        answer.append(num)
    
    return answer
