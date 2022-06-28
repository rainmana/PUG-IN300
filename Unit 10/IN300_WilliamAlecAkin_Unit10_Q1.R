# W. Alec Akin
# IN300 Programmging for Data Analysis (R, Python, Java)
# Dr. Robert Kayl
# June 27th, 2022
# Unit 10 Assignment - R Source Code
# Description: Using R, print the resulting row of malicious traffic as shown below,
# where the frequency is more than 100. Use the columns Source, Destination, Protocol,
# length, and info, as well as the frequency of occurrence. You know that the protocols
# starting with alphabetical characters is known good. HINT: The SQLDF library can be useful.
# Others are allowed as well.
# |----------------------------------------------------------------------------------------|
# |      Source       |      Destination    |    Protocol  | Length |   Info      |  Freq  |
# | 00:28:00:01:00:00 | 02:00:00:00:45:00   |    0x4006    | 44     | Ethernet II | 7536   |
# |----------------------------------------------------------------------------------------|

# Import required libraries
library(sqldf)

# Read in the file
# Use absolute path so as to avoid errors
data <- read.csv("/Users/alec/Development/PUG-IN300/Unit 10/IN300_Dataset1.csv")

# Print the results
# Print the frequency of each combination
# Filter the valid packets and return specifically %0%
# Filter to only display frequences of n > 100
print(sqldf("SELECT Source, Destination, Protocol, Length, Info, COUNT(*) as Freq
            FROM data
            --WHERE Protocol LIKE ('%0%')
            GROUP BY Source, Destination, Protocol, Length, Info
            HAVING Freq > 100
            ORDER BY Freq DESC
            Limit 1"))
