# -*- coding: utf-8 -*-
"""
Created on Fri Feb 19 17:14:33 2021

@author: Akhil Chanda
"""

"""print("Single Inheritance")
class FirstName:
    firstName = ""
    def takeName(self,firstName):
        self.firstName=firstName

class LastName(FirstName):
    lastName = ""
    def takeValue(self,lastName):
        self.lastName=lastName
        
name = LastName()
name.takeName("Akhil")
name.takeValue("Chanda")
print(name.firstName,name.lastName)

print("Multilevel Ingeritance")
class Mobile:
    def show(self):
        print("It is Best Mobile")
    
class Redmi():
    def output(self):
        print("It is brand in mobile")
        
class RedmiNote9(Redmi):
    def giveValue(self):
        print("It is a model in Redmi")
        
rn = RedmiNote9()
rn.giveValue()
rn.output()
rn.show()

print("Multiple Ingeritance")
class Mobile:
    def show(self):
        print("It is Best Mobile")
    
class Redmi():
    def output(self):
        print("It is brand in mobile")
        
class RedmiNote9(Redmi,Mobile):
    def giveValue(self):
        print("It is a model in Redmi")
        
rn = RedmiNote9()
rn.giveValue()
rn.output()
rn.show()

print("Hierarchical Inheritance")
class Department:
    def branches(self):
        print("CSE")
        print("ECE")
        print("Mech")
    def first_year(self):
        print("M!")
        print("MM")
        print("C")

class ECE(Department):
    def __init__(self):
        print("\nECE Department Subjects")
    def second_year(self):
        print("EDC")
        print("S&S")
        print("ES")
        
class CSE(Department):
    def __init__(self):
        print("\nCSE Department Subjects")
    def second_year(self):
        print("JAVA")
        print("Python")
        print("Data Structure")
        
dept = Department()
dept.branches()

ece = ECE()
ece.first_year()
ece.second_year()

cse = CSE()
cse.first_year()
cse.second_year()"""








