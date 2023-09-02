dd = input()
aa = dd.split(" ")
m = int(aa[0])
n = int(aa[1])

a = []

for row in range (m):
	line = [int(i) for i in input().split(" ")]
	a.append(line)

maxelem  = 0
maxelemstr = 0

for i in range(m):
	for j in range (n):
		if a[i][j]>maxelem:
			maxelem = a[i][j]
			maxelemstr = i

print(maxelemstr)