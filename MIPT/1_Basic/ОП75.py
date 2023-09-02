def comp (a,b):
	if a<b:
		return True
	else:
		return False

n = int(input())
a = []

for i in range(n):
	a.append(int(input()))

for i in range(len(a)):
	for j in range(len(a)-1):
		if comp(a[j],a[j+1]) == True:
			t = a[j+1]
			a[j+1] = a[j]
			a[j] = t

for i in range(len(a)):
	print(a[i])
