#!/usr/bin/python3

# override
class Alien:
	def blue(self, num1, num2):
		sum0 = num1 + num2
		print(sum0)
class Alien2(Alien):
	def blue(self, num1, num2):
		sub0 = num1 - num2
		print(sub0)



class Human:
	def tall(self, num1, num2):
		sum0 = num1 + num2
		print(sum0)

	def tall(self, num1, num2, num3):
		sum0sub0 = num1 - num2 + num3
		print("Method overloaded --> "  + str(sum0sub0))




if __name__ == '__main__':


	# ali = Alien()
	# ali2 = Alien2()
	
	# ali.blue(10,10)
	# ali2.blue(10,10)

	earth = Human()
	earth2 = Human()
	
	earth.tall(20, 20, 20)
	earth.tall(20, 20, 20)





	print("\n\nworking")