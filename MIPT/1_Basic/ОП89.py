def decrypt_caesar(msg, shift):

	a = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']

	def index_search(bukva):
		for i in range (len(a)):
			if bukva == a[i]:
				return i

	b = msg
	c = shift
	output = []
	for i in range (len(b)):
		if b[i] in a:
			cc = index_search(b[i]) - c
			if cc > len(a):
				cc = cc % 26 
			output.append(a[cc])
		else:
			output.append(b[i])
	return "".join(output)

n = input ()
m = int(input())
print(decrypt_caesar(n,m))	