a = str(input())
b = ""
c = []
summa = 0 

for i in range (len(a)):
	if a[i] != '+' and  a[i] != '-':
		b = b + a[i]
	else:
		c.append(int(b))
		c.append(a[i])
		b = ""
c.append(b)

summa = c[0]

for i in range (1, len(c)-1, 2):
	if c[i] == '+':
		summa = summa + int(c[i+1])
	elif c[i] == '-':
		summa = summa - int(c[i+1])

print(summa)

