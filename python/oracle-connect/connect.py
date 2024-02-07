
import cx_Oracle

try:
	con = cx_Oracle.connect('hr/hr@192.168.100.225:1521/xe')
	print(con.version)

	cursor = con.cursor()

	# cursor.execute("create table LMS(book_name varchar2(30), publisher varchar2(30), price number(20))")
	cursor.execute("insert into LMS(book_name, publisher, price) values('Blue Team Field Manual', 'Blue Team Operators.org', 17)")
	print("Table Created! :)")
	con.commit()


except cx_Oracle.DatabaseError as e:
	print("Connection Error")
	print(e)

finally:
	cursor.close()
	con.close()



