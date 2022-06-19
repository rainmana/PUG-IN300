'''William Alec Akin
Purdue University Global
IN300 - Programming for Data Analysis (Python, R, Java)
Dr. Robert Kayl
Unit 6 Assignment - Python CSV Read/Pandas Source Code
June 19th, 2022'''

'''Description: Write a Python program that reads a CSV file into a Panda dataframe. 
Using that dataframe, print the following for each line and as a table to standard out:
1. Row (number)
2. Source IP
3. Destination IP

'''

# Import the pandas library
import pandas as pd
import sys


# Define an if/elif function inside of a try/except block to read the CSV file in as a command line argumment
# If no command argument for a file is passed, default to a local file
# If nothing is passed or found, or print an error if no file is found
try:
    # Begin IF statement to try to read the CSV file in as a command line argument
    if len(sys.argv) > 1:
        # Read the CSV file in as a command line argument
        csv_file = sys.argv[1]

    # Begin ELIF statement to try to read the CSV file in as a local file
    elif len(sys.argv) == 1:
        # Read the CSV file in as a local file
        csv_file = "IN300_Dataset1.csv"

# Use except to print an error if both fail above
except:
    # Print an error if no file is found
    print("Error: No file found. Please pass a filename as a command line argument or use a local file.")


# Convert csv_file to a dataframe
df = pd.read_csv(csv_file)


# Print the row number, source, and destination IP of each row
results = df[['No.', 'Source', 'Destination']]
print(results)