# William Alec Akin
# Purdue University Global
# IN300 - Programming for Data Analysis (Python, R, Java)
# Dr. Robert Kayl
# Unit 3 Assignment - R Vector Source Code
# May 17, 2022


# Descritption: Using R, create a matrix with six rows using the data below.
# Label the column header with "Train Type."

## locomotive1=steam
## locomotive2=diesel
## locomotive3=electric
## locomotive4=coal
## locomotive5=wood
## common=combined engines

# Fill the six row matrix with the data described above
trainMatrix <- matrix(c(locomotive1 = "steam", locomotive2 = "diesel", locomotive3 = "electric",
locomotive4 = "coal", locomotive5 = "wood", common = "combined engines"), nrow = 6)

# Define the row list and column header with Train Type (locomotive'n')
dimnames(trainMatrix) <- list(c("locomotive1", "locomotive2", "locomotive3",
"locomotive4", "locomotive5", "common"), c("Train Type"))

# Print the matrix to stdout
print(trainMatrix)