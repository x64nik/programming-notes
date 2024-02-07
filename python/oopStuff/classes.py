#!/usr/bin/python3
		


class Processor:
	def __init__(self, comp, gen, speed, price):
		self.comp = comp
		self.gen = gen
		self.speed = speed
		self.price = price


class Memory:
	def __init__(self, comp, size, speed, price):
		self.comp = comp
		self.size = size
		self.speed = speed
		self.price = price


class Storage:
	def __init__(self, comp, size, speed, price):
		self.comp = comp
		self.size = size
		self.speed = speed
		self.price = price

class Machine():
	def __init__(self, cpu, mem, ssd):
		self.processor = cpu
		self.memory = mem
		self.storage = ssd

	def __str__(self):
		# self.num = m_num
		
		cpu = str(self.processor.comp) + str(self.processor.gen) + str(self.processor.speed) + str(self.processor.price)   
		ram = str(self.memory.comp) + str(self.memory.size) + str(self.memory.speed) + str(self.memory.price)   
		ssd = str(self.storage.comp) + str(self.storage.size) + str(self.storage.speed) + str(self.storage.price)

		return "\n\n-------------------- MACHINE CONFIGS --------------------\n" + cpu + " \n" + ram + " \n" + ssd 


if __name__ == '__main__':
	
	cpu = Processor("Intel ", "I7 ", 3.5, 18000)
	mem = Memory("Corsair ", 32, "3200Mhz ", 23000)
	ssd = Storage("Samsung ", 1000, "6Gb/s ", 5000)

	cpu2 = Processor("Ryzen", "Thread Reaper ", 8.00, 120000)
	mem2 = Memory("XPG ", 128, "6000Mhz ", 80000)
	ssd2 = Storage("Segate ", 5000, "12Gb/s ", 45000)

	m1 = Machine(cpu, mem, ssd)
	m2 = Machine(cpu2, mem2, ssd2)
	
	print(m1.processor.comp)
	print(m2)

	print("\n")
	# print(cpu.comp)
	# print(cpu.gen)





	print("\n\nworkig")



