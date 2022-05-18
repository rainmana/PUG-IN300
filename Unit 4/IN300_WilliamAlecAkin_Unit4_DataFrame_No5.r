# William Alec Akin
# Purdue University Global
# IN300 - Programming for Data Analysis (Python, R, Java)
# Dr. Robert Kayl
# Unit 4 Assignment - R Data Frame Source Code
# May 17, 2022

# Description: Using R, create a data frame using the following data:

## 1. SOURCE_IP: 209.99.66.22, 209.99.66.100, 192.168.1.3
## 2. DEST_IP: 192.168.0.12, 209.99.66.222, 192.168.0.44
## 3. PROTOCOL: UDP, ICMP, TCP
## 4. INFO: LEN=1068, Destination Unreachable, Len=128

# Next, subset the SOURCE_IP as a list

# Subset the SOURCE_IP and DEST_IP as a matrix

# Finally, filter the PROTOCOL row to see if UDP is in it.

# Print the output of each change/action above to stdout.


# Create the data frame as described above
packets <- data.frame(SOURCE_IP = c("209.99.66.22", "209.99.66.100", "192.168.1.3"),
DEST_IP = c("192.168.0.12", "209.99.66.222", "192.168.0.44"),
PROTOCOL = c("UDP", "ICMP", "TCP"),
INFO = c("LEN=1068", "Destination Unreachable", "Len=128"))

# Print the output of the dataframe
print("The output of the data frame is: ")
print(packets)
cat("\n")

# Print the source IP
source_list <- packets[1]
print("The source IP list is: ")
print(source_list)
cat("\n")

# Slice the data frame and print the source and destination IPs
source_dest_matrix <- packets[c("SOURCE_IP", "DEST_IP")]
print("The source/destination IP matrix subset is: ")
print(source_dest_matrix)
cat("\n")

# Check if UDP is in the protocol row
print("Test to see if UDP is in the protocol row of the data frame: ")
print(packets$PROTOCOL == "UDP")
cat("\n")