# -*- coding: utf-8 -*-
"""
Created on Fri Feb 19 21:19:27 2021

@author: Akhil Chanda
"""
import mysql.connector

mydb = mysql.connector.connect(
  host="127.0.0.1",
  port="3306",
  user="root",
  password="root",
  database="motivity"
)

mycursor = mydb.cursor()

sql = "delete from student1 where sid=%s"
val = (106,)

mycursor.execute(sql, val)

mydb.commit()

print(mycursor.rowcount, "record deleted.")


"""sql = "update student1 set sname=%s where sid=%s"
val = ("Banu",105)

mycursor.execute(sql, val)

mydb.commit()

print(mycursor.rowcount, "record updated.")
  
mycursor.execute("SELECT * FROM student1 order by marks")

print("ascending order")
myresult = mycursor.fetchall()

for x in myresult:
  print(x)
  
print("\ndescending")

mycursor.execute("SELECT * FROM student1 order by marks desc")

print("ascending order")
myresult = mycursor.fetchall()

for x in myresult:
  print(x)
  

sql = "insert into student1 (sid,sname,marks,section) values (%s,%s,%s,%s)"
val = (106,"Rahul",580,"B")
mycursor.execute(sql, val)

mydb.commit()

print(mycursor.rowcount, "record inserted.")

mycursor.execute("SELECT * FROM student1")

myresult = mycursor.fetchall()

for x in myresult:
  print(x)
  
mycursor.execute("SELECT * FROM student1 where sid='101'")

myresult = mycursor.fetchall()

for x in myresult:
  print(x)"""