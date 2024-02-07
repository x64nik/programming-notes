#!/usr/bin/python3

from threading import *
import time



class Device:
	def __init__(self):
		self.lock = Lock()

	def Mobile(self):
		# self.lock.acquire()
		for count in range(46):
			time.sleep(0.2)
			print(count, end=" ")
		# self.lock.release()


if __name__ == '__main__':

	obj = Device()
	t1 = Thread(target=obj.Mobile())
	t2 = Thread(target=obj.Mobile())

	t1.start()
	# t2.start()

	# t2.join()
	# t1.join()