import pandas as pd
pd.options.mode.chained_assignment = None

def len_csvs(obj):
	if hasattr(obj, '__len__'):
		return len(obj)
	else:
		return 1

csv = pd.read_csv('./deniro.csv')
csv2 = pd.read_csv('./deniro2.csv')
csv = pd.concat([csv, csv2])
csv.to_csv(r'./deniro3.csv', index=False)
