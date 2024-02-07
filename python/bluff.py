#!/usr/bin/python3

# call parent stuff in the child constructor and so on  

class GrandParent:
		
	int0 = 200
	str0 = "Grandpa here"

	def MethodGrand(self):
		return "Grandpa: Instance method"

	@classmethod
	def grand_classmethod(cls):
		return "Grandpa: Class method"

	@staticmethod
	def staticmethod():
		return "Grandpa: static method"

	def __init__(self, var1, var2):
		self.var1 = var1
		self.var2 = var2


class Parent(GrandParent):
	int1 = 200
	str1 = "papa here"

	def MethodParent(self):
		return "papa: Instance method"
		print("papa: Instance method")

	@classmethod
	def parent_classmethod(cls):
		return "papa: Class method"

	@staticmethod
	def parent_staticmethod():
		return "papa: static method"
		print("papa: static method")

	def __init__(self, var1, var2):
		super().__init__(var1, var2)
		self.var1 = var1
		self.var2 = var2


class Child(Parent):
	int2 = 200
	str2 = "Child here"



	def MethodChild(self):
		print("kid: Instance method")

	@classmethod
	def child_classmethod(cls):
		print("kid: Class method")

	@staticmethod
	def child_staticmethod():
		print("kid: static metho")

	def __init__(self, var1, var2):
		super().__init__(var1, var2)
		Parent.parent_staticmethod()
		Parent.parent_classmethod(cls)
		self.var1 = var1
		self.var2 = var2

if __name__ == '__main__':


	kid = Child(10, 20)
	# print(kid.staticmethod())
	print("\n\nworking")