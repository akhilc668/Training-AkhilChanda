# -*- coding: utf-8 -*-
"""
Created on Sun Feb 21 10:15:13 2021

@author: Akhil Chanda
"""

def nothing():
    print("in demo")
    
class A:
    def __init__(self,name,age):
        print("in demo in class A")
        self.name=name
        self.age=age
        
    def display(self):
        print(self.name," ",self.age)