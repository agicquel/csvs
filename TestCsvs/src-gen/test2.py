import pandas as pd
csv = pd.read_csv('./deniro.csv')
# index = 0
# while index < len(csv["Year"]):
# 	print(str("index = "))
# 	print(str(index))
# 	print(str("    "))
# 	if csv.at[index, "Year"] >= 2000:
# 		csv.at[index, "Year"] = csv.at[index, "Year"] - 2000
	
# 	else:
# 		csv.at[index, "Year"] = csv.at[index, "Year"] - 1900
# 	index = index + 1

# csv.to_csv(r'./deniro2.csv', index=False)

print(csv[csv.columns[2]][2])