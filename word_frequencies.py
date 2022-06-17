import csv

mylist = open(input()).read().split(',')
udict = {}
mylist[len(mylist)-1] = mylist[len(mylist) - 1].rstrip()

for i in range(len(mylist)):
    if mylist[i] not in udict:
        udict[mylist[i]] = 1
    else:
        udict[mylist[i]] = udict[mylist[i]] + 1

for keys, value in udict.items():
    print(keys, value)
