# Ваш код Вы пишете здесь

class Person:
  def __init__(self, name, sname, dob, gender, place):
    self.name = name
    self.sname = sname
    self.dob = dob
    self.gender = gender
    self.place = place
  
  def info(self):
    print (f'Name : {self.name}, Family name : {self.sname}, Birthdate : {self.dob}, Gender : {self.gender}, Place of birth {self.place}')
  
  def age(self, year):
    return year - self.dob
  
  def changeSname(self, newsname):
    self.sname = newsname

# Проверки

n = Person("Nik", "Ivanov", 1980, "Male", "Moscow")
n.info()
print(n.age(2023))
n.changeSname("Petrov")
n.info()


class Animal:
  def __init__(self, name, dob, gender):
    self.name = name
    self.dob = dob
    self.gender = gender
  
  def info(self):
    print (f'Name : {self.name}, Birthdate : {self.dob}, Gender : {self.gender}')
  
  def age(self, year):
    return year - self.dob

# Проверки

dog = Animal("Mira",  2009, "Female")
dog.info()
print(dog.age(2023))
dog.info()