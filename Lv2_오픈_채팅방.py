def solution(record):
    answer = []
    idd  = []
    dic = {}
    uniq = {}
    cmds = [] 
    for rec in record:
        reclist = rec.split()
        if(len(reclist)==2):
            cmd,uni = reclist[0], reclist[1]
            cmds.append([uni, cmd])
        else:
            cmd, uni, name = reclist[0], reclist[1],reclist[2]
            
            if(cmd =='Change'):
                dic[uni] = name    
                cmds.append([uni, cmd])
            else:
                val = uniq.get(uni)
                if(val == None) : 
                    uniq[uni] = True
                    idd.append(uni)
                    dic[uni] = name
                else:
                    dic[uni] = name
                cmds.append([uni, cmd])
                
    for uni,cmd in cmds:
        if(cmd=='Enter') : answer.append(dic[uni]+'님이 들어왔습니다.')
        elif(cmd=='Leave') : answer.append(dic[uni]+'님이 나갔습니다.')
    
    return answer
