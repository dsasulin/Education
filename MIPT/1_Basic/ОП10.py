# здесь Вы пишете свой код

class Car():

  owner = ""
  color = ""

  def __init__(self, brend, year):
    self.brend = brend
    self.year = year

  def change_color(self, new_color):
    self.color = new_color

  def change_owner(self, new_owner):
    self.owner = new_owner

  def info(self):
    return (f'Car brand: {self.brend}, Year: {self.year}, Owner: {self.owner}, Color: {self.color}, Class Type: ' + type(self).__name__ )
  
  def delete_all(self):
    self.brend = None
    self.year = None
    self.color = None
    self.owner = None

# Далее следует код проверки, его Вы не меняете
a = Car("BMW", 2020)
a.change_color("red")
a.change_owner("Vovochka")
b = Car("Audi", 1996)
print(b.info())
print(a.info())
a.change_owner("Masha")
a.delete_all()
print(a.info())
print(b.info())

# здесь Вы пишете свой код

class Bike():

  owner = ""
  city = ""
  color = ""
  horsepower = 0

  def __init__(self, year):
    self.year = year

  def change_color(self, new_color):
    self.color = new_color

  def change_owner(self, new_owner):
    self.owner = new_owner

  def info(self):
    return (f'Bike owner: {self.owner}, City: {self.city}, Color: {self.color}, Horsepower: {self.horsepower}, Year: {self.year}, Class Type: ' + type(self).__name__ )
  
  def delete_all(self):
    self.horsepower = None
    self.year = None
    self.color = None
    self.owner = None
    self.city = None

  def init_city(self, city):
    self.city = city



# Далее следует код проверки, его Вы не меняете
b = Bike(2010)
b.change_color("blue")
b.init_city("Moscow")
b.change_owner("Ivan")
b.change_owner("Alex")
b.change_color("red")
print(b.info())
b.delete_all()
print(b.info())


# здесь Вы пишете свой код

array= []

def add_item(self, item):
  self.append(item)

def print_info(self):
  for elem in array:
    if type(elem) == Bike:
      print(f'Bike owner: {elem.owner}, City: {elem.city}, Color: {elem.color}, Horsepower: {elem.horsepower}, Year: {elem.year}, Class Type: ' + type(elem).__name__ )
    else:
      print(f'Car brand: {elem.brend}, Year: {elem.year}, Owner: {elem.owner}, Color: {elem.color}, Class Type: ' + type(elem).__name__ )

def print_info_item(self):
  if type(self) == Bike:
    print(self.city)
  else:
    print(self.brend)

# Далее следует код проверки, его Вы не меняете
bike1 = Bike(2020)
bike1.init_city("Moscow")

bike2 = Bike(2022)
car1 = Car("BMW", 2023)
add_item(array, bike1)
add_item(array, bike1)
add_item(array, car1)
add_item(array, bike2)

print(array)
print_info(array)
print_info_item(bike1) # -- "Moscow"
print_info_item(car1) # -- "BMW"


from pygments.token import Number
# здесь Вы пишете свой код


class Float():

  def __init__(self, top, down):
    self.top = top
    self.down = down

  def numerator(self, number = None):
    if number == None:
      return int(self.top)
    else:
      self.top = number
      if self.down % self.top == 0:
        self.top = self.top/self.top
        self.down = self.down/number


  def denominator(self, number = None):
    if number == None:
      return int(self.down)
    else:
      self.down =number
      if self.down % self.top == 0:
        self.down = self.down/self.top

  def __str__(self):
      return( f'{int(self.top)}/{int(self.down)}')

  def __repr__(self):
      return (f'{int(self.top)},{int(self.down)}')


# Далее следует код проверки, его Вы не меняете
f = Float(1, 4)
print(f.numerator()) # -- 1
print(f.denominator()) # -- 4
f.numerator(2)
print(f.numerator()) # -- 1
print(f.denominator()) # -- 2
f.denominator(14)
f.numerator(2)
print(f.numerator()) # -- 1
print(f.denominator()) # -- 7
lst = [f]
print(*lst)
print(f)
print(str(f))
print(repr(f))

  def __mul__(self, other):
     fm = Float(self.top * other.top, self.down*other.down)
     if fm.down % fm.top == 0:
        number = fm.top
        fm.top = fm.top/number
        fm.down = fm.down/number
     return fm
  
  def __truediv__(self, other):
    fd = Float(self.top * other.down, self.down*other.top)
    if fd.down % fd.top == 0:
      number = fd.top
      fd.top = fd.top/number
      fd.down = fd.down/number
    return fd

  def __imul__(self, other):
    self.top = self.top * other.top
    self.down = self.down * other.down
    if self.down % self.top == 0:
      number = self.top
      self.top = self.top/number
      self.down = self.down/number
    return self

  def __itruediv__(self,other):
    self.top = self.top*other.down
    self.down = self.down*other.top
    if self.down % self.top == 0:
      number = self.top
      self.top = self.top/number
      self.down = self.down/number
    return self

  def reverse(self):
    fr = Float(self.down, self.top)
    return fr

# Checks
fm1 = Float(1,7)
fm2 = Float(1,7)
print(fm1*fm2)
print(fm1/fm2)
fm1*=fm2
print(fm1)
fm1/=fm2
print(fm1)
print(fm1.reverse())

  def __eq__(self, other):
    if self.top == other.top and self.down == other.down:
      return True
    else:
      return False
  
  def __ne__(self, other):
    if self.top != other.top or self.down != other.down:
      return True
    else:
      return False

  def __lt__(self, other):
    if self.top*other.down < other.top*self.down:
      return True
    else:
      return False
  
  def __le__(self, other):
    if self.top*other.down <= other.top*self.down:
      return True
    else:
      return False
  
  def __gt__(self, other):
    if self.top*other.down > other.top*self.down:
      return True
    else:
      return False
  
  def __ge__(self, other):
    if self.top*other.down >= other.top*self.down:
      return True
    else:
      return False

a = Float(1, 4)
b = Float(3, 5)
print(a > b) # -- False
print(a >= b) # -- False
print(a <= b) # -- True
print(a < b) # -- True
print(a != b) # -- True
print(a == b) # -- False

