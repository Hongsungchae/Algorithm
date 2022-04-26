import sys 
i = int(sys.stdin.readline())
for j in range(0,i) :
    a,b = map(int,sys.stdin.readline().split())
    print(f"{a+b}")