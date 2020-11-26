import pandas as pd
pd.options.mode.chained_assignment = None

def len_csvs(obj):
	if hasattr(obj, '__len__'):
		return len(obj)
	else:
		return 1

csv = pd.read_csv('./deniro.csv')
print(str(csv))
print(str("Hello"))
calcul = 1 + 2
print(str(calcul))
i = 0
if i >= 0:
	print(str("yes"))

