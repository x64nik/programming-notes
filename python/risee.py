#!/usr/bin/python3


class CustomError(BaseException):
	def __init__(self, error):
		self.error = error
		super().__init__(self, error)



# class Math0(CustomError):
# 	def

num1 = 0

if num1 == 0:
	raise CustomError("ZERO IS NOT ALLOWD")
else:
	print(num1)