def wait_please():
	name = input()
	print(name +", Вам скоро ответят!")


n = int(input())

for i in range(n):
	wait_please()
