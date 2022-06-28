# W. Alec Akin
# IN300 Programmging for Data Analysis (R, Python, Java)
# Dr. Robert Kayl
# Unit 9 Assignment - R Source Code
# Description: Write an R program that shows the frequency of each individual column below:
# 1. Source IP and freq count in desc order
# 2. Dest IP and freq count in desc order
# 3. Protocol and freq count in desc order

# Read in the CSV Data
# Use absolute path to avoid issues
data <- read.csv("/Users/alec/Development/PUG-IN300/Unit 9/IN300_Dataset1.csv")

# Create a function to sort the data
print_sorted_output <- function(temp_T) {
  tempSort <- rev(sort(table(temp_T)))
  return(tempSort)
}

# Print the count for the source IPs
print("Source IP")
print(print_sorted_output(data$Source))

# Print the count for the destination IPs
print("Destination IP")
print(print_sorted_output(data$Destination))

# Print the count for protocol
print("Protocol")
print(print_sorted_output(data$Protocol))