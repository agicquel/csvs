import pandas as pd
pd.options.mode.chained_assignment = None

def len_csvs(obj):
	if hasattr(obj, '__len__'):
		return len(obj)
	else:
		return 1

csv = pd.read_csv('./deniro.csv')
csv = csv.iloc[1:5, 1:5]
print(str(csv))
col1 = csv.columns[1]
i = 0
size = len_csvs(csv.loc[1])
csv.iloc[-1] = None 
next = (len_csvs(csv.index) - 1)
print(str(next))
while i < size:
	col1 = csv.columns[i]
	print(str(col1))
	csv[col1][next] = "test"
	i = i + 1

csv[str(len(csv.columns)+1)] = None
lastCol = "toto"
csv.rename(columns = {csv.columns[(len_csvs(csv.columns) - 1)]:lastCol}, inplace = True)
i = 0
while i < (len_csvs(csv.index) - 1):
	csv[lastCol][i] = "test2"
	i = i + 1

csv.to_csv(r'./deniro2.csv', index=False)
