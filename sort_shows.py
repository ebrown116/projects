mylist = open(input()).read().split('\n')
mydict = {}
newlist = []
file = open('output_keys.txt', 'w')
for i in range(0, len(mylist)-1, 2):
    if mylist[i] not in mydict:
        mydict[mylist[i]] = mylist[i+1]
    else:
        mydict[mylist[i]] = mydict[mylist[i]] + '; ' + mylist[i+1]
for key in mydict.keys():
    if key not in newlist:
        newlist.append(key)
newlist.sort()
for num in newlist:
    file.write(num.lstrip('0'))
    file.write(': ')
    file.write(mydict[num])
    file.write('\n')
file.close()
f = open('output_titles.txt','w')
newlist2 = []
for i in range(len(mylist)):
    if not mylist[i].isdigit():
        newlist2.append(mylist[i])
newlist2.sort()
for i in newlist2:
    if i != '':
        f.write(i)
        f.write('\n')
f.close
