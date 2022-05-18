# William Alec Akin
# Purdue University Global
# IN300 - Programming for Data Analysis (Python, R, Java)
# Dr. Robert Kayl
# Unit 3 Assignment - R Vector Source Code
# May 17, 2022


# Descritption: Write an R program that uses a Vector, input the values below and print the results.

## locomotive1=steam
## locomotive2=diesel
## locomotive3=electric
## locomotive4=coal
## locomotive5=wood
## common=combined engines

# Use a vector to store the locomotive types and the common type
trains = c(locomotive1="steam", locomotive2="diesel", locomotive3="electric", locomotive4="coal", locomotive5="wood", common="combined engines")

# Loop through the vector and print to stdout
for (key in names(trains)) {
    value <- trains[key]
    print(paste(key, "=", value))
}