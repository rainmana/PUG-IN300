'''William Alec Akin
Purdue University Global
IN300 - Programming for Data Analysis (Python, R, Java)
Dr. Robert Kayl
Unit 4 Assignment - Python Dictionary Source Code
May 17, 2022'''

'''Description: Using Python, create a dictionary with the following specifics:

1. SOURCE_IP: 209.99.66.22
2. DEST_IP: 192.168.0.12
3. PROTOCOL: UDP
4. INFO: LEN=1068

Loop through the dictionary and print the key:value pairs.'''

# Create the dictionary based on the description above
protocolDict = {"Source IP": "209.99.66.22", "DEST IP": "192.168.0.12", "PROTOCOL": "UDP", "INFO": "LEN=1068"}

# Loop through the dictionary and print the key:value pairs
for i in protocolDict:
    print("Key " + i + " : value: " + protocolDict.get(i))