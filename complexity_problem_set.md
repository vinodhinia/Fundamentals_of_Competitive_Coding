# 10 - Complexity Problem Set

## 1. Order of Magnitude

*Reduce the following into it's Big-O order of magnitude.*

1. 5 + N         - O(N)
2. N + N^2       - O(N^2)
3. 15N + 13N     - O(N)
4. 10000         - O(1)
5. log(N) + 1    - log(N)
6. log(N) * 3 + 14N + 3  -O(N)
7. Nlog(N) + 3N^2     -O(N^2)
8. N^3 + log(N^4)     -O(N^3)
9. N! + 180000N^2     O(N!)
10. 300N^5 + 15002^N + 3N  -O(N^5)

---

Problems 2-5 are meant to mimic common methods native to some languages, write an algorithm solution and determine the time and space complexity of the solution.  Do not use the built-in native methods that solve problem for you i.e., do not use indexOf to solve Index Of.


## 2. Index Of  

*Given an array of integers and a target value, return the index of the first element that matches the target value. If there are no
matches, return -1.*

**Parameters**  
Input: arr {Array of Integers}
Input: target {Integer}
Output: {Integer}

**Examples**  
`[1, 2, 3, 4, 5, 6], 5 --> 4`  
`[9, 83, 74], 8 --> -1`  
`[6, 4, 7, 9, 7, 8, 2, 4, 3], 7 --> 2`  

**Complexity Analysis**  
*Determine the time and space complexity of the algorithm.*

Time: O(N) If the array is sorted then the complexity is log(N)     
Space: O(1)

## 3. Evens

*Given an array of integers, return an array of only the even values.*

**Parameters**  
Input: arr {Array of Integers}  
Output: {Array of Integers}

**Examples**  
`[1, 2, 3, 4, 5, 6] --> [2, 4, 6]`  
`[9, 83, 74] --> [74]`  
`[6, 4, 7, 9, 7, 8, 2, 4, 3] --> [6, 4, 8, 2, 4]`  

**Complexity Analysis**  
*Determine the time and space complexity of the algorithm.*

Time: O(N)   
Space: O(N)

## 4. Split

*Given a string of characters, return an array with each character separated into its own separate item.*

**Parameters**  
Input: str {String}  
Output: {Array of Characters}

**Examples**  
`'hello' --> ['h', 'e', 'l', 'l', 'o']`  
`'foo' --> ['f', 'o'. 'o']`   

**Complexity Analysis**  
*Determine the time and space complexity of the algorithm.*

Time: O(N)   
Space: O(N)

## 5. Sum

*Given an array of integers, return the sum of all the integers.*

**Parameters**  
Input: arr {Array of Integers}  
Output: {Integer}

**Examples**  
`[1, 2, 3, 4, 5] --> 15`  
`[0, 1, -1] --> 0`  
`[] --> 0`   

**Complexity Analysis**  
*Determine the time and space complexity of the algorithm.*

Time: O(N)   
Space: O(1)

---

Problems 6-9 determine the time and space complexity of the following problems. The code is shown in a language agnostic format.


## 6. Merge Arrays

```
function merge(left,right)
   result = array of length(left) + length(right) elements
   while length(left) > 0 and length(right) > 0
       if first(left) ≤ first(right)
           append first(left) to result
           left = rest(left)
       else
           append first(right) to result
           right = rest(right)
   if length(left) > 0
       append rest(left) to result
   if length(right) > 0
       append rest(right) to result
   return result
```

**Complexity Analysis**  
*Determine the time and space complexity of the algorithm.*

Assume that the length of the array left is N, and the length the array right is M.

Time: O(N+M)   
Space: O(N+M)

## 7. Count Sort

```
function countingSort(array, min, max)
    count = array of (max - min + 1) elements
    initialize count with 0
    for each number in array
        count[number - min] = count[number - min] + 1
    z = 0
    for i from min to max
        while count[i - min] > 0
            array[z] = i
            z = z + 1
            count[i - min] = count[i - min] - 1
    return array
```

**Complexity Analysis**  
*Determine the time and space complexity of the algorithm.*

Assume that the length of the array is N, and the value of max - min is K.

Time: O(N)   
Space: O(N)

## 8. Binary Search [Extra Credit]

```
function binarySearch(array, value)
    low = 0
    high = length(array) - 1
    while low ≤ high
        mid = (low + high) / 2
        if array[mid] > value
            high = mid - 1
        else if array[mid] < value
            low = mid + 1
        else
            return mid
    return -1
```

**Complexity Analysis**  
*Determine the time and space complexity of the algorithm.*

Assume that the length of the array is N.

Time: log(N)   
Space: O(1)


## 9. Factorial [Extra Credit]

Assume that n is a positive integer.

```
function factorial(n)
    if n == 1
        return 1
    return n * factorial( n - 1 )
```
**Complexity Analysis**  
*Determine the time and space complexity of the algorithm.*

Time: O(N)  
Space: O(N)
