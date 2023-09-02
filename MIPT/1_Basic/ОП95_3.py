# Ваш класс Вы пишете здесь
class Numbers:
  a =[]

  def add_number(self, n):
    self.a.append(n)

  def print_odd(self):
    b = []
    for elem in self.a:
      if elem%2 == 1:
        b.append(elem)
    print(b)

  def print_even(self):
    c = []
    for elem in self.a:
      if elem%2 == 0:
        c.append(elem)
    print(c)

  def return_all(self):
      return (self.a)


# Ниже следует код проверки, его Вы не меняете
numbers = Numbers()
numbers.add_number(5)
numbers.add_number(14)
numbers.add_number(-100)
numbers.add_number(32)
numbers.add_number(27)

numbers.print_even() # выведется 14, -100, 32
print(numbers.print_even()) # выведется None
numbers.print_odd() # выведется 5, 27
numbers.return_all() # ничего не выведется
print(numbers.return_all()) # выведется [5, 14, -100, 32, 27] или в другом порядке