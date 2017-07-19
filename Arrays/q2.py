import sys

def isPermutation(s, t):
	if not len(s) == len(t):
		return False
	d = [0]*128
	for c in s:
		d[ord(c)] += 1
	for c in t:
		d[ord(c)] -= 1
		if d[ord(c)] < 0:
			return False
	return True

def main():
	s = raw_input().strip()
	t = raw_input().strip()
	if isPermutation(s,t):
		print "YES"
	else:
		print "NO"

main()
