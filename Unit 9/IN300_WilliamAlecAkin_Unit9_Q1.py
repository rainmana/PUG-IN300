'''William Alec Akin
Purdue University Global
IN300 - Programming for Data Analysis (Python, R, Java)
Dr. Robert Kayl
Unit 9 Assignment - Python Source Code
June 27th, 2022

Desscription: Write a Python program that shows the frequency of each inidividual column from "IN300_Dataset1.csv" below:
1. Source IP and frequency count in descending order
2. Destination IP and frequency count in descending order
3. Protocol and frequency count in descending order

'''

# Import necessary libraries
import pandas as pd

# Define function to print the results
def printResults (message, value):
    print("\n\n")
    print(message)
    print()
    print(value)

# Set the file path
# Use abosolute path to avoid errors
data = '/Users/alec/Development/PUG-IN300/Unit 9/IN300_Dataset1.csv'


# Read the data into a dataframe
nd = pd.read_csv(data)

# Print the source IP frequency counts
printResults("Source IP", nd['Source'].value_counts())

# Print the destination IP frequency counts
printResults("Destination IP", nd['Destination'].value_counts())

# Print the protocol frequency counts
printResults("Protocol", nd['Protocol'].value_counts())