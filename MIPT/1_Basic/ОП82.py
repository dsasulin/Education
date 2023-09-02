def is_triangle(a,b,c):
	if (a>0 and b>0 and c>0) and (a + b + c == 180):
		print ("TRUE")
	else:
		print("FALSE")

is_triangle(int(input()), int(input()),int(input()))

