# -*- coding: utf-8 -*-
"""
Created on Wed Feb  6 14:26:26 2019

@author: akhil nikhil
"""

from datetime import datetime
da=datetime.date(datetime.now())
print(da)
ti=datetime.time(datetime.now())
print(ti)
print(datetime.now())
#all seprate value
n=datetime.now()
print(n.strftime("%d"),":only day")
print(n.strftime("%m"),":month")
print(n.strftime("%Y"),":year")
print(n.strftime("%D"),":Date in different format")
print(n.strftime("%H"),":hours")
print(n.strftime("%M"),":minutes")
print(n.strftime("%S"),":seconds")