# W. Alec Akin
# IN300 Programmging for Data Analysis (R, Python, Java)
# Dr. Robert Kayl
# Unit 8 Assignment 1 - R Source Code
# Description: Write an R program using the ggplot2 library to print a scatter
# plot of count_female and count_male columns in the following file:
# "Demographic_Statistics_By_Zip_Code.csv" dataset.

# Import required libraries
library(ggplot2)

# Read in the "Demographic_Statistics_By_Zip_Code.csv" file
# Absolute path seems to be required
data <- read.csv("/Users/alec/Development/PUG-IN300/Unit 8/Demographic_Statistics_By_Zip_Code.csv")

# Print the scatter plot
# Note that output can vary depending on parameters used
print(qplot(COUNT.FEMALE, COUNT.MALE, data=data, geom=c("point", "smooth")))