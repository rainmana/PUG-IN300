'''William Alec Akin
Purdue University Global
IN300 - Programming for Data Analysis (Python, R, Java)
Dr. Robert Kayl
Unit 10 Assignment - Python Source Code
June 27th, 2022

Description: Using Python, print the malicious traffic as show in item 1 below and having a frequency count of
more than 100. Use the columns "Source", "Destination", "Protocol", "Length", "Info", and "Frequency" of each
result in the dataset. Filter out the good traffic that has protocols starting with alphabetical characters.

|--------------------------------------------------------------------------------------------------------------------|
|      Source       |      Destination    |    Protocol  | Length |   Info      |  Freq  |
| 00:28:00:01:00:00 | 02:00:00:00:45:00   |    0x4006    | 44     | Ethernet II | 7536   |
|--------------------------------------------------------------------------------------------------------------------|
'''

# Import required libraries
import pandas as pd

# Define the file path
# Use absolute path to avoid errors
data = '/Users/alec/Development/PUG-IN300/Unit 10/IN300_Dataset1.csv'

# Read the file contents into a pandas dataframe
nd = pd.read_csv(data)

# Group data by the combined column values
# The size() function gets occurrences
# The nlargest(1) function filters out all other output we don't need
result = nd.groupby(["Source", "Destination", "Protocol", "Length", "Info"]).size().nlargest(1)

# Print the result to standard out
print(result)