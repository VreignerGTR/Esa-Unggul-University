import mysql.connector

mydb = mysql.connector.connect(
  host="localhost",
  user="root",
  password="",
  database="dbpython"
)

#data awal
mycursor = mydb.cursor()

sql = "INSERT INTO siswa (id,nisn, nama, kelas) VALUES (%s,%s, %s, %s)"
val = ("1","21001", "Adi", "RPL1")
mycursor.execute(sql, val)

val = ("2","21002", "Budi", "RPL1")
mycursor.execute(sql, val)


#read awal
mycursor = mydb.cursor()
mycursor.execute("SELECT * FROM siswa")
myresult = mycursor.fetchall()

print("data awal pada database dbpython tabel siswa")
for x in myresult:
  print(x)

mycursor = mydb.cursor()

sql = "INSERT INTO siswa (id,nisn, nama, kelas) VALUES (%s,%s, %s, %s)"
val = ("3","21003", "Databaru", "RPL1")
mycursor.execute(sql, val)

mycursor = mydb.cursor()
mycursor.execute("SELECT * FROM siswa")
myresult = mycursor.fetchall()

print("data setelah insert 1 data database dbpython tabel siswa")
for x in myresult:
  print(x)


#update
mycursor = mydb.cursor()

sql = "UPDATE siswa SET nama = 'merubah adi' WHERE id = '1'"

mycursor.execute(sql)

mycursor = mydb.cursor()
mycursor.execute("SELECT * FROM siswa")
myresult = mycursor.fetchall()

print("data setelah di update pada database dbpython tabel siswa")
for x in myresult:
  print(x)


#delete
mycursor = mydb.cursor()

sql = "DELETE from siswa WHERE id = '1'"

mycursor.execute(sql)

mycursor = mydb.cursor()
mycursor.execute("SELECT * FROM siswa")
myresult = mycursor.fetchall()

print("data setelah di delete pada database dbpython tabel siswa")
for x in myresult:
  print(x)


mydb.commit()

i =  int(input("terima kasih"))