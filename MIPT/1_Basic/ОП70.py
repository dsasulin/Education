a = input()
b = []

for i in range(len(a)):
	b.append(input())

c = input() 

strlen = 0
srtnum = 0 
for i in range(len(b)):
	if c in b[i]:
		if len(b[i]) > strlen:
			strlen = len(b[i])
			srtnum = i + 1

if srtnum > 0:
	print(srtnum)