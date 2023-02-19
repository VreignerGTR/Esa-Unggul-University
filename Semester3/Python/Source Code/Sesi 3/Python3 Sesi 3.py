print ("Nama : Bryan Johnson")
print ("NIM : 20210801200")
print ("Teknik Informatika")
print ("Mata Kuliah : Bahasa Pemograman")

nama_mhs = str(input("Masukan Nama Anda = "))
nim_mhs = str(input("Masukan NIM Anda = "))

print("")
print("")
tampilInfoMhs = "Detail dari Informasi Anda..\n\nNama Anda Adalah : "+nama_mhs+"\nNim Anda Adalah"+nim_mhs
print(tampilInfoMhs)
print("Nama Anda adalah {} dengan nim {}".format("nama_mhs, nim_mhs"))

3.  #Bryan Johnson
#20210801200
#Teknik Informatika

from ast import Return


print("\nMenentukan pilihan dengan memasukkan nomor")
print(50*"=")
print("""
1. Penjumlahan
2. Pengurangan
3. Perkalian
4. Pembagian
""")


pil = int(input("Pilih nomor ke?> "))
if pil == 1:
    # Penjumlahan
    a = int(input('Bilangan Pertama> '))
    b = int(input("Bilangan Kedua> "))
    c = a + b
    print("Hasil penjumlahan bilangan pertama & kedua:> ", c)
elif pil == 2:
    # Pengurangan
    a = int(input('Bilangan Pertama> '))
    b = int(input("Bilangan Kedua> "))
    c = a - b
    print("Hasil pengurangan bilangan pertama & kedua:> ", c)
elif pil == 3:
    # Perkalian
    a = int(input('Bilangan Pertama> '))
    b = int(input("Bilangan Kedua> "))
    c = a * b
    print("Hasil perkalian bilangan pertama & kedua:> ", c)
elif pil == 4:
    # Pembagian
    a = int(input('Bilangan Pertama> '))
    b = int(input("Bilangan Kedua> "))
    c = a / b
    print("Hasil pembagian bilangan pertama & kedua:> ", c)
elif pil == 5:
    print("gapaham dan ga ngerti, \nperbaiki ulang gih!")

4. #Bryan Johnson
#20210801200
#Teknik Informatika 
# matriks berukuran 2 x 2
matriksA = [ [1, 3], 
             [5, 7]] 

print(matriksA)
print(type(matriksA))
print(matriksA[0][0])
print(matriksA[1][1])