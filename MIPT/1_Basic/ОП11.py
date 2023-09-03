from os import dup2
# Геометрическая фигура - все фигуры
#   Точка - задается парой координат - done
#     Окружность - задается точкой как центр окружности и радиусом
#     Эллипс - здается точкой как центр и двумя радиусами
#   Отрезок - задается двумя парами координат - done
#   Многоугольник - 
#     Черырехугольник
#       Квадрат
#       Прямоугольник
#       Паралелограмм
#     Треугольник
#       Правильный треугольник
import math
class Figure():
  
  def info(self):
    return f'Figure class is: {type(self).__name__}'

class Dot(Figure):

  def __init__(self, x, y):
      self.x = x
      self.y = y

  def info(self):
    return f'Figure class is: {type(self).__name__}, coordinates x = {self.x},  y =  {self.y}'      

d = Dot(0,0)
print(d)
print(d.info())

class Line(Figure):
    x1 = 0
    y1 = 0
    x2 = 0
    y2 = 0

    def __init__(self, a, b):
      self.x1 = a.x
      self.y1 = a.y
      self.x2 = b.x
      self.y2 = b.y
    
    def length(self):
        ans = math.sqrt(self.x2 - self.x1**2 + (self.y2 - self.y1)**2)
        return f'Line lenght is: {ans}'

    def info(self):
      return f'Figure class is: {type(self).__name__}, dots: A=[{self.x1}, {self.y1}], B=[{self.x2}, {self.y2}]'    

d2 = Dot(1,1)
l = Line(d,d2)
print(l.length())
print(l.info())