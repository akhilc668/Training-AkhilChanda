# -*- coding: utf-8 -*-
"""
Created on Fri Feb 19 20:56:30 2021

@author: Akhil Chanda
"""

f = open("math.py", "r")

f1= open("demo.txt","w")
f1.write("End of the file")


f1 = open("demo.txt","r")
print("checking the file which we create and worte")
print(f1.read())
print("\nFile reading from math.py")
print(f.read())