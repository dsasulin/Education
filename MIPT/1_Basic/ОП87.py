def rec_linear_sum(lst):
		sum = 0 
		for elem in lst:
			sum = sum + int(elem)
		return sum

b = input()
c = b[1:-1]
d = c.split(",")
print(rec_linear_sum(d))
