#!/bin/python
def insertionSort(ar):    
    length = len(ar)

    to_insert = ar[-1]
    count = 0
    for i in range(length-2, -1, -1):
        if (ar[i] > to_insert):
            ar[i+1] = ar[i]
            print " ".join([str(x) for x in ar])
            count += 1
        else:
            ar[i+1] = to_insert
            print " ".join([str(x) for x in ar])
            print count
            return

    ar[0] = to_insert
    print count
    print " ".join([str(x) for x in ar])

m = input()
ar = [int(i) for i in raw_input().strip().split()]
insertionSort(ar)

