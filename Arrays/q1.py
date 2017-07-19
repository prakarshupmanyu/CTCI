'''
Q1 - Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?
'''

import sys

def isUniqueChars(s):
	if len(s) > 128:
		return False
	dic = {}
	for i in s:
		if i in dic:
			return False
		dic[i] = 1
	return True

def main():
	s = raw_input().strip()
	if isUniqueChars(s):
		print "YES"
	else:
		print "NO"

main()
