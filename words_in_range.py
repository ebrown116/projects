mylist = open(input()).read().split()
ub = input()
lb = input()

for i in range(len(mylist)):
    if mylist[i] <= lb and mylist[i] >= ub:
        print(mylist[i])
