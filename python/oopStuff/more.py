#!/usr/bin/python3

class Parent():
	int1 = 200
	str1 = "papa here"

	def MethodParent(self):
		return "papa: Instance method"

	@classmethod
	def parent_classmethod(cls):
		return "papa: Class method"
		print("x1")

	@staticmethod
	def parent_staticmethod():
		return "papa: static metho"
		print("papa: static metho")


	def __init__(self, var1, var2):
		self.var1 = var1
		self.var2 = var2


# class Child(Parent):
# 	def __init__(self):
# 		# self.obj1 = parent_classmethod()
# 		super.__init__(1,2)


obj1 = Parent(1,2)
print(obj1.parent_staticmethod())