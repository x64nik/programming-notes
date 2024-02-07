#!/usr/bin/python3


# def test():
# 	print("testing stuff...")


# if __name__ == '__main__':
# 	print("main here\n")
# 	test()



active = True
num1 = 0
while active:
    if num1 == 10:
        active = False
    else:
        num1 += 1
        print("num{0}".format(str(num1	)))

print("ok")

k = 1
dict1 = {k:{'1':{1:'haha'}},'2':{'2':'two'},3:{'3':'three'}}

print(dict1[k]['1'][1])


dict2 = {1:{"elliot":"kdmqidsk"}, 2:{"cisco":"cyyvxu24qk"}, 3:{"tyrell":"qjb2q01"}}

for key in range(1, len(dict2)+1):
	print(dict2[key])

