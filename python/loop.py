# -*- coding: utf-8 -*-
"""
Created on Wed Feb  6 14:10:50 2019

@author: akhil nikhil
"""

for i in range(0,10,2):
    print("forward",i)
    
for i in range(10,0,-2):
    print("reverse",i)
    
i=0

while i < 10:
    print("while",i)
    i=i+1
else:
    print("in else block",i)