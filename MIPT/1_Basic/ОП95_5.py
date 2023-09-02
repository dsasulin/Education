# Ваш класс Вы пишете здесь

class Scales():
  l = 0
  r = 0

  def put_right(self,n):
    self.r = self.r+n

  def put_left(self, m):
    self.l = self.l+m

  def result(self):
    if self.l > self.r:
      print("L")
    elif self.r > self.l:
      print("R")
    else:
      print("=")

# Ниже следует код проверки, его Вы не меняете
scales = Scales()
scales.put_right(10)
print(scales.result()) # выведется R
scales.put_right(7)
print(scales.result()) # выведется R
scales.put_left(15)
print(scales.result()) # выведется R
scales.put_left(4)
print(scales.result()) # выведется L
scales.put_left(1)
print(scales.result()) # выведется L
scales.put_right(3)
print(scales.result()) # выведется =
scales.result() # ничего не произойдет