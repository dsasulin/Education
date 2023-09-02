dd = input()
aa = dd.split(" ")
m = int(aa[0])
n = int(aa[1])

a = []

for row in range (m):
	line = [int(i) for i in input().split(" ")]
	a.append(line)

c = int(input())
	
col =[]
for j in range(m):
	col.append(a[j][c])

print(" ".join(str(i) for i in col))
