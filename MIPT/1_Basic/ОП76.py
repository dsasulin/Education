def comp (a,b):
	if a>b:
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


for elem in (a):
	for i in range(len(elem)):
		for j in range(len(elem)-1):
			if comp(elem[j],elem[j+1]) == True:
				t = elem[j+1]
				elem[j+1] = elem[j]
				elem[j] = t

for i in range( m):
	print(" ".join(str(i) for i in a[i]))