def solution(s):
    answer = ''
    ls = s.split(' ')
    print(ls)
    for idx,wd in enumerate(ls):
        n = len(wd)
        for i in range(n):
            if(i%2==0):
                answer+=wd[i].upper()
            else:
                answer+=wd[i].lower()
        if(idx<len(ls)-1):
            answer+=' '
    return answer
