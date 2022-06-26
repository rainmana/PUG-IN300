# W. Alec Akin
# IN300 Programmging for Data Analysis (R, Python, Java)
# Dr. Robert Kayl
# Unit 7 Assignment - R Source Code
# Description: Write an R program that reads the text file into a data frame.
# Using that data frame, print the mean, median, mode, average deviation,
# and standard deviation. Ensure that each output is labeled.

# Read in the IN300_Dataset2.txt file
data <- scan("/Users/alec/Development/PUG-IN300/Unit 7/IN300_Dataset2.txt")

# Print the mean to stdout
print(paste("The mean of the data is: ", mean(data)))

# Print the median of the data
print(paste("The media of the data is: ", median(data)))

# Create a function to get the mode of the data
getmode <- function(v) {
  uniqv <- unique(v)
  uniqv[which.max(tabulate(match(v, uniqv)))]
}

# Print the mode to stdout
mode <- getmode(data)
print(paste("The mode of the data is: ", mode))

# Print the standard deviatino to stdout
print(paste("The standard deviation of the data is: ", sd(data)))

# Print the average deviation of the data to stdout
print(paste("The average deviations is: ", sum(abs(data - mean(data))) / length(data)))