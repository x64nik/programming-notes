#!/usr/bin/python3



class Human:
	def overthink(self):
		print("Human here")

class Alien:
	def fly(self):
		print("Alein here")

class CilivsationError(BaseException):
	def __init__(self):
		super().__init__(self)
		print(str(self))



def check(self):
	try:
		self.fly()

		try:
			self.overthink()
		except CilivsationError:
			print("Alien cannot overthink, but they overthink x 2500")


	except AttributeError:
		print("Humans cannot fly")

	finally:
		print("always here")

class ok(CilivsationError):
	def check2(self):
		if self.fly():
			raise CilivsationError("ok worked")
		else:
			print("worked")

if __name__ == '__main__':

	print(__name__)

	jadoo = Alien()
	man = Human()

	check(jadoo)



