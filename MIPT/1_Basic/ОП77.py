def comp (a,b):
	if a<b:
		return True
	else:
		return False




dd = input()
aa = dd.split(" ")
m = int(aa[0])
n = int(aa[1])

a = []

for row in range (m):
	line = [int(i) for i in input().split(" ")]
	a.append(line)

b = a
for i in range(n):
	c = []
	for j in range(m):
		c.append(a[j][i])
	for elem in (c):
		for h in range(len(c)):
			for j in range(len(c)-1):
				if comp(c[j],c[j+1]) == True:
					t = c[j+1]
					c[j+1] = c[j]
					c[j] = t
	for k in range(m):
		b[k][i] = c[k]

for i in range( m):
	print(" ".join(str(i) for i in a[i]))


