'''
Q - 8: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
column are set to 0.
'''

def convertMatrix(a,r,c):
	rows = []
	cols = []
	for i in range(len(a)):
		for j in range(len(a[0])):
			if a[i][j] == 0:
				rows.append(i)
				cols.append(j)
	for i in range(len(a)):
		for j in range(len(a[0])):
			if i in rows or j in cols:
				a[i][j] = 0

a = [[1,2,3,4],[1,2,0,4],[9,0,3,5],[7,4,5,1],[0,2,4,1]]

print a

convertMatrix(a,5,4)

#the value of a in changed as it is paased by reference in python as well
print a
