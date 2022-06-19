# William Alec Akin
# IN300 - Programming for Data Analysis
# Unit 6 - R Source Code
# Dr. Robert Kayl
# Description: Read in a CSV file using the read.csv data type.
# Print the row number, source IP and destination IP of each line.

# Read in the CSV as assign it to the data variable
data <- read.csv("/Users/alec/Development/PUG-IN300/Unit 6/IN300_Dataset1.csv")

# Print the row, source, and distation IPs in the data frame
print(paste("Row: ", data[,1], " Source IP: ", data[,3], " Destination IP: ", data[,4]))