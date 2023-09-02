dd = input()
aa = dd.split(" ")
m = int(aa[0])
n = int(aa[1])

a = []

for row in range (m):
	line = [int(i) for i in input().split(" ")]
	a.append(line)

c = int(input())
	
print(" ".join(str(i) for i in a[c]))
