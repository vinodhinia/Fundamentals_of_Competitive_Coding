# 30 - Decrease and Conquer Problem Set
Utilize the decrease and conquer pattern to solve these problems.

## 1. Number of Ones

*Given a sorted bit array (values of either 0 or 1), determine the number of 1's in the array.*

**Parameters**  
Input: arr {Array of Integers}    
Output: {Integer}

**Constraints**  
Time: O(logN)  
Space: O(1)

**Examples**  
`[0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1] --> 8`  
`[0, 0, 0] --> 0`  
`[0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1] --> 7`

## 2. Closest Value

*Given a sorted bit array of integers, and a target value, find the number in the array that is closest to the target.*

**Parameters**  
Input: arr {Array of Integers}  
Input: target {Integer}  
Output: {Integer}

**Constraints**
If there are two numbers tied for the closest value, return the lowest value.

Time: O(logN)  
Space: O(1)

**Examples**  
`[1, 2, 3, 5, 5, 7, 9, 10, 11], 6 --> 5`  
`[1, 2, 3], 8 --> 3`  
`[1, 10, 22, 59, 67, 72, 100], 70 --> 72`  

## 3. Square Root

*Given an positive integer, find the square root.*

**Parameters**  
Input: value {Integer}    
Output: {Float}

**Constraints**  
Do not use a native built in method.  
Ensure the result is accurate to 6 decimal places (0.000001)

Time: O(logN)  
Space: O(1)

**Examples**  
`4 --> 2.0`  
`98 --> 9.899495`  
`14856 --> 121.885192`

## 4. Greater Values

*Given an sorted array of integers, and a target value return the number of values greater the target.*

**Parameters**  
Input: arr {Array of Integers}  
Input: target {Integer}
Output: {Integer}

**Constraints**

Time: O(logN)  
Space: O(1)

**Examples**  
`[1, 2, 3, 5, 5, 7, 9, 10, 11], 5 --> 4`  
`[1, 2, 3], 4 --> 0`  
`[1, 10, 22, 59, 67, 72, 100], 13 --> 5`

## 5. Sorted and Rotated Array [Extra Credit]

*Given a array that is sorted an rotated, find out if a target value exists in the array.*

An sorted array is rotated by taking an unknown amount of values from the beginning and placing it at the end.

`[3, 4, 5, 1, 2]` is rotated left by 2.  
`[99, 14, 25, 78, 93]` is rotated to the right by 1.

**Parameters**  
Input: arr {Array}    
Output: {Boolean}

**Constraints**  
Time: O(logN)  
Space: O(N)

**Examples**  
`[35, 46, 79, 102, 1, 14, 29, 31], 46 --> true`
`[35, 46, 79, 102, 1, 14, 29, 31], 47 --> false`
`[7, 8, 9, 10, 1, 2, 3, 4, 5, 6], 9 --> true`

## 6. Kth Largest [Extra Credit]

*Given a unsorted array and an integer k, find the kth largest element in the array*

Read up on quickselect [here](https://en.wikipedia.org/wiki/Quickselect).

**Parameters**  
Input: arr {Array of Integers}
Input: k {Integer}    
Output: {Integer}

**Constraints**
k < length of arr

Time: O(N)  
Space: O(N)

**Examples**  
`[1, 4, 2, 5, 12, 9], 3 --> 5`  
`[4, 7, 1, 6], 1 --> 7`  
`[6, 44, 2, 1, 9, 10, -1, 78, 90], 3 --> 44`

## 7. Multiplication Using Russian Peasant [Extra Credit]

*Given two positive integers, return its product using Russian Peasant method of multiplication*

Read up on how to apply the Russian Peasant method [here](https://en.wikipedia.org/wiki/Ancient_Egyptian_multiplication). It is also referred to as the Egyptian multiplication.

**Parameters**  
Input: a {Integer}  
Input: b {Integer}  
Output: {Integer}

**Constraints**  
Assume a <= b, and the value of a is N.

Time: O(logN)  
Space: O(1)

**Examples**  
`734, 487 --> 357458`  
`846, 908--> 768168`  
