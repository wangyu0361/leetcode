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

from functools import wraps
import time
import numpy as np

arr = [1,35,7,6,3,5,6,7]

def sol(i,s):
    result = np.zeros((len(arr),s+1),dtype=bool)

    result[0,:] = False
    result[0,0] = True
    result[0,arr[0]]=True
    for i in range(1,len(arr)):
        for ii in range(0,s+1):
            if ii==0:
                result[i,ii]=True
            elif ii-arr[i] < 0:
                result[i,ii] = result[i-1,ii]
            else:
                result[i,ii]= result[i-1,ii] or result[i-1,ii-arr[i]]
    print(result)
    return result

s=54
a =sol(arr,s)
print(a[len(arr)-1,s])
