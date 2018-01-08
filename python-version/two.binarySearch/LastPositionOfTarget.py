# @param {int[]} A an integer array sorted in ascending order
# @param {int} target an integer
# @return {int} an integer

def lastPosition(A, target):
        if not A or target is None:
            return -1

        start = 0
        end = len(A) - 1

        while start + 1 < end:
            mid = start + (end - start) // 2

            if A[mid] < target:
                start = mid
            elif A[mid] > target:
                end = mid
            else:
                start = mid

        if A[end] == target:
            return end
        elif A[start] == target:
            return start
        else:
            return -1

A = [1, 2, 2, 4, 5, 5]

target = 5

print(lastPosition(A, target))

