a,b = map(int,input().split())
c = int(input())

if b+c>=60 : 
    t = (b+c)//60
    m = (b+c)%60
    if t+a>23:
        print((t+a)-24,m)
    else : 
        print(a+t,m)
else : 
    print(a,b+c)