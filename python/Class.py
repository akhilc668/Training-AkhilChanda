# -*- coding: utf-8 -*-
"""
Created on Fri Feb 19 17:07:09 2021

@author: Akhil Chanda
"""

class A:
    def __init__(self,name,age):
        self.name=name
        self.age=age
    
    def display(self):
        print(self.name," ",self.age)
   
obj = A("Akhil",18)
obj.display()

        
class B(A):
    def __init__(self):
        super().__init__("Akhila",21)
        print("in class B")
    def display(self):
        super().display()
B = B()
B.display() 