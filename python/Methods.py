# -*- coding: utf-8 -*-
"""
Created on Fri Feb 19 16:59:24 2021

@author: Akhil Chanda
"""

def factorial(num):
    fact = 1
    for i in range(num,0,-1):
        fact = num * fact
        num  = num - 1
    return fact

num = int(input("enter a number: "))
print("factorial of ",num,"is:",factorial(num))