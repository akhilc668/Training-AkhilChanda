# -*- coding: utf-8 -*-
"""
Created on Sat Feb 20 12:13:02 2021

@author: Akhil Chanda
"""

try:
    x=10/0
    print(x)
except NameError:
    print("Variable x is not defined")
except ValueError:
    print("value error")
except ZeroDivisionError:
    print("ZeroDivisionError")
except:
    print("Something else went wrong")