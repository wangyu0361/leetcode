from functools import wraps
import time
import numpy as np

arr = [1,2,4,1,7,8,3]

def timer(func):
    def wrapper(*args):
        t1 = time.time()
        returnme =a func(*args)
        t2 = time.time()
        print("Total run time is: {:.4} s".format(t2 - t1))
        return returnme
    return wrapper



def opt(arr,i):
    if i ==0:
        return arr[0]
    elif i==1:
        return max(arr[0],arr[1])
    else:
        returnme=max(opt(arr,i-2)+arr[i],opt(arr,i-1))
    return returnme


a = opt(arr, len(arr)-1)
print(a)

@timer
def dp_opt(arr):
    optt = np.zeros(len(arr))
    optt[0] = arr[0]
    optt[1] = max(arr[0],arr[1])
    for ii in range(2, len(arr)):
        print(ii)
        optt[ii]=max(optt[ii-2]+arr[ii],optt[ii-1])
    print(optt)
    return optt[len(arr)-1]

a = dp_opt(arr)
print(a)
