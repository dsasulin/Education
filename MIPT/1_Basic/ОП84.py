def sum(lst):
	lstsum = 0
	for i in range (len(lst)):
		lstsum = lstsum + lst[i]
	return lstsum


print(sum([int(i) for i in input().split()]))