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
