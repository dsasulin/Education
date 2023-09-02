def encrypt_caesar(msg, shift):

	a = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']

	def index_search(bukva):
		for j in range (len(a)):
			if bukva == a[j]:
				return j

	b = msg
	c = shift
	output = []
	for i in range (len(b)):
		if b[i] in a:
			cc = index_search(b[i]) + c
			if cc > len(a) or cc < -26:
				cc = cc % len(a) 
			output.append(a[cc])
		else:
			output.append(b[i])
	return "".join(output)

n = input ()
m = int(input())
print(encrypt_caesar(n,m))