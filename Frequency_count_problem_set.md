# 20 - Frequency Count Problem Set
Utilize the frequency count pattern to solve these problems.  Use a Hash Set or an Array instead of a Hash Table where applicable.

## 1. Unique

*Given an array of integers, return an array with all duplicates removed.*

**Parameters**  
Input: arr {Array of Integers}  
Output: {Array of Integers}

**Constraints**

Time: O(N)  
Space: O(N)

**Examples**  
`[1, 2, 3, 4, 5, 6] --> [1, 2, 3, 4, 5, 6]`  
`[1, 1, 2, 2, 3, 3]' --> []`  
`[1, 2, 3, 1, 2] --> [3]`  


## 2. Word Count

*Given an body of text, return a hash table of the frequency of each word.*

**Parameters**
Input: text {String}    
Output: {Hash Table}

**Constraints**
If N is the number of characters in the string.

Capital and lower case versions of the same word should be counted is the same word.

Remove punctuations from all words.

Time: O(N)
Space: O(N)

**Examples**  
`'The cat and the hat.' --> '{ the: 2, cat: 1, and: 1, hat: 1 }'`  
`'As soon as possible.' --> '{ as: 2, soon: 1, possible: 1 }'`  
`'It's a man, it's a plane, it's superman!' --> '{ its: 3, a: 2, man: 1, plane: 1, superman: 1 }'`


## 3. RGB Set

*Given a string of characters where each character is either
'r', 'g', or 'b', determine the number of complete sets of 'rgb' that can be made with the characters.*

**Parameters**  
Input: str {String}    
Output: {Integer}

**Constraints**  
Time: O(N)  
Space: O(1)

**Examples**  
`'rgbrgb' --> 2`  
`'rbgrbrgrgbgrrggbbbbrgrgrgrg' --> 7`  
`'bbrr' --> 0`


## 4. Missing Number

*Given range of 1 to N and an array of unique integers that are within that range, return the missing integers not found in the array*

**Parameters**  
Input: n {Integer}
Input: arr {Array of Integers}    
Output: {Array of Integers}

**Constraints**  
Time: O(N)  
Space: O(N)

**Examples**  
`4, [1, 4, 2] --> [3]`  
`8, [4, 7, 1, 6] --> [2, 3, 5, 8]`  
`6, [6, 4, 2, 1] --> [3, 5]`


## 5. Letter Sort

*Given a string of letters, return the letters in sorted order.*

**Parameters**  
Input: str {String}  
Output: {String}

**Constraints**  
Time: O(N)  
Space: O(1)

**Examples**  
`hello --> ehllo`  
`whiteboard --> abdehiortw`  
`one --> eno`


## 6. Character Mode

*Given a string, find the most frequent occurring letter(s) in the string*

**Parameters**
Input: str {String}    
Output: {String}

**Constraints**
If more than one letter is tied for the most frequent, return a string of all the letters in one string.

Time: O(N)  
Space: O(N)

**Examples**  
`'hello' --> 'l'`  
`'A walk in the park' --> 'a'`  
`'noon' --> 'no'`  

## 7. Sort Digits

*Given an integer, soft the digits in ascending order and return the new integer. Ignore leading zeros.*

**Parameters**  
Input: num {Integer}    
Output: {Integer}

**Constraints**  
Do not convert the integer into a string or other data type.

Time: O(N) where N is the number of digits.  
Space: O(1)

**Examples**  
`8970 --> 789`  
`32445 --> 23445`  
`10101 --> 111`

## 8. Get Duplicates

*Given an array of values, return only the values that have duplicates in the array*

**Parameters**  
Input: arr {Array}    
Output: {Array}

**Constraints**  
Time: O(N)  
Space: O(N)

**Examples**  
`[1, 2, 4, 2] --> [2]`  
`[3, 2, 3, 2, 3, 3, 4] --> [3, 2]`  
`[1, 2, 3, 4] --> []`  


## 9. Anagram Pair

*Given two strings, determine if the strings are anagrams of one another.*

Two words are anagrams of one another if they contain the same letters.

**Parameters**  
Input: str1 {String}  
Input: str2 {String}  
Output: {Boolean}

**Constraints**  
With N as the length of the first string, and M as the length of the second string.

Time: O(N)  
Space: O(N)

**Examples**  
`"cat", "act" --> true`  
`"cat", "dog" --> false`  
`"racecar", "aaccrres" --> false`


## 10. Anagram Palindrome

*Given a string, determine if the string can be rearranged to form a palindrome.*

A palindrome is a word that is the same as its reversed. For example: "racecar" and "noon" are palindromes because they match their reversed version respectively. On the other hand, "cat" is not a palindrome because "cat" does not equal "tac".

**Parameters**  
Input: str {String}    
Output: {Boolean}

**Constraints**  

Assume the string only contains lowercase letters and no spaces.

Time: O(N)  
Space: O(1)

**Examples**  
`"carrace" --> true ("carrace" can be rearranged to "racecar")`  
`"cat" --> false`
