# -*- coding: utf-8 -*-
"""
Created on Tue Feb 12 13:28:16 2019

@author: akhil nikhil
"""
print("deleting dictionary")
dict={'Name':'akhil','Age':18,'class':'btech'}
print(dict)
del dict['Age']#deletes only selected attribute
print(dict)
dict.clear()#clears entire dict
print(dict)
del dict#deletes entire dict
