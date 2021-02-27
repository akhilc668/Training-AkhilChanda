# -*- coding: utf-8 -*-
"""
Created on Fri Feb 19 20:21:48 2021

@author: Akhil Chanda
"""

print("Iterator with for loop")
List = [1,2,3.0,5.0,"Akhil","Bunny"] 
i=iter(List)

for x in range(len(List)):
    print(next(i))

    
print("\nIterator without for loop")
i=iter(List)
print(next(i))
print(next(i))
print(next(i))
print(next(i))
print(next(i))
print(next(i))


