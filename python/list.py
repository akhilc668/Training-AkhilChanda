# -*- coding: utf-8 -*-
"""
Created on Wed Feb  6 13:42:35 2019

@author: akhil nikhil
"""

list=['abcd',786,2.2,'akkhil',710]
tinylist=[123,'prasad']
print("complete list is:",list)
print("first element:",list[0])
print("elements starting from 2to3:",list[1:3])
print("elements starting from 3:",list[2:])
print("printing list 2 times",list*2)
print("concatenated list",list+tinylist)
"""
we can concatenate the list only not strings
print("add one word to list",list+'venkimama')
"""
print(list[2],":is the third value")
list[2]=5.2225
print(list[2],":value after modification")
print(list)
del list[4]
print(list)
