#Name: Jason Ludu
#Date: 3/26/25
#Description: This program creates a class that creates objects that are named as flowers to define if the named flowers are blooming or growing. 

class Flower:
    def __init__(self, name):
        self.name = name
#This code defines the class name "Flower".

    def grow(self):
        print("The " +self.name + " is growing.")

    def bloom(self):
        print("The " + self.name + " is blooming.")
        
       #These piece of code define the actions of what the flower can do, such as "grow" or "bloom". These are called.

def main():
    flower1 = Flower("Rose")
    flower1.grow()
    flower1.bloom()
    #This piece of code uses the class name "Flower" and gives an object to it called "Rose". The actions of the rose are to grow and bloom. 
    flower2 = Flower("Daisy")
    flower2.grow()
    flower2.bloom()
    # #This piece of code uses the class name "Flower" and gives an object to it called "Daisy". The actions of the rose are to grow and bloom.
    flower3 = Flower("Cornflower")
    flower3.grow()
    flower3.bloom()
    # #This piece of code uses the class name "Flower" and gives an object to it called "Cornflower". The actions of the rose are to grow and bloom.

if __name__ == "__main__":
  main()
  # These lines check to make sure the program is being run. The "main" function is to execute the "main" code logic seen earlier.