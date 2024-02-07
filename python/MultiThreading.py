#!/usr/bin/python3

from threading import *

class Myclass:

	def __init__(self):
		self.lock = Lock()


	def job1(self):
		# self.lock.acquire()
		# print("thread1 locked!")
		for num in range(5):
			print( "Thread1 --> " + str(num + 1))
		# self.lock.release()
		# print("thread1 unlocked!")

	def job2(self):
		# self.lock.acquire()
		# print("\nthread2 locked!")
		for num in range(10):
			print( "Thread2 --> " + str(num + 1))
		# self.lock.release()
		# print("thread2 unlocked!")



if __name__ == '__main__':

	obj1 = Myclass()

	t1 = Thread(target=obj1.job1)
	t2 = Thread(target=obj1.job2)
	
	t1.start()
	t2.start()