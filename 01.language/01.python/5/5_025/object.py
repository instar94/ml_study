class Car01:
    def drive(self):
        print("drive() method called")

class Car02:
    def turbo(self):
        print("turbo() method called")

class Car03:
    def fly(self):
        print("fly() method called")

class Car(Car01,Car02,Car03):
    def __init__(self):
        pass


mycar = Car()
mycar.drive()
mycar.turbo()
mycar.fly()