# W. Alec Akin
# IN300 Programmging for Data Analysis (R, Python, Java)
# Dr. Robert Kayl
# Unit 8 Assignment 1 - R Source Code
# Description: Wrte an R program using the corrgram library to plot the
# "Average_Daily_Traffic_Counts.csv" file. Use the lower.panel=panel.conf,
# uppoer.panel=panel.pts settings for the plot

# Import required libraries
library(corrgram)

# Read in the CSV file "Average_Daily_Traffic_Counts.csv"
# Absolute path may be required
traffic <- read.csv("/Users/alec/Development/PUG-IN300/Unit 8/Average_Daily_Traffic_Counts.csv")

# Print the corrgram
print(corrgram(traffic, lower.panel=panel.conf, upper.panel=panel.pts))
